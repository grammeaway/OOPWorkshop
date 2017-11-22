/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.Map;

/**
 *
 * @author Victor Gram
 */
public class Building {
    private Map<Integer, Sensor> sensorMap; 
    private String location; 
    private String name; 
    
    public void addSensor (Sensor sensor) { 
        sensorMap.put(sensor.getSensorID(), sensor);
        
    }
    public void removeSensor (int ID) { 
        sensorMap.remove(ID);
    }
    
    public Map<Integer, Sensor> getSensorMap () { 
        return sensorMap; 
    } 
    
    
    
}
