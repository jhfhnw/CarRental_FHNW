package ch.fhnw.car_rental;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ch.fhnw.car_rental.data.domain.Car;
import ch.fhnw.car_rental.service.CarService;

@SpringBootApplication
@RestController
public class CarApplication {

@Autowired
private static CarService carService;

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);

		Car test= new Car();
		test.setCarModel("BMW");
		test.setCarType("SUV");
		test.setCarAvailability(true);
		test.setTypeOfFuel("Diesel");
		test.setSeats(5);
		System.out.println(test.toString());
		
	}

	
 	@GetMapping(value="/")
    public String getWelcomeString() {
        
        return "Pizza Takeaway Service, welcome!";
    } 

}
