package io.openems.impl.device.system.esscluster;

import java.util.HashSet;
import java.util.Set;

import io.openems.api.channel.ConfigChannel;
import io.openems.api.device.nature.DeviceNature;
import io.openems.api.doc.ConfigInfo;
import io.openems.api.exception.OpenemsException;
import io.openems.impl.protocol.system.SystemDevice;

public class EssCluster extends SystemDevice {

	@ConfigInfo(title = "EssCluster", description = "Sets the cluster nature.", type = EssClusterNature.class)
	public final ConfigChannel<EssClusterNature> cluster = new ConfigChannel<>("cluster", this);

	public EssCluster() throws OpenemsException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Set<DeviceNature> getDeviceNatures() {
		Set<DeviceNature> natures = new HashSet<>();
		if (cluster.valueOptional().isPresent()) {
			natures.add(cluster.valueOptional().get());
		}
		return natures;
	}

}