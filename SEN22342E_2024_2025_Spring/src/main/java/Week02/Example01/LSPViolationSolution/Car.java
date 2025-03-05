/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example01.LSPViolationSolution;
 

/**
 *
 * @author ali.nizam
 */
class Car implements IVehicle {
    int speed;
    @Override
    public void setSpeed(int speed) {
        this.speed=speed;
    }

    public int getSpeed() {
        return speed;
    }
    
    
}

