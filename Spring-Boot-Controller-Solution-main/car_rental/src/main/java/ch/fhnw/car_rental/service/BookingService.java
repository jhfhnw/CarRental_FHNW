package ch.fhnw.car_rental.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ch.fhnw.car_rental.data.domain.Booking;
import ch.fhnw.car_rental.data.repository.BookingRepository;
import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking findBookingById(Long bookingId) {
        return bookingRepository.findById(bookingId).orElse(null); // Variablenname angepasst
    }

    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    public Booking addBooking(Booking booking) throws Exception {
        if (booking.getCar() == null || booking.getCustomer() == null) {
            throw new Exception("Car and User cannot be null");
        }
        return bookingRepository.save(booking);
    }

    public Booking deleteBooking(Long bookingId) {
        Booking booking = findBookingById(bookingId); // Variablenname angepasst
        if (booking != null) {
            bookingRepository.delete(booking);
        }
        return booking;
    }

    public Booking updateBooking(Booking booking) {
        return bookingRepository.save(booking);
    }

    public Booking findBookingByBookingId(Integer bookingId) {
        return bookingRepository.findByBookingId(bookingId); // Methodennamen angepasst
    }
}