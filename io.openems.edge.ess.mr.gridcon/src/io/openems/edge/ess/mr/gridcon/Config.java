package io.openems.edge.ess.mr.gridcon;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition( //
		name = "ESS MR Gridcon PCS", //
		description = "Implements the FENECON MR Gridcon PCS system")
@interface Config {
	String service_pid();

	String id() default "ess0";

	boolean enabled() default true;

	@AttributeDefinition(name = "Modbus-ID", description = "ID of Modbus brige.")
	String modbus_id();

	@AttributeDefinition(name = "Modbus-Unit-ID", description = "Unit ID of Modbus brige.")
	int unit_id() default 1;

	@AttributeDefinition(name = "Battery-ID1", description = "ID of Battery 1.")
	String battery1_id();

	@AttributeDefinition(name = "Battery-ID2", description = "ID of Battery 2.")
	String battery2_id();

	@AttributeDefinition(name = "Battery-ID3", description = "ID of Battery 3.")
	String battery3_id();

	@AttributeDefinition(name = "Grid-Meter-ID", description = "ID of Grid-Meter")
	String meter() default "meter0";

	@AttributeDefinition(name = "NA-Protection Relais 1 (K1)", description = "Address of the NA-Protection Relais 1 channel.")
	String inputNAProtection1();

	@AttributeDefinition(name = "NA-Protection Relais 2 (K2)", description = "Address of the NA-Protection Relais 2 channel.")
	String inputNAProtection2();

	@AttributeDefinition(name = "Sync-Device Bridge Input (K3)", description = "Address of the Sync-Device Bridge Contact Input channel.")
	String inputSyncDeviceBridge();

	@AttributeDefinition(name = "Sync-Device Bridge Output (K3)", description = "Address of the Sync-Device Bridge Contact Output channel.")
	String outputSyncDeviceBridge();

	@AttributeDefinition(name = "MR Hard Reset Output (K4)", description = "Address of the MR Hard Reset Output Output channel.")
	String outputMRHardReset();

	@AttributeDefinition(name = "Modbus target filter", description = "This is auto-generated by 'Modbus-ID'.")
	String Modbus_target() default "";

	@AttributeDefinition(name = "Battery 1 target filter", description = "This is auto-generated by 'Battery-ID1'.")
	String battery1_target() default "";

	@AttributeDefinition(name = "Battery 2 target filter", description = "This is auto-generated by 'Battery-ID2'.")
	String battery2_target() default "";

	@AttributeDefinition(name = "Battery 3 target filter", description = "This is auto-generated by 'Battery-ID3'.")
	String battery3_target() default "";

	String webconsole_configurationFactory_nameHint() default "ESS MR Gridcon PCS [{id}]";
}