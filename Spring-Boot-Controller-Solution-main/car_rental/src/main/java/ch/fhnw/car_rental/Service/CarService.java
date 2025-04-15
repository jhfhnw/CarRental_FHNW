package ch.fhnw.car_rental.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch.fhnw.car_rental.data.domain.Car;
import ch.fhnw.car_rental.data.repository.CarRepository;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository CarRepository;

    public Car findCarById(Long Car_id) {
    Car car = CarRepository.findById(Car_id).get();
    return car;
    }
    public List<Car> getAllCars() {
        List<Car> carList = CarRepository.findAll();
        return carList;
    }
    public Car findCarByCarModel(String Car_model) {
        return CarRepository.findByCarModel(Car_model);
    }
    public List<Car> findAllByCarTypeContainsIgnoreCase(String Car_type) {
        return CarRepository.findAllByCarTypeContainsIgnoreCase(Car_type);
    }
    public Car addCar(Car car) throws Exception {
        if (car.getCar_model() == null || car.getCar_type() == null) {
            throw new Exception("Car model and type cannot be null");
        }
        return CarRepository.save(car);
    }
    public Car deleteCar(Long Car_id) {
        Car car = findCarById(Car_id);
        if (car != null) {
            CarRepository.delete(car);
        }
        return car;
    }
    public Car updateCar(Car car) {
        return CarRepository.save(car);
    }
    private long getOffer(long offer) {
        if (offer < 0) {
            throw new IllegalArgumentException("Offer cannot be negative");
        }
        return offer;
    }
}
