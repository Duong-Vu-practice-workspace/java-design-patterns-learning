package vn.edu.ptit.duongvct.builder.ex1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;


//This is our client which also works as "director"
public class Director {
	private static final Logger logger = LoggerFactory.getLogger(Director.class);
	public static void main(String[] args) {
		User user = createUser();
		UserDTOBuilder builder = new UserWebDTOBuilder();
		UserDTO dto = directBuild(builder, user);
		logger.info("UserDTO: {}", dto);

	}

	/**
	 * Director
	 * @param builder
	 * @param user
	 * @return
	 */
	private static UserDTO directBuild(UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName())
				.withLastName(user.getLastName())
				.withAddress(user.getAddress())
				.withBirthday(user.getBirthday())
				.build();
	}
	/**
	 * Returns a sample user. 
	 */
	public static User createUser() {
		User user = new User();
		user.setBirthday(LocalDate.of(1960, 5, 6));
		user.setFirstName("Ron");
		user.setLastName("Swanson");
		Address address = new Address();
		address.setHouseNumber("100");
		address.setStreet("State Street");
		address.setCity("Pawnee");
		address.setState("Indiana");
		address.setZipcode("47998");
		user.setAddress(address);
		return user;
	}
}
