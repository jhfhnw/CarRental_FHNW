package ch.fhnw.car_rental;

public class Admin {

    private Integer User_id = 99;
    private String Username = "Joe Tester";
    private String Password = "Test1234";

    public int getUser_id() {
        return User_id;
    }

    public void setUser_id(int user_id) {
        this.User_id = user_id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername (String username) {
        this.Username = username;
    }

    public String getPassword() {
        return Password;
    }

}
