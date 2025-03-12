/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03.Example03.Prototype;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        IRootCourse courseComputer=PrototypeStore.getCourses("CPI2025");
        courseComputer.setLecturer("Ahmet Ak");
        IRootCourse courseSoftware=PrototypeStore.getCourses("CPI2025");
        courseComputer.setLecturer("Ahmet Ak");
    }
}
