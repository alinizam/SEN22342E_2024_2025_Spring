/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab.Example04.FactoryWithProtoype;

/**
 *
 * @author ali.nizam
 */
public class DatabaseFactory {

    static DatabaseConnection createconnection(String connectionType) {
        DatabaseConnection con = null;
        if (connectionType.equals("MySQL")) {
            con = (DatabaseConnection)PrototypeStore.getPrototype("MySQL");
        } else if (connectionType.equals("PostGre")) {
         //  con = new PostgreConnection();
        } else {
            throw new IllegalArgumentException("Invalid type");
        }
        return con;
    }
}
