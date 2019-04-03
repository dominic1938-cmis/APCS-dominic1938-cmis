
public abstract class Student
{
    private String name;
    private String major;
    private int units;
    abstract public int calculateTuition(int units);
    
    public void setName(String name)
    {
        this. name = name;
    }
    
    public void setMajor(String major)
    {
        this. major = major;
    }
    
    public void setUnits(int units)
    {
        this. units = units;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getMajor()
    {
        return major;
    }
    
    public int getUnits()
    {
        return units;
    }
    
    public Student(String name, String major, int units)
    {
        this. name = name;
        this. major = major;
        this. units = units;
    }
    
    public String toString(){
        String out = "Name: " + name + "\t" + "Major: " + major + "\t" + "Cost: " + ("$") + calculateTuition(units);
        return out;
    }
}
