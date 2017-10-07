package sq;
import java.util.*;
public class SQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int h1 = 0, h2 = 0, h3 = 0;
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        int[] arr3 = new int[n3];
        for(int h1_i=0; h1_i < n1; h1_i++)
        {
            arr1[h1_i] = sc.nextInt();
            h1 += arr1[h1_i];
        }
        
        for(int h2_i=0; h2_i < n2; h2_i++)
        {
            arr2[h2_i] = sc.nextInt();
            h2 += arr2[h2_i];
        }
     
        for(int h3_i=0; h3_i < n3; h3_i++)
        {
            arr3[h3_i] = sc.nextInt();
            h3 += arr3[h3_i];
        }
        Stack<Integer> s1 = new Stack<Integer>();
        Stack<Integer> s2 = new Stack<Integer>();
        Stack<Integer> s3 = new Stack<Integer>();
        for(int i = n1 - 1; i >= 0; i --)
        {
            s1.push(arr1[i]);
        }
        for(int i = n2 - 1; i >= 0; i --)
        {
            s2.push(arr2[i]);
        }
        for(int  i = n3 - 1; i >= 0; i--)
        {
            s3.push(arr3[i]);
        }
        
        while(h1 != h2 || h2 != h3)
        {
            while(h1 != h2)
            {
                if(h1 > h2)
                {
                    int data = s1.peek();
                    s1.pop();
                    h1 -= data;
                }
                else 
                {
                    int data = s2.peek();
                    s2.pop();
                    h2 -= data;
                }
            }
            while(h2 != h3)
            {
                if(h2 > h3)
                {
                    int data = s2.peek();
                    s2.pop();
                    h2 -= data;
                }
                else 
                {
                    int data = s3.peek();
                    s3.pop();
                    h3 -= data;
                }
            }
        }
        System.out.println(h1);
    }
}
