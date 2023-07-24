package com.apisqlapp.apisql.response;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.apisqlapp.apisql.model.Cylinder;
import com.apisqlapp.apisql.repository.CylinderRpo;
@Service
public class ResponseService {
    
    @Autowired
    private CylinderRpo cylinderRpo;

    public Cylinder saveCylinder(Cylinder cylinder){
        cylinderRpo.save(cylinder);
        
        return cylinder;
    }
}