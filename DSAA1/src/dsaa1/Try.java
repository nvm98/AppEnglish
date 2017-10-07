
package dsaa1;
import java.util.*;

public class Try {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
            arr[i]  = sc.nextInt();
        Arrays.sort(arr);
        int dif = 0;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < size - 1; i ++)
        {
            dif = arr[i + 1] - arr[i];
            if(dif < min)
                min = dif;
        }
        for(int i = 0; i < size - 1; i ++)
        {
            if(arr[i + 1] - arr[i] == min)
                System.out.print(arr[i] +" "+ arr[i+1]);
        }
    }
}
