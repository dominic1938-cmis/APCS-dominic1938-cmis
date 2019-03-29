public class Entity
{
    private String name;
    private int age;
    private int value;
    public Entity(String name)
    {
        this.name = name;
        this.age = 0;
    }
    
    public void changeName(String newName)
    {
        this.name = newName;
    }
    
    public Entity(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    
    public void setAge(int age)
    {
        this. age = age;
    }
    
    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setValue(int value)
    {
        this. value = value;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String toString()
    {
        return String.format("%s: %s: %s", super.toString(), name, "Entity");
    }
}
