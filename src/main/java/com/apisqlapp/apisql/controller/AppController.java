package com.apisqlapp.apisql.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.logging.Logger;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apisqlapp.apisql.model.Cylinder;

import com.apisqlapp.apisql.response.ResponseService;


@RestController
@RequestMapping("/cylinder")
public class AppController {
    @Autowired
	ResponseService responseService;
    

    @PostMapping(value = "/cylinder/api")
    public ResponseEntity<Cylinder> postMethodName ( @RequestBody Cylinder cylinder) {
        Logger logger=Logger.getLogger(this.getClass().getName());
        
        int i=1;
        LocalDateTime localDateTime = LocalDateTime.now();
        
        Timestamp ts=Timestamp.valueOf(localDateTime);
        try {
            if(cylinder.getSerialNo().equals("") ||cylinder.getStDueDate().equals("")||cylinder.getRemark().equals("") ){
                i=0;
            }
            if(i==1){
                logger.info("Valid Input");
                Cylinder c=responseService.saveCylinder(new Cylinder(ts, cylinder.getTimeVal(), cylinder.getSerialNo(), cylinder.getCylinderType(), cylinder.getVldValue(), cylinder.getOldValue(), cylinder.getGrossWeight(), cylinder.getTareWeight(), cylinder.getVldResultFlag(), cylinder.getOldResultFlag(), cylinder.getGrossWeightResultFlag(), cylinder.getCarousel(), cylinder.getResultFlag(), cylinder.getStDueDate(),cylinder.getRemark()));
                logger.info("Saved to DataBase successfully");
                return new ResponseEntity <>(c,HttpStatus.OK);
            }
			else{
                logger.info("Internal error");
                return new ResponseEntity <>(null,HttpStatus.BAD_REQUEST);
            }
			
            
		} catch (Exception e) {
            e.printStackTrace();
			
            return new ResponseEntity <>(null,HttpStatus.BAD_REQUEST);
		}
    }
    
}
