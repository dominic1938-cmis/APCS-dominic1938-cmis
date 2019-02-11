public class Thing
{
    private int field1 = 10;
    private double field2 = 4.3;
    private boolean field3 = false;
    private String field4 = "sup homie, hows life, want a cup of wota";
    
    public Thing()
    {
        this. field1 = 420;
        this. field2 = 6.9;
        this. field3 = true;
        this. field4 = "m'lady";
    }
    
    public Thing(int fieldvalue)
    {
        this();
        this. field1 = fieldvalue;
    }
    
    public void setField1(int newVal)
    {
        this. field1 = newVal;
    }
    
    public void setField2(double newVal)
    {
        this. field2 = newVal;
    }
    
    public void setField3(boolean newVal)
    {
        this. field3 = newVal;
    }
    
    public void setField4(String newVal)
    {
        this. field4 = newVal;
    }
    
    public int getField1()
    {
        return field1;
    }
    
    public double getField2()
    {
        return field2;
    }
    
    public boolean getField3()
    {
        return field3;
    }
    
    public String getField4()
    {
        return field4;
    }
}
