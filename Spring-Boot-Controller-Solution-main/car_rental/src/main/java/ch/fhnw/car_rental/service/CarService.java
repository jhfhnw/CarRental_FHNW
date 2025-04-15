package ch.fhnw.car_rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch.fhnw.car_rental.data.domain.Car;
import ch.fhnw.car_rental.data.repository.CarRepository;
import java.util.List;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Car findCarById(Long carId) {
        return carRepository.findById(carId).orElse(null);
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car findCarByCarModel(String carModel) {
        return carRepository.findByCarModel(carModel);
    }

    public List<Car> findAllByCarTypeContainsIgnoreCase(String carType) {
        return carRepository.findAllByCarTypeContainsIgnoreCase(carType);
    }

    public Car addCar(Car car) throws Exception {
        if (car.getCarModel() == null || car.getCarType() == null) {
            throw new Exception("Car model and type cannot be null");
        }
        return carRepository.save(car);
    }

    public Car deleteCar(Long carId) {
        Car car = findCarById(carId);
        if (car != null) {
            carRepository.delete(car);
        }
        return car;
    }

    public Car updateCar(Car car) {
        return carRepository.save(car);
    }
}