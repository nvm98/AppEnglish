package dsaa1;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DSAA1 {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.nextLine();
        String[] arr  = new String[size];
        for(int i = 0; i < size; i ++)
            arr[i]  = sc.nextLine();
        int numquery = sc.nextInt();
        sc.nextLine();
        String[] query = new String[numquery];
        int count = 0;
        for(int i = 0; i < numquery; i ++)
        {
            query[i] = sc.nextLine();
            
        }
        for(int i = 0; i < numquery; i ++)
        {
            for(int j = 0; j < size; j ++)
                if(arr[j].equalsIgnoreCase(query[i]))
                    count++;
            System.out.println(count);
            count = 0;
        }
        
    }
}

