/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab.Example02.AbstractFactoryUsingMethod;

/**
 *
 * @author ali.nizam
 */
public class PostGreFactory implements AbstractDatabaseFactory{

    @Override
    public DatabaseConnection createStandardConnection() {
        return new PostgrestandartConnection(); //
    }

    @Override
    public DatabaseConnection createPooledConnection() {
         return new PostgrePooledConnection(); //
    }
    
}
