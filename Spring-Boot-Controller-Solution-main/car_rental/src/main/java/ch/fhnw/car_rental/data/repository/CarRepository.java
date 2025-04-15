package ch.fhnw.car_rental.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import ch.fhnw.car_rental.data.domain.Car;

@Repository
//JpaRepository should be typed to the domain class and an ID type
public interface CarRepository extends JpaRepository<Car, Long> {
    Car findByCarModel(String Car_model);
    Car addCar(Car car);
    List<Car> findAllByCarTypeContainsIgnoreCase(String Car_type);
    List<Car> findAllByCarModelContainsIgnoreCase(String Car_model);

}
