package ch.fhnw.car_rental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ch.fhnw.car_rental.service.CarService;

@SpringBootApplication
@RestController
public class CarApplication {

    @Autowired
    private CarService carService;

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
    }

    @GetMapping(value = "/")
    public String getWelcomeString() {
        return "Pizza Takeaway Service, welcome!";
    }
}