package connection;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJDBC {
    public static void main(String[] args) {
    	
    	Connection connection = null;
        try {
            
            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);

            String serverName = "localhost";
            String mydatabase = "BD_ACADEMIA_NOBOLSO";
            String url = "jdbc:mysql://" + serverName +  "/" + mydatabase;
            String username = "as";
            String password = "RPSsql12345";
            connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
        	e.printStackTrace();
        }
        
    }
    
}
