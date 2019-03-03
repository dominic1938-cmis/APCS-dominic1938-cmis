public class Thing
{
    private int field1;
    private double field2;
    private boolean field3;
    private String field4;
    
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
    
    public Thing(double fieldvalue)
    {
        this();
        this. field2 = fieldvalue;
    }
    
    public Thing(boolean fieldvalue)
    {
        this();
        this. field3 = fieldvalue;
    }
    
    public Thing(String fieldvalue)
    {
        this();
        this. field4 = fieldvalue;
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
