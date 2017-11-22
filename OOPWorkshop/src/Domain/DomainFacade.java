/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Victor Gram
 */
public class DomainFacade {
    public List<Building> buildingList;
    public Map<Integer, Map<Integer, Map<Integer, Map<Integer, Map<Integer, Double>>>>> readingHistory;
    
    
    public Building getbuilding(int i) { 
        return buildingList.get(i);
    }
    
    public void addBuilding (Building building) { 
        buildingList.add(building);
    }
    
}
