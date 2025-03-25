/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week04.Bridge;

/**
 *
 * @author ali.nizam
 */
public class Client {
    public static void main(String[] args) {
        Student s=new SEStudent(new Register());
        s.sayMySituation();
        Student s1=new CEStudent(new Graduate());
        s1.sayMySituation();
        Student s2=new CEStudent(()->{System.out.println("Candidate");});
        s2.sayMySituation();
        
    }
}
