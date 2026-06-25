package com.example.backend.controller;

import com.example.backend.entity.Flight;
import com.example.backend.service.FlightService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
@RequiredArgsConstructor
public class FlightController {
    private final FlightService flightService;

    @GetMapping
    public List<Flight> getAllFlight(){
        return flightService.getAllFlights();
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight){
        return flightService.saveFlight(flight);
    }
}