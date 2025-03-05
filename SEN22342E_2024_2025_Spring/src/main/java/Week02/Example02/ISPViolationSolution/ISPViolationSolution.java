/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example02.ISPViolationSolution;

import Week02.Example02.ISPViolation.*;

/**
 *
 * @author ali.nizam
 */
public class ISPViolationSolution {

    interface Worker {

        void work();
 
    }

    interface IHuman extends Worker,HumanWorkerAction{

         void eat();

        void sleep();
 
    }
    
     interface HumanWorkerAction {

         void eat();

        void sleep();
 
    }
    
    static class Robot implements Worker {

        @Override
        public void work() {
            System.out.println("Robot is working...");
        }

       
    }

    static class Human implements IHuman {

        @Override
        public void work() {
            System.out.println("Human is working...");
        }

        @Override
        public void eat() {
            System.out.println("Human is eating...");
        }

        @Override
        public void sleep() {
            System.out.println("Human is sleeping...");
        }
    }

    public class ISPVViolationExample {

        public static void main(String[] args) {
            Worker robot = new Robot();
            Human human = new Human();

            robot.work();
            human.work();
            
        }
    }
}
