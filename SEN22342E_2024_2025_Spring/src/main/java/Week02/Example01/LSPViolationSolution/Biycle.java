/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example01.LSPViolationSolution;

 

/**
 *
 * @author ali.nizam
 */
class Bicycle implements IVehicle {
    int speed;

    public int getSpeed() {
        return speed;
    }
    @Override
    public void setSpeed(int speed) {
        if (speed > 50) {
            System.out.println("Bicycles cannot go above 50 km/h!");
        }
        this.speed = speed;
    }
}

