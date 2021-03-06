package io.openems.edge.ess.mr.gridcon.enums;

import io.openems.edge.common.channel.doc.Doc;
import io.openems.edge.common.channel.doc.Unit;

//TODO Is this implemented according SunSpec?
/**
 * This enum holds every possible channel id for a gridcon.
 */
public enum GridConChannelId implements io.openems.edge.common.channel.doc.ChannelId {
	PCS_CCU_STATE_IDLE(new Doc()),
	PCS_CCU_STATE_PRECHARGE(new Doc()),
	PCS_CCU_STATE_STOP_PRECHARGE(new Doc()),
	PCS_CCU_STATE_READY(new Doc()),
	PCS_CCU_STATE_PAUSE(new Doc()),
	PCS_CCU_STATE_RUN(new Doc()),
	PCS_CCU_STATE_ERROR(new Doc()),
	PCS_CCU_STATE_VOLTAGE_RAMPING_UP(new Doc()),
	PCS_CCU_STATE_OVERLOAD(new Doc()),
	PCS_CCU_STATE_SHORT_CIRCUIT_DETECTED(new Doc()),
	PCS_CCU_STATE_DERATING_POWER(new Doc()),
	PCS_CCU_STATE_DERATING_HARMONICS(new Doc()),
	PCS_CCU_STATE_SIA_ACTIVE(new Doc()),
	PCS_CCU_ERROR_CODE(new Doc().unit(Unit.NONE)),
	PCS_CCU_VOLTAGE_U12(new Doc().unit(Unit.VOLT)),
	PCS_CCU_VOLTAGE_U23(new Doc().unit(Unit.VOLT)),
	PCS_CCU_VOLTAGE_U31(new Doc().unit(Unit.VOLT)),
	PCS_CCU_CURRENT_IL1(new Doc().unit(Unit.AMPERE)),
	PCS_CCU_CURRENT_IL2(new Doc().unit(Unit.AMPERE)),
	PCS_CCU_CURRENT_IL3(new Doc().unit(Unit.AMPERE)),
	/**
	 * active power
	 */
	PCS_CCU_POWER_P(new Doc().unit(Unit.WATT)),
	/**
	 * reactive power
	 */
	PCS_CCU_POWER_Q(new Doc().unit(Unit.VOLT_AMPERE_REACTIVE)),
	PCS_CCU_FREQUENCY(new Doc().unit(Unit.HERTZ)),

