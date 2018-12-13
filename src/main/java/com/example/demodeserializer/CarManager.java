/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demodeserializer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.stereotype.Component;

/**
 *
 * @author 
 */
@Component
public class CarManager {

    private ObjectMapper mapper = new ObjectMapper();
    
    public CarManager() {
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    public Car serializeCar() throws JsonProcessingException {
        // Node Mocked testing mode.
        ObjectNode node = mapper.createObjectNode();

        ObjectNode windowOne = mapper.createObjectNode();
        windowOne.put("value1", "Testing 1");
        windowOne.put("value2", "Testing 2");

        ObjectNode windowSecond = mapper.createObjectNode();
        windowSecond.put("value1", "Testing 1 1");
        windowSecond.put("value2", "Testing 1 2");

        node.set("windowOne", windowOne);
        node.set("windowSecond", windowSecond);

        Car car = mapper.treeToValue(node, Car.class);
        // Here is where I get car just with value windowOne field and second Window is null.
        // When debbugging, you will find it.

        return car;
    }

}
