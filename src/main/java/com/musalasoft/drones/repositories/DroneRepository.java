package com.musalasoft.drones.repositories;



import com.musalasoft.drones.entities.Drone;
import com.musalasoft.drones.enums.State;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DroneRepository extends CrudRepository<Drone, Long> {
    List<Drone> findByState(State state);
}
