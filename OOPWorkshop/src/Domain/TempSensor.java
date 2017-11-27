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
public class TempSensor extends Sensor {

    public TempSensor(int id) {
        super(id, 0);
    }

    @Override
    public double getReading() {
        return (Math.random() * 10);
    }
    
}
