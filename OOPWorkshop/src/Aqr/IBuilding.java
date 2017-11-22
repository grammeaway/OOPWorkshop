/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aqr;

import java.util.Map;

/**
 *
 * @author Victor Gram
 */
public interface IBuilding {
    String getName(); 
    String getLocation(); 
    Map<Integer, ISensor> getSensor();
    void addSensor(int TYPE);
    void removeSensor(int ID); 
}
