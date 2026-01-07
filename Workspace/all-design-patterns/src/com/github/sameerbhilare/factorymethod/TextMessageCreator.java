package com.github.sameerbhilare.factorymethod;

import com.github.sameerbhilare.factorymethod.message.Message;
import com.github.sameerbhilare.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}



}
