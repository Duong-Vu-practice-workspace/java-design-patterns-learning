package vn.edu.ptit.duongvct.factorymethod;

import vn.edu.ptit.duongvct.factorymethod.message.JSONMessage;
import vn.edu.ptit.duongvct.factorymethod.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
