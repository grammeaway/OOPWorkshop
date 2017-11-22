/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

/**
 *
 * @author Victor Gram
 */
public abstract class Sensor {
    private double reading; 
    private int sensorID;
    
    public Sensor (int id) {
        this.sensorID = id;
    
}
    
    public abstract double getReading() ; 
    
}
