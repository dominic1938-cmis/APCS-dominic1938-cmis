public class Pigeon implements Flyable, Driveable, Readable
{
    private int high;
    private String name;
    private int speed;
    
    public Pigeon()
    {
        high = 0;
        name = "";
        speed = 0;
    }
    
    public int height()
    {
        return high;
    }
    
    public int speed()
    {
        return speed;
    }
    
    public String words()
    {
        return name;
    }
    
    public void changeBook(String newTitle, int newNum)
    {
        this. name = newTitle;
        this. speed = newNum;
    }
    
    public void destination(int x, int y)
    {
        this. high = y;
        this. speed = x;
    }
    
    public void name(String name)
    {
        this. name = name;
    }
}
