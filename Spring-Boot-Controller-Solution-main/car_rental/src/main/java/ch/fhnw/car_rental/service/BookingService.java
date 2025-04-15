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

    public Booking findBookingById(Long booking_id) {
        Booking booking = bookingRepository.findById(booking_id).get();
        return booking;
    }

    public List<Booking> getAllBookings() {
        List<Booking> bookingList = bookingRepository.findAll();
        return bookingList;
    }

    public Booking addBooking(Booking booking) throws Exception {
        if (booking.getCar() == null || booking.getUser() == null) {
            throw new Exception("Car and User cannot be null");
        }
        return bookingRepository.save(booking);
    }

    public Booking deleteBooking(Long booking_id) {
        Booking booking = findBookingById(booking_id);
        if (booking != null) {
            bookingRepository.delete(booking);
        }
        return booking;
    }

    public Booking updateBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
    public Booking findBookingByBookingId(Integer booking_id) {
        return bookingRepository.findByBooking_id(booking_id);
    }
}
