
public class PostGraduate extends Student
{
    public PostGraduate(String name, String major, int units)
    {
        super(name, major, units);
    }
    
    public int calculateTuition(int units)
    {
        units = units * 750;
        return units;
    }
}
