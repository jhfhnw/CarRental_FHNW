package ch.fhnw.car_rental.data.repository;

import ch.fhnw.car_rental.data.domain.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    Booking findByBookingId(Integer bookingId); // Methodennamen geändert
}