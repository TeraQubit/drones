package com.musalasoft.drones.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Model {
    LightWeight("LIGHT_WEIGHT"),
    MiddleWeight("MIDDLE_WEIGHT"),
    CruiserWeight("CRUISER_WEIGHT"),
    HeavyWeight("HEAVY_WEIGHT");

    @JsonValue
    public String label;

    private Model(String label){
        this.label = label;
    }

    @JsonCreator
    public static Model valueOfLabel(String label) {
        for (Model e : values()) {
            if (e.label.equals(label)) {
                return e;
            }
        }
        return null;
    }
}
