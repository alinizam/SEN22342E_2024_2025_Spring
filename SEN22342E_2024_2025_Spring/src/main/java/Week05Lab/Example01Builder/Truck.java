/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week05Lab.Example01Builder;

/**
 *
 * @author FSMVU
 */
public class Truck {
    static class TruckBuilder implements VehicleBuilder {

        private boolean airConditioning;
        private boolean sunroof;
        private boolean GPS;

       
        public Vehicle build(){
            Car c=new Car();
            c.GPS=this.GPS;
            c.airConditioning=this.airConditioning;
            c.sunroof=this.sunroof;
            return  c;
        } 

        @Override
        public TruckBuilder setairConditioning(boolean type) {
            this.airConditioning=type;
            return this;
        }

        @Override
        public TruckBuilder sunroof(boolean type) {
            this.sunroof=type;
            return this;
        }

        @Override
        public TruckBuilder GPS(boolean type) {
            this.GPS=type;
            return this;
        }
    }
}
