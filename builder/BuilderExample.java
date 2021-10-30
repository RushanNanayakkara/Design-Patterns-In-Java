package builder;

public class BuilderExample {
    public static void main(String[] args) {
        User user = new User.UserBuilder("Rushan", "Nanayakkara", "rushannana@gmail.com")
        .build();
        System.out.println("User : \n"+user);

        User user1 = new User.UserBuilder("Rushan", "Nanayakkara", "rushannana@gmail.com")
        .setAge(26)
        .setAddress("Home, MyStreet, SomewhereNice")
        .build();
        System.out.println("\nUser1 : \n"+user1);
    }
}
