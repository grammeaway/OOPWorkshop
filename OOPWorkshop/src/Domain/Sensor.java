/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Aqr.ISensor;

/**
 *
 * @author Victor Gram
 */
public abstract class Sensor implements ISensor {
    private double reading; 
    private int sensorID;
    private final int TYPE; 
    
    public Sensor (int id, int type) {
        this.sensorID = id;
        this.TYPE = type;
    
}

    @Override
    public int getSensorID() {
        return sensorID;
    }

    public void setSensorID(int sensorID) {
        this.sensorID = sensorID;
    }
    
    @Override
    public abstract double getReading(); 

    @Override
    public int getTYPE() {
        return TYPE; 
    }

    @Override
    public String toString() {
        return "Sensor ID: " + sensorID + "\n" + "Sensor type: " + TYPE;
    }
    
}
