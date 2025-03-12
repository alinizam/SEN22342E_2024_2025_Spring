/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example03.Prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class ProgrammingForCurriculum implements Cloneable, IRootCourse{
     String lecturer;
     int year;

    public ProgrammingForCurriculum(int year){
        this.year = year;
    }

    public String getLecturer() {
        return lecturer;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    @Override
    public Object clone() {
         try {
             return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
         } catch (CloneNotSupportedException ex) {
            
             Logger.getLogger(ProgrammingForCurriculum.class.getName()).log(Level.SEVERE, null, ex);
         }
          return null;
    }
    

   
     
}
