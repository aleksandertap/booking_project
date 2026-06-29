package com.example.backend.service;

import com.example.backend.entity.Flight;
import com.example.backend.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FlightService {
    private final FlightRepository flightRepository;

    public List<Flight> getAllFlights(){
        return flightRepository.findAll();
    }

    public Flight getOneFlight(Integer id){
        return flightRepository.findById(id).orElseThrow(() -> new RuntimeException("Flight now found with id: " + id));
    }

    public Flight saveFlight(Flight flight){
        return flightRepository.save(flight);
    }

    public Flight updateFlight(Integer id, Flight updatedFlight){
        Flight existingFlight = flightRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Flight now found with id: " + id));

        BeanUtils.copyProperties(updatedFlight, existingFlight, "id");

        return flightRepository.save(existingFlight);
    }

    public String deleteFlight(Integer id){
        Flight existingFlight = flightRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Flight now found with id: " + id));

        flightRepository.delete(existingFlight);

        return "flight deleted with id: " + id;
    }

    public void deleteAllFlights(){
        flightRepository.deleteAll();
    }
}
