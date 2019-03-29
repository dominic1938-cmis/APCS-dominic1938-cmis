public class Person extends Entity
{
    
    public Person()
    {
        super("default");
    }
    
    public Person(String name)
    {
        super(name);
    }
    
    public void setAge(int newAge)
    {
        if (newAge <= 150){
            super.setAge(newAge);
        }
    }
    
    public String toString()
    {
        String out = super.toString();
        out += "--> Person";
        return out;
    }
}
