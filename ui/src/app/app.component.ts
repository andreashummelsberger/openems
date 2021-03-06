import { Component, OnInit, OnDestroy } from '@angular/core';
import { Subject } from 'rxjs';
import { takeUntil } from 'rxjs/operators';
import { ToasterService } from 'angular2-toaster';
import { filter } from 'rxjs/operators';

import { Platform, PopoverController, ToastController, IonicModule } from '@ionic/angular';
import { SplashScreen } from '@ionic-native/splash-screen/ngx';
import { StatusBar } from '@ionic-native/status-bar/ngx';

import { environment } from '../environments';
import { Service, Websocket } from './shared/shared';

import { PopoverPage } from './shared/popover/popover.component';
import { Router, NavigationEnd } from '@angular/router';
import { SpinnerDialog } from '@ionic-native/spinner-dialog/ngx';

@Component({
  selector: 'app-root',
  templateUrl: 'app.component.html'
})
export class AppComponent {
  public env = environment;
  public backUrl: string | boolean = '/';

  private ngUnsubscribe: Subject<void> = new Subject<void>();

  constructor(
    private platform: Platform,
    private splashScreen: SplashScreen,
    private statusBar: StatusBar,
    public websocket: Websocket,
    public service: Service,
    private popoverController: PopoverController,
    public router: Router,
    public toastController: ToastController
  ) {
    // this.initializeApp();
    service.setLang('de');
  }

  initializeApp() {
    this.platform.ready().then(() => {
      this.statusBar.styleDefault();
      this.splashScreen.hide();
    });
  }

  ngOnInit() {
    this.service.notificationEvent.pipe(takeUntil(this.ngUnsubscribe)).subscribe(async notification => {
      const toast = await this.toastController.create({
        message: notification.message,
        showCloseButton: true,
        position: 'top',
        closeButtonText: 'Ok',
        duration: 2000
      });
      toast.present();
    });


    document.addEventListener("backbutton", (ev: Event) => { this.onBackDown(); }, false);
    // set initial backUrl
    this.updateBackUrl(window.location.pathname);
    // update backUrl on navigation events
    this.router.events.pipe(
      takeUntil(this.ngUnsubscribe),
      filter(event => event instanceof NavigationEnd)
    ).subscribe(event => {
      let url = (<NavigationEnd>event).urlAfterRedirects;
      this.updateBackUrl(url);
    })
  }
  onBackDown() {

    if (window.location.pathname === '/index') {
      navigator['app'].exitApp();
    }
    else { this.router.navigate([this.backUrl]); }

  };
  updateBackUrl(url: string) {
    // disable backUrl on initial 'index' page
    if (url === '/index') {
      this.backUrl = false;
      return;
    }

    let urlArray = url.split('/');
    let backUrl: string | boolean = '/';
    let file = urlArray.pop();

    // disable backUrl to first 'index' page from Edge index if there is only one Edge in the system
    if (file === 'index' && urlArray.length == 3 && this.env.backend === "OpenEMS Edge") {
      this.backUrl = false;
      return;
    }

    // remove one part of the url for 'index'
    if (file === 'index') {
      urlArray.pop();
    }
    // re-join the url
    backUrl = urlArray.join('/') || '/';

    // correct path for '/device/[edgeName]/index'
    if (backUrl === '/device') {
      backUrl = '/';
    }
    this.backUrl = backUrl;
  }

  ngOnDestroy() {
    this.ngUnsubscribe.next();
    this.ngUnsubscribe.complete();
  }

  //Presents Popovermenu for Navbar
  async presentPopover(event: any) {
    const popover = await this.popoverController.create({
      component: PopoverPage,
      event: event,
      translucent: false
    });
    return await popover.present();
  }



}
