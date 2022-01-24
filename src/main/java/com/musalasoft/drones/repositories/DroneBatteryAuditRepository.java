package com.musalasoft.drones.repositories;


import com.musalasoft.drones.entities.DroneBatteryAudit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DroneBatteryAuditRepository extends CrudRepository<DroneBatteryAudit, Long> {
}
