package ch.fhnw.car_rental.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import ch.fhnw.car_rental.data.domain.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByCarModel(String carModel);
    List<Car> findAllByCarTypeContainsIgnoreCase(String carType);
    List<Car> findAllByCarModelContainsIgnoreCase(String carModel);
}