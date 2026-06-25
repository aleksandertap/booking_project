package com.example.backend.service;

import com.example.backend.entity.Flight;
import com.example.backend.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {
    private final FlightRepository flightRepository;

    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    public Flight saveFlight(Flight flight){
        return flightRepository.save(flight);
    }
}
