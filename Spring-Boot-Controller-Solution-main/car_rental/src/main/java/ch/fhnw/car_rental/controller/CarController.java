package ch.fhnw.car_rental.controller;

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

import ch.fhnw.car_rental.service.CarService;
import ch.fhnw.car_rental.service.BookingService;
import ch.fhnw.car_rental.data.domain.Car;
import ch.fhnw.car_rental.data.domain.Booking;
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

}
