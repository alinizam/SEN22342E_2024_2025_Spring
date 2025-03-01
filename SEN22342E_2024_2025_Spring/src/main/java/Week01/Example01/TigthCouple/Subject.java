/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week01.Example01.TigthCouple;

/**
 *
 * @author ali.nizam
 */
class Subject {
        static Topic t=new Topic(); 
        public static void startReading(String definition ) {
            t.definition=definition;
            t.understand(); 
        }
       
 }