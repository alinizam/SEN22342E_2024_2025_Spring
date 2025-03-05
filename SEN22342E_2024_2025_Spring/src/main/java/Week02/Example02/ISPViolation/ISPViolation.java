/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example02.ISPViolation;

/**
 *
 * @author ali.nizam
 */
public class ISPViolation {

    interface Worker {

        void work();

        void eat();

        void sleep();
    }

    static class Robot implements Worker {

        @Override
        public void work() {
            System.out.println("Robot is working...");
        }

        @Override
        public void eat() {
            // Robots do not eat, but they must implement this method
            throw new UnsupportedOperationException("Robots do not eat!");
        }

        @Override
        public void sleep() {
            // Robots do not sleep, but they must implement this method
            throw new UnsupportedOperationException("Robots do not sleep!");
        }
    }

    static class Human implements Worker {

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
            Worker human = new Human();

            robot.work();

            human.work();
            human.eat();
            human.sleep();
        }
    }
}
