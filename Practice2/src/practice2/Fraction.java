
package practice2;


public class Fraction {
    private int numerator;
    private int denomirator;
    public Fraction()
    {
    }
    public Fraction(int nume,int deno)
    {
        this.numerator = nume;
        this.denomirator = deno;
    }
    public int getNum()
    {
        return this.numerator;
    }
    public static int gcd(int a,int b)
    {
        while(a * b != 0)
        {
            if(a > b) a = a % b;
            else b = b % a;
        }
        return a + b;
    }
    public void getFraction()
    {
        if(this.numerator == 0)
            System.out.println(this.numerator);
        else if(this.numerator == this.denomirator)
            System.out.println("1");
        else
        {
            int a = gcd(this.numerator, denomirator);
            this.numerator /= a;
            this.denomirator /= a;
            System.out.println(this.numerator+"/"+this.denomirator);
        }
        
    }
    public int getDen()
    {
        return this.denomirator;
    }
    public Fraction Add(Fraction f2)
    {
        Fraction result = new Fraction();
        result.denomirator = this.denomirator * f2.denomirator;
        result.numerator = this.numerator*f2.denomirator + f2.numerator*this.denomirator;
        return result;
    }
    
    public Fraction Subtract(Fraction f2)
    {
        Fraction result = new Fraction();
        result.denomirator = this.denomirator * f2.denomirator;
        result.numerator = this.numerator*f2.denomirator - f2.numerator*this.denomirator;
        return result;
    }
    
    public Fraction Multiple(Fraction f2)
    {
        Fraction result = new Fraction();
        result.denomirator = this.denomirator * f2.denomirator;
        result.numerator = this.numerator*f2.numerator;
        return result;
    }
    public Fraction Divisor(Fraction f2)
    {
        if(f2.numerator == 0)
        {
            System.out.println("Can't divide we 'll return the initial fraction");
            return this;
        }
        Fraction result = new Fraction();
        result.denomirator = this.denomirator * f2.numerator;
        result.numerator = this.numerator*f2.denomirator;
        return result;
    }
    public boolean equals(Fraction f2)
    {
        if(this.numerator == 0 && f2.numerator == 0) return true;
        else return this.Divisor(f2).denomirator == this.Divisor(f2).numerator;
    }
}
