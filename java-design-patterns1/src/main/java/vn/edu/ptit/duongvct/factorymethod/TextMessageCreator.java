package vn.edu.ptit.duongvct.factorymethod;


import vn.edu.ptit.duongvct.factorymethod.message.Message;
import vn.edu.ptit.duongvct.factorymethod.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {


    @Override
    public Message createMessage() {
        return new TextMessage();
    }
}
