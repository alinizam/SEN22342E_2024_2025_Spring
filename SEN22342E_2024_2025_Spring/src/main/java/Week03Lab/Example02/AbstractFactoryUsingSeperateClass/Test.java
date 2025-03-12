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
public class Test {
    public static void main(String[] args) {
        AbstractDatabaseFactory f=new PooledFactory();
        DatabaseConnection pooledMySQL= f.createConnection("MySQL");
        pooledMySQL.connect();
       
        AbstractDatabaseFactory f1=new StandardFactory();
        DatabaseConnection standardMySQL= f1.createConnection("MySQL");
        standardMySQL.connect();
    }
            
}
