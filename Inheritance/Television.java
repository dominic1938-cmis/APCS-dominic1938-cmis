public class Television
{
    private String model;
    private double price;
    
    public Television()
    {
        this. model = "";
        this. price = 0.0;
    }
    
    public Television(String model, double price){
        this.model = model;
        this.price = price;
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }
    
    public String getModel()
    {
        return model;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public String toString()
    {
        return String.format("The model of this TV is: %s \tPrice: %.2f", model, price);
    }
}
