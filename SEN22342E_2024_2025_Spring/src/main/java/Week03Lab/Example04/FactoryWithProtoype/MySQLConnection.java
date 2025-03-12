/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab.Example04.FactoryWithProtoype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ali.nizam
 */
public class MySQLConnection extends DatabaseConnection{

    @Override
    public void connect() {
        System.out.println("Connected to MySQL");
    }


    
}
