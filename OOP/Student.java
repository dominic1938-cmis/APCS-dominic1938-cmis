public class Student
{
    private String firstName = "Domo";
    private String lastName = "Vegetable";
    private double GPA = 3.69420;
    private boolean smart = true;
    
    public Student()
    {
        this. firstName = "Egg";
        this. lastName = "Boi";
        this. GPA = 2.9;
        this. smart = false;
    }
    
    public Student(String value1, String value2, double value3, boolean value4)
    {
        this();
        this. firstName = value1;
        this. lastName = value2;
        this. GPA = value3;
        this. smart = value4;
    }
    
    public String toString()
    {
        String out = "First Name: " + this.firstName + "\nLast Name: " + this. lastName + "\nGPA: " + this.GPA + "\nIs ma boy smart: " + this.smart + "\n";
        return out;
    }
}
