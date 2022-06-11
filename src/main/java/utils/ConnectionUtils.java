package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {
    public static Connection getConnection(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection("jdbc:sqlserver://localhost:1433;dataBaseName=qldc;user=sa;password=sa;encrypt=true;trustServerCertificate=true;");
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
        }
    }
}
