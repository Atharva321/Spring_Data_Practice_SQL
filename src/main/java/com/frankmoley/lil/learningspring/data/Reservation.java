package com.frankmoley.lil.learningspring.data;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @Column(name="RESERVATION_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long reservationId;

    @NotNull
    @Column(name="ROOM_ID")
    private long roomId;

    @NotNull
    @Column(name="GUEST_ID")
    private long guestId;

    public Reservation(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    @Column(name="RES_DATE")
    private Date reservationDate;

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }


    @Override
    public String toString() {
        return "Reservation{" +
                "reservationId=" + reservationId +
                ", roomId=" + roomId +
                ", guestId=" + guestId +
                ", reservationDate=" + reservationDate +
                '}';
    }
}
