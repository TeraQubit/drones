package com.musalasoft.drones.exceptions;

public class DroneBatteryLow extends Exception {

    public DroneBatteryLow() {
        super("Drone Battery Low");
    }

    public DroneBatteryLow(String message) {
        super(message);
    }
}
