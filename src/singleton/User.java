package singleton;

public class User {

    private static User user;
    private String name;

    private User(String name) {
        this.name = name;
    }

    static User getUser(String name) {
        if (user == null) {
            user = new User(name);
        }

        return user;
    }

    @Override
    public String toString() {
        return name;
    }
}

class MainSingleton {
    public static void main(String[] args) {
        User user = User.getUser("Kahhogi");
        User user1 = User.getUser("Jakhongir");

        System.out.println(user1); // Kahhogi
    }
}