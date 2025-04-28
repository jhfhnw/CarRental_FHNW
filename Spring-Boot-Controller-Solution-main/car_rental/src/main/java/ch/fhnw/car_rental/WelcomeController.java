package ch.fhnw.car_rental;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Wird nach Verständnis, sobald verbindung zu Budibase funktioniert, endgültig gelöscht

@RestController
public class WelcomeController {

    @GetMapping(value="welcome")
    public String getWelcomeString() {
        
        return "Hello, welcome to our Car Rental!";
    }


}
