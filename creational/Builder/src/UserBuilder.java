import java.time.LocalDate;
import java.time.LocalDateTime;

public class UserBuilder {
    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

    public UserBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder withAge(LocalDateTime birthday) {
        this.age = LocalDateTime.now().getYear() - birthday.getYear();
        return this;
    }

    public UserBuilder withAddress(Address address) {
        this.address = address.toString();
        return this;
    }

    public UserDTO build() {
        return new UserDTO(firstName + " " + lastName, age, address);
    }
}
