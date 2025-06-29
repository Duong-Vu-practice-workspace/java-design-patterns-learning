package vn.edu.ptit.duongvct.simplefactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	private static final Logger logger = LoggerFactory.getLogger(Client.class);
	public static void main(String[] args) {
		Post post = PostFactory.createPost("blog");
		logger.info("Post: {}", post);
	}

}
