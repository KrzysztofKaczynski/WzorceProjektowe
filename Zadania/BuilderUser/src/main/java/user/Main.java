package user;

public class Main {

    public static void main(String[] args) {
        User user = new User.UserBuilder("Kris", "Kros").age(18).address("wawa").phone("700 000 000").build();
        System.out.println(user.toString());
    }
}
