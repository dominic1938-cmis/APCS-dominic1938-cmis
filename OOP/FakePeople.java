public class FakePeople
{
    private String name;
    private String type;
    private int age;
    
    public FakePeople()
    {
        this. name = "Koneko";
        this. type = "Nekomata";
        this. age = 15;
    }
    
    public FakePeople(String value1, String value2, int value3)
    {
        this();
        this. name = value1;
        this. type = value2;
        this. age = value3;
    }
    
    public String toString()
    {
        String out = "Name: " + this.name + "\nType: " + this.type + "\nAge: " + this.age + "\n";
        return out;
    }
}
