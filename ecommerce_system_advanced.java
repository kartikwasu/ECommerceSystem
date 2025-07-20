// New User.java
public class User {
    private String username;
    private String password;
    private boolean isAdmin;

    public User(String username, String password, boolean isAdmin) {
        this.username = username;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    @Override
    public String toString() {
        return username + "," + password + "," + isAdmin;
    }

    public static User fromString(String data) {
        String[] parts = data.split(",");
        return new User(parts[0], parts[1], Boolean.parseBoolean(parts[2]));
    }
}
