public class Place extends Entity
{
    private String type;
    
    public Place()
    {
        super("default");
    }
    
    public Place(String name)
    {
        super(name);
    }
    
    public void setAge(String type)
    {
        this.type = type;
    }
    
    public String getType()
    {
        return type;
    }
    
    public String toString()
    {
        String out = super.toString();
        out += "--> Place";
        return out;
    }
}
