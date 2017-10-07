
package practice2;

public class Computer {
    private String name;
    private String id;
    
    public Computer()
    {
    }
    
    public Computer(String name, String id)
    {
        this.name = name;
        this.id = id;
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
    
    
}
