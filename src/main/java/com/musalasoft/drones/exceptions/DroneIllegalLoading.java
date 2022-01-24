package com.musalasoft.drones.exceptions;

public class DroneIllegalLoading extends Exception {

    public DroneIllegalLoading() {
        super("Can't Load Drone while not in Loading or Idle state weight exceeded");
    }

    public DroneIllegalLoading(String message) {
        super(message);
    }
}
