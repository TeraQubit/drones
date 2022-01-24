package com.musalasoft.drones.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "drone_battery_audit")
public class DroneBatteryAudit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="drone_id")
    private Drone drone;

    @Column
    private int batteryLevel;

    @Column
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdAt = new Date();

    public DroneBatteryAudit() {
    }

    public DroneBatteryAudit(Drone drone) {
        this.drone = drone;
        this.batteryLevel = drone.getBatteryCapacity();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Drone getDrone() {
        return drone;
    }

    public void setDrone(Drone drone) {
        this.drone = drone;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
