/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01.Example01.LossCouple;

/**
 *
 * @author ali.nizam
 */
class Subject {
    ITopic t;

    public Subject(ITopic t) {
        this.t = t;
    }
        
    public void startReading() {
        t.understand(); 
    }
       
 }