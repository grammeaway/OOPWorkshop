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
public class Co2Sensor extends Sensor {

    public Co2Sensor(int id) {
        super(id, 1);
    }
    

    @Override
    public double getReading() {
        return (Math.random() * 10);
    }
    
}
