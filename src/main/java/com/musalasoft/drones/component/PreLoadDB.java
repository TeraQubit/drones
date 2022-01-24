package com.musalasoft.drones.component;

import javax.annotation.PostConstruct;


import com.musalasoft.drones.entities.Drone;
import com.musalasoft.drones.enums.Model;
import com.musalasoft.drones.enums.State;
import com.musalasoft.drones.repositories.DroneRepository;
import org.springframework.stereotype.Component;

@Component
public class PreLoadDB {
    private DroneRepository droneRepository;

    public PreLoadDB(DroneRepository droneRepository){
        this.droneRepository = droneRepository;
    }


    @PostConstruct
    private void postConstruct() {
        //add 10 drones
        for(int i = 0; i < 10; i++){
            droneRepository.save(new Drone("1234567890" + i, Model.LightWeight, 500, 100, State.IDLE));
        }
    }
    
}
