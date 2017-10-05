package appenglish;
import java.io.*;
import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;

public class Demo {
    public static void main(String[] args)
    {    
        String connectionUrl = "jdbc:sqlserver://localhost:1433;" +  
         "databaseName=AppEnglish;integratedSecurity=true;";  

      // Declare the JDBC objects.  
        Connection connection = null;  
        Statement statement = null;   
        ResultSet resultSet = null;  

        try 
        {
            
         // Establish the connection.  
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            connection = DriverManager.getConnection(connectionUrl);  
            
            String sqlquery = "SELECT * FROM Subject";
            statement = connection.createStatement();
            resultSet =  statement.executeQuery(sqlquery);
            while (resultSet.next())   
            {  
                System.out.println(resultSet.getString(1) + " ");
            }  
            
         
        }  

      // Handle any errors that may have occurred.  
        catch (Exception e) 
        {  
            e.printStackTrace();  
        }  
   
    }
}
