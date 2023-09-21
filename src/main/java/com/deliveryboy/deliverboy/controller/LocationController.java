package com.deliveryboy.deliverboy.controller;

import com.deliveryboy.deliverboy.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class LocationController {

    @Autowired
    private KafkaService kafkaService;
    @RequestMapping("/update")
    public ResponseEntity<?>updateLocation(){

        kafkaService.updateLocation("( " +Math.round(Math.random() * 100 )+ "," + Math.random() * 100 +" " + ")");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
