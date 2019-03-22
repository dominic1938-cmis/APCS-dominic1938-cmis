import java.util.*;
public class Student
{
    private String name;
    private int grade;
    private List<Course> courses;
    private double GPA;
    
    public Student (String name1, int grade1)
    {
        this.name = name1;
        this.grade = grade1;
    }
    
    public void addCourse(Course course)
    {
        courses. add(course);
    }
    
    public double avGPA ()
    {
        double avg = 0;
        int count = 0;
        for (Course course : courses)
        {
             double score = course.getScore();
             avg += score;
             count++;
        }
        avg = avg/count;
        return avg;
    }
}
