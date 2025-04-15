package ch.fhnw.car_rental.data.domain;

import java.sql.Date;
import jakarta.persistence.*;

@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer bookingId; // Feldname geändert

    @Column(name = "start_date", nullable = false)
    private Date startDate; // Feldname geändert

    @Column(name = "end_date", nullable = false)
    private Date endDate; // Feldname geändert

    @Column(name = "booking_cost", nullable = false)
    private Number bookingCost; // Feldname geändert

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

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Number getBookingCost() {
        return bookingCost;
    }

    public void setBookingCost(Number bookingCost) {
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