package vn.edu.ptit.duongvct.builder.ex1;

import java.time.LocalDate;
import java.time.Period;

//The concrete builder for UserWebDTO
public class UserWebDTOBuilder implements UserDTOBuilder{
    private String firstName;
    private String lastName;
    private String age;
    private String address;
    private UserWebDTO dto;

    @Override
    public UserDTOBuilder withFirstName(String fname) {
        this.firstName = fname;
        return this;
    }

    @Override
    public UserDTOBuilder withLastName(String lname) {
        this.lastName = lname;
        return this;
    }

    @Override
    public UserDTOBuilder withBirthday(LocalDate date) {
        Period ageInYears = Period.between(date, LocalDate.now());
        this.age = Integer.toString(ageInYears.getYears());
        return this;
    }

    @Override
    public UserDTOBuilder withAddress(Address address) {
        this.address = String.format("%s, %s, %s, %s, %s", address.getHouseNumber(), address.getStreet(), address.getCity(), address.getState(), address.getZipcode());
        return this;
    }

    @Override
    public UserDTO build() {
        String name = String.format("%s %s", firstName, lastName);
        return new UserWebDTO(name, address, age);
    }

    @Override
    public UserDTO getUserDTO() {
        return dto;
    }
}
