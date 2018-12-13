/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demodeserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.io.IOException;

/**
 *
 * @author 
 */
public class CustomDeserialize extends StdDeserializer<Window> {

    public CustomDeserialize() {
        this(null);
    }

    public CustomDeserialize(Class<?> vc) {
        super(vc);
    }

    @Override
    public Window deserialize(JsonParser jsonParser, DeserializationContext dc) throws IOException, JsonProcessingException {
        JsonNode jsonNode = jsonParser.getCodec().readTree(jsonParser);
        String field = jsonParser.nextFieldName();
        String nextField = jsonParser.nextFieldName();
        return new Window(field + nextField, jsonNode.getNodeType().toString());
    }

}

