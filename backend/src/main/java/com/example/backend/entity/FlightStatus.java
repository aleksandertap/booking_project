package com.example.backend.entity;

public enum FlightStatus {
    EMPTY(""),
    DEPARTED("Väljus"),
    BOARDING("Pardaleminek");

    private final String value;

    FlightStatus(String value){
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
