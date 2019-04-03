
public class FriedEggMan extends SuperHero
{
    private String name;
    
    public String motto()
    {
        return "Great in the kitchen";
    }
    
    public FriedEggMan()
    {
        super();
        this.name = "FriedEggMan";
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
