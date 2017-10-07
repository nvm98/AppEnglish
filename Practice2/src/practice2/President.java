
package practice2;

public class President {
    private String Name;
    private String Country;
    private int Age;
    public President()
    {
        
    }
    public President(String name, String country, int age)
    {
        this.Name = name;
        this.Country = country;
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
    public void setCountry(String country)
    {
        this.Country = country;
    }
    public String getCountry()
    {
        return this.Country;
    }
    public void setAge(int age)
    {
        this.Age = age;
    }
    public int getAge()
    {
        return this.Age;
    }
}
