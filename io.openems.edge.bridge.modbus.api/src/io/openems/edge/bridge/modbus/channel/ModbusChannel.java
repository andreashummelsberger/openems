package io.openems.edge.bridge.modbus.channel;

import io.openems.common.exceptions.OpenemsException;
import io.openems.common.utils.Log;
import io.openems.edge.bridge.modbus.protocol.RegisterElement;
import io.openems.edge.common.channel.Channel;

public interface ModbusChannel<T> extends Channel {

	/**
	 * Maps this Channel to an Element.
	 * 
	 * @param element
	 * @param scaleFactor
	 * @return
	 */
	public default RegisterElement<?> mapToElement(RegisterElement<?> element) {
		element.onUpdateCallback((value) -> {
			try {
				this.setNextValue(value);
			} catch (OpenemsException e) {
				Log.warn("Channel [" + this.address() + "] unable to set next value: " + e.getMessage());
			}
		});
		return element;
	}

}