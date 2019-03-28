public class Idea extends Entity
{
    private int follower;
    
    public Idea()
    {
        super("default");
    }
    
    public Idea(String name)
    {
        super(name);
    }
    
    public void setFollower(int follow)
    {
        this.follower = follow;
    }
    
    public int getFollower()
    {
        return follower;
    }
    
    public String toString()
    {
        String out = super.toString();
        out += "--> Idea";
        return out;
    }
}
