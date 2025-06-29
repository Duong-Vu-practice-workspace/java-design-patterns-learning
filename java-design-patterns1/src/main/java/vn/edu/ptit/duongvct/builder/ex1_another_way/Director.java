package vn.edu.ptit.duongvct.builder.ex1_another_way;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.ptit.duongvct.builder.ex1.Address;
import vn.edu.ptit.duongvct.builder.ex1.User;

import java.time.LocalDate;


public class Director {
	private static final Logger logger = LoggerFactory.getLogger(Director.class);
	public static void main(String[] args) {
		User user = createUser();
		// Client has to provide director with concrete builder
		UserDTO dto = directBuild(UserDTO.getBuilder(), user);
		logger.info("UserDTO: {}", dto);
	}

	/**
	 * This method serves the role of director in builder pattern.
	 */
	private static UserDTO directBuild(UserDTO.UserDTOBuilder builder, User user) {
		return builder.withFirstName(user.getFirstName()).withLastName(user.getLastName())
				.withBirthday(user.getBirthday()).withAddress(user.getAddress()).build();
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
