package com.musalasoft.drones.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.musalasoft.drones.enums.Model;
import com.musalasoft.drones.enums.State;
import com.musalasoft.drones.interfaces.Load;
import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Data
public class DroneDTO {

    private long id;

    @JsonProperty
    @NotBlank(message = "Serial Number is mandatory")
    private String serialNumber;

    @JsonProperty
    private Model model;

    @JsonProperty
    private int weightLimit;

    @JsonProperty
    @Range(min=0, max=100, message = "Battery Capacity must be in the range of 0 to 100")
    private int batteryCapacity;

    @JsonProperty
    private State state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<Load> load;

    public DroneDTO() {}

    public DroneDTO(@NotBlank(message = "Serial Number is mandatory") String serialNumber,
                    Model model,
                    @NotBlank(message = "Weight limit is mandatory") int weightLimit,
                    @NotBlank(message = "Battery Capacity is mandatory") @Range(min=0, max=100, message = "Battery Capacity must be in the range of 0 to 100") int batteryCapacity,
                    State state) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.weightLimit = weightLimit;
        this.batteryCapacity = batteryCapacity;
        this.state = state;
    }
    public DroneDTO(long id,
                    @NotBlank(message = "Serial Number is mandatory") String serialNumber,
                    Model model,
                    @NotBlank(message = "Weight limit is mandatory") int weightLimit,
                    @NotBlank(message = "Battery Capacity is mandatory") @Range(min=0, max=100, message = "Battery Capacity must be in the range of 0 to 100") int batteryCapacity,
                    State state) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.model = model;
        this.weightLimit = weightLimit;
        this.batteryCapacity = batteryCapacity;
        this.state = state;
    }
}
