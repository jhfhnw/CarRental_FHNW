package ch.fhnw.car_rental.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import ch.fhnw.car_rental.Service.CarService;
import ch.fhnw.car_rental.data.domain.Car;
import ch.fhnw.car_rental.data.repository.CarRepository;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping(path="/car_rental")
public class CarController {

@Autowired
private CarService carService;

@GetMapping(path="/car/{id}", produces = "application/json")
public ResponseEntity<Car> getCar(@PathVariable Long id) {
    try{
        Car car = carService.findCarById(id);
        return ResponseEntity.ok(car);
    }
    catch (Exception e) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
    }
}

@GetMapping(path="/car", produces = "application/json")
public List<Car> getCarList() {
    List<Car> carList = carService.getAllCars();
    if(carList.isEmpty())
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "No cars found");
    return carList;
}
@PostMapping(path="/car", consumes="application/json", produces = "application/json")
public ResponseEntity<Car> addCar(@RequestBody Car car) {
    try{
        car = carService.addCar(car);
        
    } catch (Exception e) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, e.getMessage());

    }
    return ResponseEntity.ok(car);
    
}

@DeleteMapping(path="/car/{id}")
public ResponseEntity<Void> deleteCar(@PathVariable Long id) {
    try {
        carService.deleteCar(id);
    } catch (Exception e) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
    }
    return ResponseEntity.noContent().build();
}

@PutMapping(path="/car/{id}", consumes="application/json", produces = "application/json")
public ResponseEntity<Car> updateCar(@PathVariable Long id, @RequestBody Car car) {
    try{
        car = carService.findCarById(id);
        car = carService.updateCar(car);
    } catch (Exception e) {
        throw new ResponseStatusException(HttpStatus.NOT_FOUND, e.getMessage());
    }
    return ResponseEntity.ok(car);
}

/*
    //get list of cars
    @GetMapping(path="/cars", produces = "application/json")
    public ResponseEntity getcarList() {
        List<Car> carList = new ArrayList();

        Car car1 = new Car();
        car1.setCar_id(1);
        car1.setCar_model("BMW X3");
        car1.setCar_type("SUV");
        car1.setCar_availability(true);
        car1.setType_of_fuel("Gas");
        car1.setSeats(5);

        Car car2 = new Car();
        car2.setCar_id(2);
        car2.setCar_model("Skoda Fabia");
        car2.setCar_type("PKW");
        car2.setCar_availability(true);
        car2.setType_of_fuel("Electric");
        car2.setSeats(4);

        carList.add(car1);
        carList.add(car2);

        if(carList.isEmpty())
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(carList);
    }
    
    @GetMapping(path="/car/{id}", produces = "application/json")
    public ResponseEntity getCar(@PathVariable Long id) {
        
        Car car1 = new Car();
        car1.setCar_id(1);
        car1.setCar_model("BMW X3");
        car1.setCar_type("SUV");
        car1.setCar_availability(true);
        car1.setType_of_fuel("Gas");
        car1.setSeats(5);

        if (id == 1) {
            return ResponseEntity.ok(car1);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping(path="/car", consumes="application/json", produces = "application/json")
    public ResponseEntity addCar(@RequestBody Car car) {
        //TODO: process POST request

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping(path="/car/{id}", consumes="application/json", produces = "application/json")
    public ResponseEntity updateCar(@PathVariable Long id, @RequestBody Car car) {
        //TODO: process PUT request
        
        return ResponseEntity.ok(car);
    }

    @DeleteMapping(path="/car/{id}")
    public ResponseEntity deleteCar(@PathVariable Long id) {
        //TODO: process DELETE request
        
        return ResponseEntity.noContent().build();
    }
*/
}
