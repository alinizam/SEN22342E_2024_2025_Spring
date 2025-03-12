/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab.Example01.Factory;

/**
 *
 * @author ali.nizam
 */
public class Test {
    public static void main(String[] args) {
        DatabaseConnection con=DatabaseFactory.createconnection("MySQL");
        con.connect();
        DatabaseConnection con1=DatabaseFactory.createconnection("PostGre");
        con1.connect();
    }
}
