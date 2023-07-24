package com.apisqlapp.apisql.repository;




import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;


import com.apisqlapp.apisql.model.Cylinder;

public interface CylinderRpo extends JpaRepository<Cylinder, Timestamp> {
}