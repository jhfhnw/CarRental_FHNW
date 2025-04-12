package ch.fhnw.car_rental;

public class Customer {

    private Integer Customer_id = 0; 
    private String Username = "Muster Mustermann";
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
