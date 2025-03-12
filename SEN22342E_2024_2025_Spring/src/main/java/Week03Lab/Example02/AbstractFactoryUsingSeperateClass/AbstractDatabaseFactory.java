/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week03Lab.Example02.AbstractFactoryUsingSeperateClass;

/**
 *
 * @author ali.nizam
 */
public interface AbstractDatabaseFactory {
    DatabaseConnection createConnection(String connectionType);
}
