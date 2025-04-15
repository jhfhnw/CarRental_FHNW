package ch.fhnw.car_rental.data.repository;

import ch.fhnw.car_rental.data.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
//JpaRepository should be typed to the domain class and an ID type
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findByBooking_id(Integer Booking_id);
    Booking addBooking(Booking booking);

}
