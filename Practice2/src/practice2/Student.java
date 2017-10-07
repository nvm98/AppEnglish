
package practice2;

public class Student {
    private String name;
    private String id;
    private String group;
    private String email;
    public Student()
    {
    }
    
    public Student(String name, String id, String email,String group)
    {
        this.name = name;
        this.id = id;
        this.group = group;
        this.email = email;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
     public void setId(String id)
    {
        this.id = id;
    }
     
    public String getId()
    {
        return this.id;
    }
    
    public void setGroup(String group)
    {
        this.group = group;
    }
     
    public String getGroup()
    {
        return this.group;
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
}
