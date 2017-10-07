package hackerrank;
import java.io.*;
import java.util.*;
public class Hackerrank 
{     
     public static void insertIntoSorted(int[] ar) {
              int unsortedNum = ar[ar.length - 1];
        for(int i = ar.length - 2; i >= 0;i -- )
        {
                
            if(ar[i] > unsortedNum && i != 0)
            {
                ar[i + 1] = ar[i];
                printArray(ar);
            }
            else if(ar[i] > unsortedNum && i == 0)
            {
                int temp;
                temp = ar[0];
                ar[0] = unsortedNum;
                ar[1] = temp;
                printArray(ar);
            }
            else
            {
                ar[ i + 1] = unsortedNum;
                printArray(ar);
                return;
            }
        }
       

    }        
         public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int s = in.nextInt();
            int[] ar = new int[s];
             for(int i=0;i<s;i++){
                ar[i]=in.nextInt(); 
             }        
             insertIntoSorted(ar);
    }
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
}
