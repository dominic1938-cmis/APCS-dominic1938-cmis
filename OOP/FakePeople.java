public class FakePeople
{
    private String name;
    private String type;
    private int age;
    
    public String toString()
    {
        String out = "Name: " + this.name + "\nType: " + this.type + "\nAge: " + this.age + "\n";
        return out;
    }
}
