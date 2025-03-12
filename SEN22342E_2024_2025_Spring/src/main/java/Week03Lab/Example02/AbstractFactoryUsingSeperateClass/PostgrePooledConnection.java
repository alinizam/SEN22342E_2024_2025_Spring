/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab.Example02.AbstractFactoryUsingSeperateClass;

import Week03Lab.Example02.AbstractFactoryUsingMethod.*;


/**
 *
 * @author ali.nizam
 */
public class PostgrePooledConnection implements DatabaseConnection{

    @Override
    public void connect() {
        System.out.println("Connected to pooled Postgre");
    }
    
}
