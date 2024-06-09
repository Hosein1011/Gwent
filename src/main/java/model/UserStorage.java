package model;

import java.util.ArrayList;
import java.util.List;

public class UserStorage {
    private static final List<User> users = new ArrayList<>();
    public static List<User> getUsers() {
        return new ArrayList<>(users); // Return a copy to prevent external modification
    }
    public static void addUser(User user) {
        users.add(user);
    }

    public static User getUserByUsername(String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public static User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public static boolean isUsernameUnique(String username) {
        return getUserByUsername(username) == null;
    }

    public static boolean isEmailUnique(String email) {
        return getUserByEmail(email) == null;
    }
}
