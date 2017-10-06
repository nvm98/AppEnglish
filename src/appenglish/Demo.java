package appenglish;
import java.io.*;
import java.awt.image.BufferedImage;
import java.sql.*;
import com.microsoft.sqlserver.jdbc.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.*;
public class Demo {
    private static final String IMG_PATH = "C:/Users/Bui/Pictures/JohnSmith.png";
    public static void main(String[] args)
    {    
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        String s = dateFormat.format(date);
        System.out.println(s);
//        try 
//        {
//            BufferedImage img = ImageIO.read(new File(IMG_PATH));
//            ImageIcon icon = new ImageIcon(img);
//            JLabel label = new JLabel(icon);
//            JOptionPane.showMessageDialog(null, label);
//        }
//        catch (IOException e) 
//        {
//            e.printStackTrace();
//        }
        
   } 
   
}
