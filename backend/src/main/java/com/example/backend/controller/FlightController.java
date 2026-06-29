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

    @GetMapping("/{id}")
    public Flight getFlight(@PathVariable Integer id){
        return flightService.getOneFlight(id);
    }

    @PostMapping
    public Flight createFlight(@RequestBody Flight flight){
        return flightService.saveFlight(flight);
    }

    @PutMapping("/{id}")
    public Flight updateFlight(@PathVariable Integer id, @RequestBody Flight flight){
        return flightService.updateFlight(id, flight);
    }

    @DeleteMapping("/{id}")
    public String deleteFlight(@PathVariable Integer id){
        return flightService.deleteFlight(id);
    }

    @DeleteMapping()
    public void deleteAllFlights(){
        flightService.deleteAllFlights();
    }
}