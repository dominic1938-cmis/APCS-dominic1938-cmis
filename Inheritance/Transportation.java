public class Transportation extends Thing
{
    private int speed;
    private String type;
    
    public Transportation(){
        super();
    }

    public Transportation(String name, int age){
        super(name, age);
    }
    
    public void setSpeed(int speed)
    {
        this. speed = speed;
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public void setSize(String type)
    {
        this. type = type;
    }
    
    public String getType()
    {
        return type;
    }

    public String toString(){
        String out = super.toString();
        out += "->Transportation";
        return out;
    }
}
