package com.musalasoft.drones.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.musalasoft.drones.interfaces.Load;
import lombok.Data;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class MedicationDTO implements Load {
    private long id;

    @JsonProperty
    @NotBlank(message = "Medication name is mandatory")
    private String name;

    @JsonProperty
    private int weight;

    @JsonProperty
    @Pattern( regexp = "^[a-zA-Z0-9_\\-]+$", message="Name can only contain letters, numbers, '-', '_'")
    private String code;

    @JsonProperty
    @NotBlank(message = "Medication name is mandatory")
    private String image;

    private DroneDTO drone;

    public MedicationDTO() {
    }

    public MedicationDTO(String name, int weight, String code, String image) {
        this.name = name;
        this.weight = weight;
        this.code = code;
        this.image = image;
    }

    public MedicationDTO(long id, String name, int weight, String code, String image, DroneDTO drone) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        this.code = code;
        this.image = image;
        this.drone = drone;
    }
}
