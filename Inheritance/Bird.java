
public class Bird extends Animal
{
    private String color;

    public Bird(int x, int y, String color)
    {
        super(x, y);
        this.color = color;
    }

    public void fly(int dx, int dy){
        if(Math.abs(dx) > 1 && Math.abs(dy) > 1){
            int newX = getLocation().get(0) + dx;
            int newY = getLocation().get(1) + dy;
            super. setLocation(newX, newY);
        }
    }

    public void setColor(String color)
    {
        this. color = color;
    }

    public String getColor()
    {
        return color;
    }

    public boolean eat(String what)
    {
        if (what == "worms" || what == "seeds")
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public String toString()
    {
        String bird = "   \\ \n";
        bird += "   (o> \n";
        bird += "\\_//) \n";
        bird += " \\_/_) \n";
        bird += "  _|_ \n";
        String out = "Bird\n" + bird + super.getLocation() + "\n" + super.toString();
        return out;
    }
}
