package com.musalasoft.drones.exceptions;

public class DroneNotFound extends Exception {

    public DroneNotFound() {
        super("Drone Not Found");
    }

    public DroneNotFound(String message) {
        super(message);
    }
}
