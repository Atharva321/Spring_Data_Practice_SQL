package com.frankmoley.lil.learningspring.data;

import com.sun.istack.NotNull;
import org.hibernate.annotations.NotFound;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "RESERVATION")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="RESERVATION_ID")
    private long reservationId;

    @NotNull
    @Column(name="ROOM_ID")
    private long roomId;
    @NotNull
    @Column(name="GUEST_ID")
    private long guestId;

    @Column(name="RES_DATE")
    private Date reservationDate;
}
