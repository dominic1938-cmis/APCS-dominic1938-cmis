public class Building extends Thing
{
    private int numPeople;
    private String use;

    public Building(){
        super();
    }

    public Building(String name, int age){
        super(name, age);
    }
    
    public void setNumPeople(int numPeople)
    {
        this. numPeople = numPeople;
    }
    
    public int getNumPeople()
    {
        return numPeople;
    }
    
    public void setUse(String use)
    {
        this. use = use;
    }

    public String getUse()
    {
        return use;
    }

    public String toString(){
        String out = super.toString();
        out += "->Building";
        return out;
    }
}
