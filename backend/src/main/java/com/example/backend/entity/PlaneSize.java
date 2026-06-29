package com.example.backend.entity;

public enum PlaneSize {
    SMALL(70),
    MEDIUM(180),
    BIG(300);

    private final Integer size;

    PlaneSize(Integer size) {
        this.size = size;
    }

    public Integer getSize(){
        return this.size;
    }
}
