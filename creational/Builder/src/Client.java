import java.time.LocalDateTime;

public class Client {
    public static void main(String[] args) {
        User user = createUser();
        UserBuilder builder = new UserBuilder();

        UserDTO dto = directBuild(builder, user);
        System.out.println(dto.toString());
    }

    private static UserDTO directBuild(UserBuilder builder, User user) {
        return builder
                .withFirstName(user.getFirstName())
                .withLastName(user.getLastName())
                .withAge(user.getBirthday())
                .withAddress(user.getAddress())
                .build();
    }

    public static User createUser() {
        User user = new User();
        user.setFirstName("John");
        user.setLastName("Doe");
        user.setBirthday(LocalDateTime.of(2000,10,2,10,3,1));
        user.setPassword("password");
        user.setAddress(new Address("32/12","Washington","New York","New York","New York"));
        return user;
    }
}