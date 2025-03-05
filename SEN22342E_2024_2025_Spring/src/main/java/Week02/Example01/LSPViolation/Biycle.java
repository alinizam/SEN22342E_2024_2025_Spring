/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example01.LSPViolation;

/**
 *
 * @author ali.nizam
 */
class Bicycle extends Vehicle {
    @Override
    public void setSpeed(int speed) {
        if (speed > 50) {
            throw new IllegalArgumentException("Bicycles cannot go above 50 km/h!");
        }
        this.speed = speed;
    }
}

