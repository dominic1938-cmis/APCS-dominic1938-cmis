
public class VeryCoolMan extends SuperHero
{
    private String name;
    
    public String motto()
    {
        return "Makes friends on his bike and leather jacket";
    }
    
    public VeryCoolMan()
    {
        super();
        this.name = "VeryCoolMan";
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
