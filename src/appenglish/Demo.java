
package appenglish;
import java.io.*;

public class Demo {
    public static void WriteFile() throws IOException
    {
        FileOutputStream fos = new FileOutputStream("demo.txt");
        String text = "The quick brown fox jump over the lazy dog";
        byte[] textAsBytes = text.getBytes();
        fos.write(textAsBytes);
    }
    public static void ReadFile() throws IOException
    {
        FileInputStream fis = new FileInputStream("demo.txt");
        int c ;
        while((c = fis.read()) != -1)
        {
            System.out.println(c);
        }
        fis.close();
    }
    public static void main(String[] args)
    {
        
    }
}
