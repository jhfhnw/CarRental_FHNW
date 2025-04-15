package ch.fhnw.car_rental.data.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;


@Entity
@Table(name = "admin")

public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer User_id = 99;

    @Column(name = "username", nullable = false)
    private String Username = "Joe Tester";

    @Column(name = "password", nullable = false)
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
