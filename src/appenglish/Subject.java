package appenglish;
import static appenglish.AppUI.connectionUrl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class Subject 
{
   
    private String subject;
    private String initializeDate;
    
    public Subject(String subject,String initializeDate)
    {
        this.subject = subject;
        this.initializeDate = initializeDate;
    }
    
}
