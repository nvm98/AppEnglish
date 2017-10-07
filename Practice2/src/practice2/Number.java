
package practice2;
public class Number {
    private String name;
    private String id;
    private String type;
    public Number()
    {
    }
    
    public Number(String name, String id,String type)
    {
        this.name = name;
        this.id = id;
        this.type = type;
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
    
    public void setType(String type)
    {
        this.type = type;
    }
     
    public String getType()
    {
        return this.type;
    }
}
