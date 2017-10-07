
package test;

public class Test {

    public static int numDigits(int n)
    {
        int k = 0;
        while(n >=0 )
        {
            k ++;
            n /= 10;
        }
        return k;
    }
    public static void main(String[] args) {
      
       String a = "0" + "0" + "0" + 1;
       for(int i = 1; i < 100; i ++)
       {
           
           if(numDigits(i) < 4)
           {
               for(int j = 1; j <= 4 - numDigits(i); j ++)
               {
                   String b = "0" + b;
                   
               }
           }
       }
       System.out.println(a);
    }
    
}