	PCS_IPU_1_STATUS_STATUS_STATE_MACHINE(new Doc().options(StatusIPUStateMachine.values())),
	PCS_IPU_1_STATUS_STATUS_MCU(new Doc().options(StatusIPUStatusMCU.values())),
	PCS_IPU_1_STATUS_FILTER_CURRENT(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_1_STATUS_DC_LINK_POSITIVE_VOLTAGE(new Doc().unit(Unit.VOLT)),
	PCS_IPU_1_STATUS_DC_LINK_NEGATIVE_VOLTAGE(new Doc().unit(Unit.VOLT)),
	PCS_IPU_1_STATUS_DC_LINK_CURRENT(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_1_STATUS_DC_LINK_ACTIVE_POWER(new Doc().unit(Unit.WATT)),
	PCS_IPU_1_STATUS_DC_LINK_UTILIZATION(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_1_STATUS_FAN_SPEED_MAX(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_1_STATUS_FAN_SPEED_MIN(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_1_STATUS_TEMPERATURE_IGBT_MAX(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_1_STATUS_TEMPERATURE_MCU_BOARD(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_1_STATUS_TEMPERATURE_GRID_CHOKE(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_1_STATUS_TEMPERATURE_INVERTER_CHOKE(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_1_STATUS_RESERVE_1(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_1_STATUS_RESERVE_2(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_1_STATUS_RESERVE_3(new Doc().unit(Unit.DEGREE_CELSIUS)),

	PCS_IPU_2_STATUS_STATUS_STATE_MACHINE(new Doc().options(StatusIPUStateMachine.values())),
	PCS_IPU_2_STATUS_STATUS_MCU(new Doc().options(StatusIPUStatusMCU.values())),
	PCS_IPU_2_STATUS_FILTER_CURRENT(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_2_STATUS_DC_LINK_POSITIVE_VOLTAGE(new Doc().unit(Unit.VOLT)),
	PCS_IPU_2_STATUS_DC_LINK_NEGATIVE_VOLTAGE(new Doc().unit(Unit.VOLT)),
	PCS_IPU_2_STATUS_DC_LINK_CURRENT(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_2_STATUS_DC_LINK_ACTIVE_POWER(new Doc().unit(Unit.WATT)),
	PCS_IPU_2_STATUS_DC_LINK_UTILIZATION(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_2_STATUS_FAN_SPEED_MAX(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_2_STATUS_FAN_SPEED_MIN(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_2_STATUS_TEMPERATURE_IGBT_MAX(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_2_STATUS_TEMPERATURE_MCU_BOARD(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_2_STATUS_TEMPERATURE_GRID_CHOKE(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_2_STATUS_TEMPERATURE_INVERTER_CHOKE(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_2_STATUS_RESERVE_1(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_2_STATUS_RESERVE_2(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_2_STATUS_RESERVE_3(new Doc().unit(Unit.DEGREE_CELSIUS)),

	PCS_IPU_3_STATUS_STATUS_STATE_MACHINE(new Doc().options(StatusIPUStateMachine.values())),
	PCS_IPU_3_STATUS_STATUS_MCU(new Doc().options(StatusIPUStatusMCU.values())),
	PCS_IPU_3_STATUS_FILTER_CURRENT(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_3_STATUS_DC_LINK_POSITIVE_VOLTAGE(new Doc().unit(Unit.VOLT)),
	PCS_IPU_3_STATUS_DC_LINK_NEGATIVE_VOLTAGE(new Doc().unit(Unit.VOLT)),
	PCS_IPU_3_STATUS_DC_LINK_CURRENT(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_3_STATUS_DC_LINK_ACTIVE_POWER(new Doc().unit(Unit.WATT)),
	PCS_IPU_3_STATUS_DC_LINK_UTILIZATION(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_3_STATUS_FAN_SPEED_MAX(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_3_STATUS_FAN_SPEED_MIN(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_3_STATUS_TEMPERATURE_IGBT_MAX(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_3_STATUS_TEMPERATURE_MCU_BOARD(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_3_STATUS_TEMPERATURE_GRID_CHOKE(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_3_STATUS_TEMPERATURE_INVERTER_CHOKE(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_3_STATUS_RESERVE_1(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_3_STATUS_RESERVE_2(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_3_STATUS_RESERVE_3(new Doc().unit(Unit.DEGREE_CELSIUS)),

	PCS_IPU_4_STATUS_STATUS_STATE_MACHINE(new Doc().options(StatusIPUStateMachine.values())),
	PCS_IPU_4_STATUS_STATUS_MCU(new Doc().options(StatusIPUStatusMCU.values())),
	PCS_IPU_4_STATUS_FILTER_CURRENT(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_4_STATUS_DC_LINK_POSITIVE_VOLTAGE(new Doc().unit(Unit.VOLT)),
	PCS_IPU_4_STATUS_DC_LINK_NEGATIVE_VOLTAGE(new Doc().unit(Unit.VOLT)),
	PCS_IPU_4_STATUS_DC_LINK_CURRENT(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_4_STATUS_DC_LINK_ACTIVE_POWER(new Doc().unit(Unit.WATT)),
	PCS_IPU_4_STATUS_DC_LINK_UTILIZATION(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_4_STATUS_FAN_SPEED_MAX(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_4_STATUS_FAN_SPEED_MIN(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_4_STATUS_TEMPERATURE_IGBT_MAX(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_4_STATUS_TEMPERATURE_MCU_BOARD(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_4_STATUS_TEMPERATURE_GRID_CHOKE(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_4_STATUS_TEMPERATURE_INVERTER_CHOKE(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_4_STATUS_RESERVE_1(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_4_STATUS_RESERVE_2(new Doc().unit(Unit.DEGREE_CELSIUS)),
	PCS_IPU_4_STATUS_RESERVE_3(new Doc().unit(Unit.DEGREE_CELSIUS)),

	PCS_IPU_1_DC_DC_MEASUREMENTS_VOLTAGE_STRING_A(new Doc().unit(Unit.VOLT)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_VOLTAGE_STRING_B(new Doc().unit(Unit.VOLT)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_VOLTAGE_STRING_C(new Doc().unit(Unit.VOLT)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_CURRENT_STRING_A(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_CURRENT_STRING_B(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_CURRENT_STRING_C(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_POWER_STRING_A(new Doc().unit(Unit.KILOWATT)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_POWER_STRING_B(new Doc().unit(Unit.KILOWATT)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_POWER_STRING_C(new Doc().unit(Unit.KILOWATT)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_UTILIZATION_STRING_A(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_UTILIZATION_STRING_B(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_UTILIZATION_STRING_C(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_ACCUMULATED_SUM_DC_CURRENT(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_ACCUMULATED_DC_UTILIZATION(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_RESERVE_1(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_1_DC_DC_MEASUREMENTS_RESERVE_2(new Doc().unit(Unit.PERCENT)),

	PCS_IPU_2_DC_DC_MEASUREMENTS_VOLTAGE_STRING_A(new Doc().unit(Unit.VOLT)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_VOLTAGE_STRING_B(new Doc().unit(Unit.VOLT)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_VOLTAGE_STRING_C(new Doc().unit(Unit.VOLT)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_CURRENT_STRING_A(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_CURRENT_STRING_B(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_CURRENT_STRING_C(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_POWER_STRING_A(new Doc().unit(Unit.KILOWATT)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_POWER_STRING_B(new Doc().unit(Unit.KILOWATT)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_POWER_STRING_C(new Doc().unit(Unit.KILOWATT)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_UTILIZATION_STRING_A(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_UTILIZATION_STRING_B(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_UTILIZATION_STRING_C(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_ACCUMULATED_SUM_DC_CURRENT(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_ACCUMULATED_DC_UTILIZATION(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_RESERVE_1(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_2_DC_DC_MEASUREMENTS_RESERVE_2(new Doc().unit(Unit.PERCENT)),

	PCS_IPU_3_DC_DC_MEASUREMENTS_VOLTAGE_STRING_A(new Doc().unit(Unit.VOLT)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_VOLTAGE_STRING_B(new Doc().unit(Unit.VOLT)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_VOLTAGE_STRING_C(new Doc().unit(Unit.VOLT)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_CURRENT_STRING_A(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_CURRENT_STRING_B(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_CURRENT_STRING_C(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_POWER_STRING_A(new Doc().unit(Unit.KILOWATT)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_POWER_STRING_B(new Doc().unit(Unit.KILOWATT)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_POWER_STRING_C(new Doc().unit(Unit.KILOWATT)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_UTILIZATION_STRING_A(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_UTILIZATION_STRING_B(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_UTILIZATION_STRING_C(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_ACCUMULATED_SUM_DC_CURRENT(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_ACCUMULATED_DC_UTILIZATION(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_RESERVE_1(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_3_DC_DC_MEASUREMENTS_RESERVE_2(new Doc().unit(Unit.PERCENT)),

	PCS_IPU_4_DC_DC_MEASUREMENTS_VOLTAGE_STRING_A(new Doc().unit(Unit.VOLT)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_VOLTAGE_STRING_B(new Doc().unit(Unit.VOLT)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_VOLTAGE_STRING_C(new Doc().unit(Unit.VOLT)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_CURRENT_STRING_A(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_CURRENT_STRING_B(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_CURRENT_STRING_C(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_POWER_STRING_A(new Doc().unit(Unit.KILOWATT)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_POWER_STRING_B(new Doc().unit(Unit.KILOWATT)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_POWER_STRING_C(new Doc().unit(Unit.KILOWATT)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_UTILIZATION_STRING_A(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_UTILIZATION_STRING_B(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_UTILIZATION_STRING_C(new Doc().unit(Unit.PERCENT)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_ACCUMULATED_SUM_DC_CURRENT(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_ACCUMULATED_DC_UTILIZATION(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_RESERVE_1(new Doc().unit(Unit.AMPERE)),
	PCS_IPU_4_DC_DC_MEASUREMENTS_RESERVE_2(new Doc().unit(Unit.PERCENT)),

	PCS_COMMAND_CONTROL_WORD(new Doc().unit(Unit.NONE)),
	PCS_COMMAND_CONTROL_WORD_PLAY(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_READY(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_ACKNOWLEDGE(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_STOP(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_BLACKSTART_APPROVAL(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_SYNC_APPROVAL(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_ACTIVATE_SHORT_CIRCUIT_HANDLING(new Doc().unit(Unit.ON_OFF)), //
	PCS_COMMAND_CONTROL_WORD_MODE_SELECTION(new Doc().unit(Unit.ON_OFF)), // 0=voltage control, 1=current control	
	PCS_COMMAND_CONTROL_WORD_TRIGGER_SIA(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_ACTIVATE_HARMONIC_COMPENSATION(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_ID_1_SD_CARD_PARAMETER_SET(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_ID_2_SD_CARD_PARAMETER_SET(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_ID_3_SD_CARD_PARAMETER_SET(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_ID_4_SD_CARD_PARAMETER_SET(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_ENABLE_IPU_4(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_ENABLE_IPU_3(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_ENABLE_IPU_2(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_CONTROL_WORD_ENABLE_IPU_1(new Doc().unit(Unit.ON_OFF)),
	PCS_COMMAND_ERROR_CODE_FEEDBACK(new Doc()),
	/**
	 * Describes the voltage provided in a blackstart where 1 is mains voltage. 1 =>
	 * 230V, 1.02 => 234.6V. Should be 1 when not using blackstart, because when system runs into blackstart mode
	 */
	PCS_COMMAND_CONTROL_PARAMETER_U0(new Doc()),
	/**
	 * Describes the frequency
	 */
	PCS_COMMAND_CONTROL_PARAMETER_F0(new Doc()),
	/**
	 * Describes the reactive power
	 */
	PCS_COMMAND_CONTROL_PARAMETER_Q_REF(new Doc()),
	/**
	 * Describes the active power
	 */
	PCS_COMMAND_CONTROL_PARAMETER_P_REF(new Doc()),
	PCS_COMMAND_TIME_SYNC_DATE(new Doc()),
	PCS_COMMAND_TIME_SYNC_TIME(new Doc()),

	PCS_CONTROL_PARAMETER_U_Q_DROOP_MAIN(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_PARAMETER_U_Q_DROOP_T1_MAIN(new Doc().unit(Unit.SECONDS)),
	PCS_CONTROL_PARAMETER_F_P_DRROP_MAIN(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_PARAMETER_F_P_DROOP_T1_MAIN(new Doc().unit(Unit.SECONDS)),
	PCS_CONTROL_PARAMETER_Q_U_DROOP_MAIN(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_PARAMETER_Q_U_DEAD_BAND(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_PARAMETER_Q_LIMIT(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_PARAMETER_P_F_DROOP_MAIN(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_PARAMETER_P_F_DEAD_BAND(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_PARAMETER_P_U_DROOP(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_PARAMETER_P_U_DEAD_BAND(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_PARAMETER_P_U_MAX_CHARGE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_PARAMETER_P_U_MAX_DISCHARGE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_PARAMETER_P_CONTROL_MODE(new Doc().options(PControlMode.values())),
	PCS_CONTROL_PARAMETER_P_CONTROL_LIM_TWO(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_PARAMETER_P_CONTROL_LIM_ONE(new Doc().unit(Unit.NONE)),

	PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_DC_VOLTAGE_SETPOINT(new Doc().unit(Unit.VOLT)),
	PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_WEIGHT_STRING_A(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_WEIGHT_STRING_B(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_WEIGHT_STRING_C(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_I_REF_STRING_A(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_I_REF_STRING_B(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_I_REF_STRING_C(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_DC_DC_STRING_CONTROL_MODE(new Doc().unit(Unit.NONE)),

	PCS_CONTROL_IPU_3_PARAMETERS_DC_VOLTAGE_SETPOINT(new Doc().unit(Unit.VOLT)),
	PCS_CONTROL_IPU_3_PARAMETERS_DC_CURRENT_SETPOINT(new Doc().unit(Unit.AMPERE)),
	PCS_CONTROL_IPU_3_PARAMETERS_U0_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_3_PARAMETERS_F0_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_3_PARAMETERS_Q_REF_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_3_PARAMETERS_P_REF_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_3_PARAMETERS_P_MAX_DISCHARGE(new Doc().unit(Unit.WATT)),
	PCS_CONTROL_IPU_3_PARAMETERS_P_MAX_CHARGE(new Doc().unit(Unit.WATT)),

	PCS_CONTROL_IPU_2_PARAMETERS_DC_VOLTAGE_SETPOINT(new Doc().unit(Unit.VOLT)),
	PCS_CONTROL_IPU_2_PARAMETERS_DC_CURRENT_SETPOINT(new Doc().unit(Unit.AMPERE)),
	PCS_CONTROL_IPU_2_PARAMETERS_U0_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_2_PARAMETERS_F0_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_2_PARAMETERS_Q_REF_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_2_PARAMETERS_P_REF_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_2_PARAMETERS_P_MAX_DISCHARGE(new Doc().unit(Unit.WATT)),
	PCS_CONTROL_IPU_2_PARAMETERS_P_MAX_CHARGE(new Doc().unit(Unit.WATT)),

	PCS_CONTROL_IPU_1_PARAMETERS_DC_VOLTAGE_SETPOINT(new Doc().unit(Unit.VOLT)),
	PCS_CONTROL_IPU_1_PARAMETERS_DC_CURRENT_SETPOINT(new Doc().unit(Unit.AMPERE)),
	PCS_CONTROL_IPU_1_PARAMETERS_U0_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_1_PARAMETERS_F0_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_1_PARAMETERS_Q_REF_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_1_PARAMETERS_P_REF_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	PCS_CONTROL_IPU_1_PARAMETERS_P_MAX_DISCHARGE(new Doc().unit(Unit.WATT)),
	PCS_CONTROL_IPU_1_PARAMETERS_P_MAX_CHARGE(new Doc().unit(Unit.WATT)),

	
	
	// Mirror values to check written values
	MIRROR_PCS_COMMAND_CONTROL_WORD(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_PLAY(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_READY(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_ACKNOWLEDGE(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_STOP(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_BLACKSTART_APPROVAL(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_SYNC_APPROVAL(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_ACTIVATE_SHORT_CIRCUIT_HANDLING(new Doc().unit(Unit.ON_OFF)), //
	MIRROR_PCS_COMMAND_CONTROL_WORD_MODE_SELECTION(new Doc().unit(Unit.ON_OFF)), // 0=voltage control, 1=current control	
	MIRROR_PCS_COMMAND_CONTROL_WORD_TRIGGER_SIA(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_ACTIVATE_HARMONIC_COMPENSATION(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_ID_1_SD_CARD_PARAMETER_SET(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_ID_2_SD_CARD_PARAMETER_SET(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_ID_3_SD_CARD_PARAMETER_SET(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_ID_4_SD_CARD_PARAMETER_SET(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_ENABLE_IPU_4(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_ENABLE_IPU_3(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_ENABLE_IPU_2(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_CONTROL_WORD_ENABLE_IPU_1(new Doc().unit(Unit.ON_OFF)),
	MIRROR_PCS_COMMAND_ERROR_CODE_FEEDBACK(new Doc()),
	MIRROR_PCS_COMMAND_CONTROL_PARAMETER_U0(new Doc()),
	MIRROR_PCS_COMMAND_CONTROL_PARAMETER_F0(new Doc()),
	MIRROR_PCS_COMMAND_CONTROL_PARAMETER_Q_REF(new Doc()),
	MIRROR_PCS_COMMAND_CONTROL_PARAMETER_P_REFERENCE(new Doc()),
	
	MIRROR_PCS_CONTROL_PARAMETER_U_Q_DROOP_MAIN(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_PARAMETER_U_Q_DROOP_T1_MAIN(new Doc().unit(Unit.SECONDS)),
	MIRROR_PCS_CONTROL_PARAMETER_F_P_DRROP_MAIN(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_PARAMETER_F_P_DROOP_T1_MAIN(new Doc().unit(Unit.SECONDS)),
	MIRROR_PCS_CONTROL_PARAMETER_Q_U_DROOP_MAIN(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_PARAMETER_Q_U_DEAD_BAND(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_PARAMETER_Q_LIMIT(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_PARAMETER_P_F_DROOP_MAIN(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_PARAMETER_P_F_DEAD_BAND(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_PARAMETER_P_U_DROOP(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_PARAMETER_P_U_DEAD_BAND(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_PARAMETER_P_U_MAX_CHARGE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_PARAMETER_P_U_MAX_DISCHARGE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_PARAMETER_P_CONTROL_MODE(new Doc().options(PControlMode.values())),
	MIRROR_PCS_CONTROL_PARAMETER_P_CONTROL_LIM_TWO(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_PARAMETER_P_CONTROL_LIM_ONE(new Doc().unit(Unit.NONE)),

	MIRROR_PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_DC_VOLTAGE_SETPOINT(new Doc().unit(Unit.VOLT)),
	MIRROR_PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_WEIGHT_STRING_A(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_WEIGHT_STRING_B(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_WEIGHT_STRING_C(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_I_REF_STRING_A(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_I_REF_STRING_B(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_I_REF_STRING_C(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_4_DC_DC_CONVERTER_PARAMETERS_DC_DC_STRING_CONTROL_MODE(new Doc().unit(Unit.NONE)),

	MIRROR_PCS_CONTROL_IPU_3_PARAMETERS_DC_VOLTAGE_SETPOINT(new Doc().unit(Unit.VOLT)),
	MIRROR_PCS_CONTROL_IPU_3_PARAMETERS_DC_CURRENT_SETPOINT(new Doc().unit(Unit.AMPERE)),
	MIRROR_PCS_CONTROL_IPU_3_PARAMETERS_U0_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_3_PARAMETERS_F0_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_3_PARAMETERS_Q_REF_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_3_PARAMETERS_P_REF_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_3_PARAMETERS_P_MAX_DISCHARGE(new Doc().unit(Unit.WATT)),
	MIRROR_PCS_CONTROL_IPU_3_PARAMETERS_P_MAX_CHARGE(new Doc().unit(Unit.WATT)),

	MIRROR_PCS_CONTROL_IPU_2_PARAMETERS_DC_VOLTAGE_SETPOINT(new Doc().unit(Unit.VOLT)),
	MIRROR_PCS_CONTROL_IPU_2_PARAMETERS_DC_CURRENT_SETPOINT(new Doc().unit(Unit.AMPERE)),
	MIRROR_PCS_CONTROL_IPU_2_PARAMETERS_U0_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_2_PARAMETERS_F0_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_2_PARAMETERS_Q_REF_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_2_PARAMETERS_P_REF_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_2_PARAMETERS_P_MAX_DISCHARGE(new Doc().unit(Unit.WATT)),
	MIRROR_PCS_CONTROL_IPU_2_PARAMETERS_P_MAX_CHARGE(new Doc().unit(Unit.WATT)),

	MIRROR_PCS_CONTROL_IPU_1_PARAMETERS_DC_VOLTAGE_SETPOINT(new Doc().unit(Unit.VOLT)),
	MIRROR_PCS_CONTROL_IPU_1_PARAMETERS_DC_CURRENT_SETPOINT(new Doc().unit(Unit.AMPERE)),
	MIRROR_PCS_CONTROL_IPU_1_PARAMETERS_U0_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_1_PARAMETERS_F0_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_1_PARAMETERS_Q_REF_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_1_PARAMETERS_P_REF_OFFSET_TO_CCU_VALUE(new Doc().unit(Unit.NONE)),
	MIRROR_PCS_CONTROL_IPU_1_PARAMETERS_P_MAX_DISCHARGE(new Doc().unit(Unit.WATT)),
	MIRROR_PCS_CONTROL_IPU_1_PARAMETERS_P_MAX_CHARGE(new Doc().unit(Unit.WATT)),;
	
	private final Doc doc;

	private GridConChannelId(Doc doc) {
		this.doc = doc;
	}

	public Doc doc() {
		return this.doc;
	}
}