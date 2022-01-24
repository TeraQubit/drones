package com.musalasoft.drones.enums;

public enum State {
    IDLE("IDLE"),
    LOADING("LOADING"),
    LOADED("LOADED"),
    DELIVERING("DELIVERING"),
    DELIVERED("DELIVERED"),
    RETURNING("RETURNING");

    public String value;

    private State(String state){
        value = state;
    }
}
