/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab.Example02.AbstractFactoryUsingSeperateClass;

/**
 *
 * @author ali.nizam
 */
public class StandardFactory implements AbstractDatabaseFactory{

    @Override
       
    public DatabaseConnection createConnection(String connectionType) {
        DatabaseConnection con = null;
        if (connectionType.equals("MySQL")) {
            con = new MySQLStandardConnection();
        } else if (connectionType.equals("PostGre")) {
            con = new PostgrestandartConnection();
        } else {
            throw new IllegalArgumentException("Invalid type");
        }
        return con;
    }
    
}
