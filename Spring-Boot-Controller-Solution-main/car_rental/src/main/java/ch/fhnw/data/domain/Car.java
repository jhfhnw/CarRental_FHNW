package ch.fhnw.data.domain;

public class Car {
    private int Car_id = 10;
    private String Car_model = "Opel Astra";
    private String Car_type = "PKW";
    private Boolean Car_availability = true;
    private String Type_of_fuel = "Gas";  
    private Integer Seats = 4;

    // constraint einfügen: @Column (int Car_id, nullable = false);

public int getCar_id() {
        return Car_id;
    }

    public void setCar_id(int car_id) {
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
