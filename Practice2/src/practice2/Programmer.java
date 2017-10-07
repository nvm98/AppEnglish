package practice2;
public class Programmer {
    private String Name;
    private String Company;
    private int Age;
    public Programmer()
    {
        
    }
    public Programmer(String name,String company,int age)
    {
        this.Name = name;
        this.Company = company;
        this.Age = age;
            
    }
     public int getAge()
    {
        return this.Age;
    }
    public void setAge(int age)
    {
        this.Age = age;
    }
    public void setName(String name)
    {
        this.Name = name;
    }
    
    public String getName()
    {
        return this.Name;
    }
     public void setCompany(String company)
    {
        this.Company = company;
    }
    
    public String getCountry()
    {
        return this.Company;
    }
}
