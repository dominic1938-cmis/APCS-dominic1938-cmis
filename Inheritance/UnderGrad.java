
public class UnderGrad extends Student
{
    public UnderGrad(String name, String major, int units)
    {
        super(name, major, units);
    }
    
    public int calculateTuition(int units)
    {
        units = units * 250;
        return units;
    }
}
