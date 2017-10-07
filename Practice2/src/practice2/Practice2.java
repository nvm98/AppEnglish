
package practice2;
import java.util.*;
public class Practice2 {
    
    public static int gcd(int a,int b)
    {
        while(a * b != 0)
        {
            if(a > b) a = a % b;
            else b = b % a;
        }
        return a + b;
    }
    
    public static int fib(int n)
    {
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fib(n - 1) + fib(n - 2); 
    }
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Check greatest common divisor");
       System.out.println(gcd(sc.nextInt(), sc.nextInt()));
       System.out.println("Check fibonaci at :");
        
       System.out.println(fib(sc.nextInt()));
       System.out.println("Check fraction");
       Fraction f1 = new Fraction(sc.nextInt(), sc.nextInt());
       Fraction f2 = new Fraction(sc.nextInt(), sc.nextInt());
       Fraction addResult = f1.Add(f2);
       System.out.println("Result after add ");
       addResult.getFraction();
       Fraction subtractResult = f1.Subtract(f2);
       System.out.println("Result after subtract ") ;
       subtractResult.getFraction();
       Fraction mulResult = f1.Multiple(f2);
       System.out.println("Result after multiple ");
       mulResult.getFraction();
       Fraction divResult = f1.Divisor(f2);
       System.out.println("Result after divide ");
       divResult.getFraction();
       System.out.println("f1 equal f2 is :");
       System.out.println(f1.equals(f2));
    }
}
