package com.musalasoft.drones.controllers;

import com.musalasoft.drones.dto.DroneDTO;
import com.musalasoft.drones.dto.MedicationDTO;
import com.musalasoft.drones.services.DroneService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("api/drone")
public class DroneController {

    private final DroneService droneService;

    public DroneController(DroneService droneService) {
        this.droneService = droneService;
    }

    @PostMapping(value={"", "/"}, consumes = "application/json")
    public ResponseEntity<DroneDTO> register(@Valid @RequestBody DroneDTO droneDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(droneService.register(droneDTO));
    }

    @PutMapping(value = "/{id}", consumes = "application/json")
    public ResponseEntity<MedicationDTO> loadDrone(@PathVariable long id, @Valid @RequestBody MedicationDTO medicationDTO) throws Exception {
        return ResponseEntity.ok(droneService.loadDrone(id, medicationDTO));
    }

    @GetMapping("/available")
    public ResponseEntity<List<DroneDTO>> dronesAvailable() {
        return ResponseEntity.ok(droneService.getAvailableDrones());
    }

    @GetMapping("/{id}")
    public ResponseEntity<DroneDTO> getDrone(@PathVariable long id) throws Exception {
        return ResponseEntity.ok(droneService.getDrone(id));
    }
}
