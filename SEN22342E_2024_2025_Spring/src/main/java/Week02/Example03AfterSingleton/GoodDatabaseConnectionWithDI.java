/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Week02.Example03AfterSingleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ali.nizam
 * With dependecy injection
 */
public class GoodDatabaseConnectionWithDI {
    private static GoodDatabaseConnectionWithDI instance;
    private Connection connection;

    private String url;
    private String user;
    private String password;
    private static interface IConfiguration {
        String getConnectionString();
        String getUser();
        String getPassword();
      
    }
    private IConfiguration config;
    
    private GoodDatabaseConnectionWithDI(IConfiguration config) {
        //Internal implementation can be varied.
        this.url = config.getConnectionString();
        this.user = config.getUser();
        this.password = config.getPassword();

        try {
            this.connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    public static GoodDatabaseConnectionWithDI getInstance(IConfiguration config) {
        if (instance == null) {
            instance = new GoodDatabaseConnectionWithDI(config);
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}