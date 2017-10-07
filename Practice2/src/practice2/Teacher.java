
package practice2;

public class Teacher {
    private String Name;
    private String School;
    private int Age;
    public Teacher()
    {
        
    }
    public Teacher(String name,String school,int age)
    {
        this.Name = name;
        this.School = school;
        this.Age = age;
    }
    public String getName()
    {
        return this.Name;
    }
    public void setName(String name)
    {
        this.Name = name;
    }
    public String getSchool()
    {
        return this.School;
    }
    public void setSchool(String school)
    {
        this.School = school;
    }
    public int getAge()
    {
        return this.Age;
    }
    public void setAge(int age)
    {
        this.Age = age;
    }
}
