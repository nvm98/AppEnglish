package practice3;
import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJunit {
    public static int checkMax(int a, int b)
    {
        return a > b ? a : b;
    }
    
    public static int getMinArr(int[]arr)
    {
        int length = arr.length;
        Arrays.sort(arr);
        return arr[0];
    }
    
    public static String bmi(int kg,double height)
    {
        double index = (kg)/(height * height);
        if(index < 18.5)
        {
            return "Thieu can";
        }
        else if(index >= 18.5 && index < 23)
        {
            
            return "Binh thuong";
        }
        else if(index >=23 && index < 25 )
        {
           
            return "Thua can";
        }
        else
        {
            return "Beo phi";
        }
    }
    
    @Test
    public void testbmi()
    {
        String a = bmi(50, 1.5);
        assertEquals(a, "Binh thuong");
    }
     @Test
    public void testbmi2()
    {
        String a = bmi(20, 1.5);
        assertEquals(a, "Thieu can");
    }
     @Test
    public void testbmi3()
    {
        String a = bmi(60, 1.7);
        assertEquals(a, "Binh thuong");
    }
     @Test
    public void testbmi4()
    {
        String a = bmi(60, 1.5);
        assertEquals(a, "Thua can");
    }
     @Test
    public void testbmi5()
    {
        String a = bmi(100, 1.5);
        assertEquals(a, "Beo phi");
    }
    @Test
    public void testMax()
    {
        int a = checkMax(5, 4);
        assertEquals(5, a);
        
        
        
        int e = checkMax(-100, 100);
        assertEquals(50, e);     
    } 
    @Test
    public void testMax2()
    {
        int b = checkMax(2, 3);
        assertEquals(3, b);
    }
    @Test
    public void testMax3()
    {
        int c = checkMax(10000, 1000);
        assertEquals(10000, c);
    }
    @Test
    public void testMax4()
    {
        int d = checkMax(0, 0);
        assertEquals(0, d);
    }
    @Test
    public void testMax5()
    {
        int e = checkMax(-100, 100);
        assertEquals(50, e);   
    }
    @Test
    public void testMinArr()
    {
        int[] arr1 = new int[]{1,2,3};
        int min1 = getMinArr(arr1);
        assertEquals(2, min1);
          
    }
    @Test
    public void testMinArr2()
    {
        int[] arr2 = new int[]{2,3,4};
        int min2 = getMinArr(arr2);
        assertEquals(2, min2);
    }
   
     @Test
    public void testMinArr3()
    {
        int[] arr3 = new int[]{0,0,0};
        int min3 = getMinArr(arr3);
        assertEquals(0, min3);
    }
    @Test
    public void testMinArr4()
    {
        int[] arr4 = new int[]{100,100,201,2000};
        int min4 = getMinArr(arr4);
        assertEquals(100, min4);
    }
    @Test
    public void testMinArr5()
    {
        int[] arr5 = new int[]{-1,0,1,-50};
        int min5 = getMinArr(arr5);
        assertEquals(-50, min5);
    }
}
