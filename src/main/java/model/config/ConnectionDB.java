package model.config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDB {
    private static String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/demoProduce";
    private static String USER = "root";
    private static String PASSWORD = "hung123456789";
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL,USER,PASSWORD);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void  closeConnection(Connection conn){
        try {
            if (conn != null) {
                conn.close();
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

}
