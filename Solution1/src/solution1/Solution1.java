package solution1;
import java.io.*;
import java.util.*;

public class Solution1
{
    public static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left;
        for(int j = left; j <= right - 1; j ++)
        {
            if(arr[j] < pivot)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i ++;
            }
        }
        if(arr[i] > arr[right])
        {
            int temp = arr[i];
            arr[i] = arr[right];
            arr[right] = temp;
        }
        System.out.println(i);
        return i;
    }
    public static int pickNum(int[] arr, int left, int right, int median)
    {
        int pivotIndex = partition(arr,left, right);
        if(pivotIndex == median)
            return arr[pivotIndex];
        else if(pivotIndex > median)
        {
            return pickNum(arr,left,pivotIndex - 1, median);
        }
        else
        {
            return pickNum(arr, pivotIndex + 1, right,median);
        }
            
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr= new int[size];
        for(int  i = 0; i < size; i ++)
            arr[i] = sc.nextInt();
        System.out.println(pickNum(arr, 0, size - 1, size / 2));
    }
}