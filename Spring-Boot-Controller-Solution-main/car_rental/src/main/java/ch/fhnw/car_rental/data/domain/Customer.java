package ch.fhnw.car_rental.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer Customer_id = 0; 

    @Column(name = "username", nullable = false)
    private String Username = "Muster Mustermann";

    @Column(name = "password", nullable = false)
    private String Password = "Mustermann1234";

    public int getCustomer_id() {
        return Customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.Customer_id = customer_id;
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

    public void setPassword (String password) {
        this.Password = password;
    }

}
