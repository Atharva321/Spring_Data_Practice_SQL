package com.frankmoley.lil.learningspring.data;


import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name="GUEST")
public class Guest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="GUEST_ID")
    private long guestId;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="EMAIL_ADDRESS")
    private String emailAddress;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="COUNTRY")
    private String country;

    @Column(name="STATE")
    private String state;

    @Column(name="PHONE_NUMBER")
    private String phoneNumber;
}
