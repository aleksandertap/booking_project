package com.example.backend.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "flights")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 10, unique = true, name = "flight_number")
    private String flightNumber;

    @Column(nullable = false, length = 50)
    private String flightProvider;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10)
    private City origin;

    @Column(nullable = false, length = 40)
    private String destination;

    @Column(nullable = false)
    private LocalDate date;

    @Column(nullable = false, name = "depart_time")
    private LocalTime departTime;

    @Column(nullable = false)
    private Integer price;

    @Column(nullable = false)
    private Integer availableSeats;

    @Column(length = 10)
    private String gate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, name = "flight_status", length = 20)
    private FlightStatus status = FlightStatus.EMPTY;
}