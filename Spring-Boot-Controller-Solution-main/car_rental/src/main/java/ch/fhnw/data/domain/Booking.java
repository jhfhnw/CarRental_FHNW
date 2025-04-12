package ch.fhnw.data.domain;

import java.sql.Date;

public class Booking {

    private Integer Booking_id = 10;
    private Date Start_Date;
    private Date End_Date;
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
