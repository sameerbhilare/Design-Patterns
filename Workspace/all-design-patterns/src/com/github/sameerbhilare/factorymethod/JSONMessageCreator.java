package com.github.sameerbhilare.factorymethod;

import com.github.sameerbhilare.factorymethod.message.JSONMessage;
import com.github.sameerbhilare.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
