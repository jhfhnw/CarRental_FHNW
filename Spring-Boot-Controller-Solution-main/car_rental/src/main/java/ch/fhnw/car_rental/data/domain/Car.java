package ch.fhnw.car_rental.data.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "car_id", nullable = false)
    private long carId;

    @Column(name = "car_model", nullable = false)
    private String carModel;

    @Column(name = "car_type", nullable = false)
    private String carType;

    @Column(name = "car_availability", nullable = false)
    private Boolean carAvailability;

    @Column(name = "type_of_fuel", nullable = false)
    private String typeOfFuel;

    @Column(name = "seats")
    private Integer seats;

    // Getter und Setter
    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Boolean getCarAvailability() {
        return carAvailability;
    }

    public void setCarAvailability(Boolean carAvailability) {
        this.carAvailability = carAvailability;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public Integer getSeats() {
        return seats;
    }

    public void setSeats(Integer seats) {
        this.seats = seats;
    }
}