package com.rqcapi.rqcapp.repository;




import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rqcapi.rqcapp.model.Cylinder;

public interface CylinderRpo extends JpaRepository<Cylinder, Timestamp> {
}