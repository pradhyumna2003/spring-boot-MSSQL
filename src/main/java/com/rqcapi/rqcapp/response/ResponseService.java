package com.rqcapi.rqcapp.response;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.rqcapi.rqcapp.model.Cylinder;
import com.rqcapi.rqcapp.repository.CylinderRpo;
@Service
public class ResponseService {
    
    @Autowired
    private CylinderRpo cylinderRpo;

    public Cylinder saveCylinder(Cylinder cylinder){
        cylinderRpo.save(cylinder);
        
        return cylinder;
    }
}