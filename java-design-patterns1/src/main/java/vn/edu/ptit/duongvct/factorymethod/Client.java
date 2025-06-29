package vn.edu.ptit.duongvct.factorymethod;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.ptit.duongvct.factorymethod.message.Message;


public class Client {
	private static final Logger logger = LoggerFactory.getLogger(Client.class);
	public static void main(String[] args) {
		printMessage(new JSONMessageCreator());
		printMessage(new TextMessageCreator());
	}
	
	public static void printMessage(MessageCreator creator) {
		Message message = creator.getMessage();
		logger.info("Message: {}", message);
	}
}
