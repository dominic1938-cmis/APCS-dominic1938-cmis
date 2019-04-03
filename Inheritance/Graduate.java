
public class Graduate extends Student
{
    public Graduate(String name, String major, int units)
    {
        super(name, major, units);
    }
    
    public int calculateTuition(int units)
    {
        units = units * 500;
        return units;
    }
}
