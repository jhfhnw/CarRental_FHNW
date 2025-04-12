package ch.fhnw.car_rental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarApplication.class, args);
	}

 	@GetMapping(value="/")
    public String getWelcomeString() {
        
        return "Pizza Takeaway Service, welcome!";
    } 

}
