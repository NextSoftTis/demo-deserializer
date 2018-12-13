/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demodeserializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 
 */
@RestController
public class CarController {

   @Autowired
   private CarManager manager;
    
   @PostMapping(path = "/car")
   public Car save(@RequestBody Car car) throws JsonProcessingException {
       return manager.serializeCar();
   }    
}
