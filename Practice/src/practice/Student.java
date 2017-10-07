package practice;
public class Student {
    private String name;
    private String id;
    private String group;
    private String email;
    public Student()
    {
        this.name = "Student";
        this.id = "000";
        this.group = "K59CB";
        this.email = "uet@vnu.edu.vn";
    }
    
    public Student(String name, String id, String email)
    {
        this.name = name;
        this.id = id;
        this.group = "K59CB";
        this.email = email;
    }
    
    public Student(Student s)
    {
        this.name = s.name;
        this.id = s.id;
        this.group = s.group;
        this.email = s.email;
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
    
    public String getInfo()
    {
        return this.name + " " + this.id + " " + this.group + " " + this.email;
    }
    
}


