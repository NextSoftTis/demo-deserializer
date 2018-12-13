/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demodeserializer;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import java.io.Serializable;

/**
 *
 * @author 
 */
public class Car implements Serializable {

    @JsonDeserialize(using = CustomDeserialize.class)
    private Window windowOne;

    @JsonDeserialize(using = CustomDeserialize.class)
    private Window windowSecond;

    public Window getWindowOne() {
        return windowOne;
    }

    public void setWindowOne(Window windowOne) {
        this.windowOne = windowOne;
    }

    public Window getWindowSecond() {
        return windowSecond;
    }

    public void setWindowSecond(Window windowSecond) {
        this.windowSecond = windowSecond;
    }

}
