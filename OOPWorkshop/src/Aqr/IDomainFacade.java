/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aqr;

import java.util.List;

/**
 *
 * @author Victor Gram
 */
public interface IDomainFacade {
    IBuilding getBuilding(int i); 
    List<IBuilding> getBuildingList();
    void addBuilding(String name, String location);
    void removeBuilding(int i); 
    
    
}
