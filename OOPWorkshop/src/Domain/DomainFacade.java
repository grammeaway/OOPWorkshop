/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;

import Aqr.IBuilding;
import Aqr.IDomainFacade;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Victor Gram
 */
public class DomainFacade implements IDomainFacade {
    public List<IBuilding> buildingList;
    public Map<Integer, Map<Integer, Map<Integer, Map<Integer, Map<Integer, Double>>>>> readingHistory;
    
    public DomainFacade () {
        buildingList = new ArrayList<>(); 
        readingHistory = new HashMap<>(); 
    }
    
    
    public void addBuilding (IBuilding building) { 
        buildingList.add(building);
    }

    @Override
    public IBuilding getBuilding(int i) {
        return buildingList.get(i);
    }

    @Override
    public List<IBuilding> getBuildingList() {
        return buildingList;
    }

    @Override
    public void addBuilding(String name, String location) {
        buildingList.add((IBuilding) new Building(name, location)); 
    }

    @Override
    public void removeBuilding(int i) {
        buildingList.remove(i); 
    }
    
    hellohewifoh wrf
            
    
}
