package ch.fhnw.data.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private long Car_id = 10;

    @Column(name = "model", nullable = false)
    private String Car_model = "Opel Astra";

    @Column(name = "type", nullable = false)
    private String Car_type = "PKW";

    @Column(name = "availability", nullable = false)
    private Boolean Car_availability = true;

    @Column(name = "fuel", nullable = false)
    private String Type_of_fuel = "Gas";  

    @Column(name = "seats")
    private Integer Seats = 4;

public long getCar_id() {
        return Car_id;
    }

    public void setCar_id(long car_id) {
        this.Car_id = car_id;
    }

    public String getCar_model() {
        return Car_model;
    }

    public void setCar_model(String car_model) {
        this.Car_model = car_model;
    }

    public String getCar_type() {
        return Car_type;
    }

    public void setCar_type(String car_type) {
        this.Car_type = car_type;
    }

    public Boolean getCar_availability() {
        return Car_availability;
    }

    public void setCar_availability(Boolean car_availability) {
        this.Car_availability = car_availability;
    }

    public String getType_of_fuel() {
        return Type_of_fuel;
    }

    public void setType_of_fuel(String type_of_fuel) {
        this.Type_of_fuel = type_of_fuel;
    }

    public Integer getSeats() {
        return Seats;
    }

    public void setSeats(Integer seats) {
        this.Seats = seats;
    }
}
