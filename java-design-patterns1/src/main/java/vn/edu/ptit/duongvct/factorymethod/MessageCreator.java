package vn.edu.ptit.duongvct.factorymethod;


import vn.edu.ptit.duongvct.factorymethod.message.Message;

/**
 * This is our abstract "creator". 
 * The abstract method createMessage() has to be implemented by
 * its subclasses.
 */
public abstract class MessageCreator {

    public Message getMessage() {
        Message message = createMessage();
        message.addDefaultHeaders();
        message.encrypt();
        return  message;
    }

    /**
     * Factory method
     * @return
     */
    public abstract Message createMessage();

	
}
