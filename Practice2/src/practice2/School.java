
package practice2;

public class School {
    private String name;
    private String location;
    public School()
    {
    }
    
    public School(String name, String location)
    {
        this.name = name;
        this.location = location;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    public void setLocation(String location)
    {
        this.location = location;
    }
    
    public String getLocation()
    {
        return this.location;
    }
}

