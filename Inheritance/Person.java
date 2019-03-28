public class Person extends Entity
{
    private int age;
    
    public Person()
    {
        super("default");
    }
    
    public Person(String name)
    {
        super(name);
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String toString()
    {
        String out = super.toString();
        out += "--> Person";
        return out;
    }
}
