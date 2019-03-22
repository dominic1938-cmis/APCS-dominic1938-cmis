public class Course
{
    private double grade;
    private String name;

    public Course(String newName, double newGrade)
    {
        this.name = newName;
        this.grade = newGrade;
    }

    public double getScore()
    {
        return grade;
    }
    
}