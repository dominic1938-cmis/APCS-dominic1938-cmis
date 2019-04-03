
public class AsteroidMan extends SuperHero
{
    private String name;
    
    public String motto()
    {
        return "Dies after collision";
    }
    
    public AsteroidMan()
    {
        super();
        this.name = "AsteroidMan";
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return "" + name;
    }
}
