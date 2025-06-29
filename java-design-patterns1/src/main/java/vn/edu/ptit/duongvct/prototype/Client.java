package vn.edu.ptit.duongvct.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Client {
	private static final Logger logger = LoggerFactory.getLogger(Client.class);
	public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1 = new Swordsman();
		s1.move(new Point3D(-10, 0, 0), 20);
		s1.attack();

		logger.info(String.valueOf(s1));

		Swordsman s2 = (Swordsman) s1.clone();
		logger.info("Cloned swordsman {}", s2);
	}

}
