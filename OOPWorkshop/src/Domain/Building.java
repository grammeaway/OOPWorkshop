/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Aqr.IBuilding;
import Aqr.ISensor;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Victor Gram
 */
public class Building implements IBuilding {
    private Map<Integer, ISensor> sensorMap; 
    private String location; 
    private String name; 
    
    public Building (String name, String location) { 
        this.name = name; 
        this.location = location;
        sensorMap = new HashMap<>(); 
    }
    
    @Override
    public void addSensor (int TYPE) { 
        ISensor s = null;
        switch (TYPE) { 
            case 0:
                s = new TempSensor(sensorMap.size()); 
                break;
            case 1: 
                s = new Co2Sensor(sensorMap.size());
                break;
        }
        sensorMap.put(sensorMap.size(),s);
        
    }
    @Override
    public void removeSensor (int ID) { 
        sensorMap.remove(ID);
    }
    
  

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return location;
    }
    

    @Override
    public Map<Integer, ISensor> getSensor() {
        return sensorMap;
    }
    
    
    
}
