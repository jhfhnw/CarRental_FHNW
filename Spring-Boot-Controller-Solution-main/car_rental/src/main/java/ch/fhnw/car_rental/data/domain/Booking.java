package ch.fhnw.car_rental.data.domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer Booking_id = 10;

    @Column(name = "start_date", nullable = false)
    private Date Start_Date;

    @Column(name = "end_date", nullable = false)
    private Date End_Date;

    @Column(name = "booking_cost", nullable = false)
    private Number Booking_Cost;

    public Integer getBooking_id() {
        return Booking_id;
    }

    public void setBooking_id(Integer booking_id) {
        this.Booking_id = booking_id;
    }

    public Date getStart_Date() {
        return Start_Date;
    }

    public void setStart_Date(Date start_Date) {
        this.Start_Date = start_Date;
    }

    public Date getEnd_Date() {
        return End_Date;
    }

    public void setEnd_Date(Date end_Date) {
        this.End_Date = end_Date;
    }

    public Number getBooking_Cost() {
        return Booking_Cost;
    }

    public void setBooking_Cost(Number booking_Cost) {
        this.Booking_Cost = booking_Cost;
    }

}
