package com.gideonshawana.spring.jpa;


import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private int NoofPassengers;
    private String ClassofTravel;
    private String phoneNo;
    private LocalDate dateofDeparture;
    private LocalTime timeOfDeparture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNoofPassengers() {
        return NoofPassengers;
    }

    public void setNoofPassengers(int NoofPassengers) {
        this.NoofPassengers = NoofPassengers;
    }

    public String getClassofTravel() {
        return ClassofTravel;
    }

    public void setClassofTravel(String ClassofTravel) {
        this.ClassofTravel = ClassofTravel;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public LocalDate getDateofDeparture() {
        return dateofDeparture;
    }

    public void setDateofDeparture(LocalDate dateofDeparture) {
        this.dateofDeparture = dateofDeparture;
    }

    public LocalTime getTimeOfDeparture() {
        return timeOfDeparture;
    }

    public void setTimeOfDeparture(LocalTime timeOfDeparture) {
        this.timeOfDeparture = timeOfDeparture;
    }
    
}
