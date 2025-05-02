package ch.fhnw.car_rental.data.domain;

import java.time.LocalDateTime;
import com.fasterxml.jackson.annotation.JsonFormat; // Import für JSON-Formatierung
import jakarta.persistence.*;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer bookingId;

    @Column(name = "start_date", nullable = false)
    @JsonFormat(pattern = "HH:mm dd.MM.yyyy") // Format für JSON-Serialisierung/Deserialisierung
    private LocalDateTime startDate;

    @Column(name = "end_date", nullable = false)
    @JsonFormat(pattern = "HH:mm dd.MM.yyyy") // Format für JSON-Serialisierung/Deserialisierung
    private LocalDateTime endDate;

    @Column(name = "booking_cost", nullable = false)
    private Double bookingCost;

    @ManyToOne
    @JoinColumn(name = "car_id", nullable = false)
    private Car car;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    // Getter und Setter
    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public Double getBookingCost() {
        return bookingCost;
    }

    public void setBookingCost(Double bookingCost) {
        this.bookingCost = bookingCost;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}