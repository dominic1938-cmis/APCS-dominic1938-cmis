import java.util.*;
public class School
{
    private String name;
    private List<Student> students;
    private double GPA;

    public School(String name)
    {
        students = new ArrayList<Student>();
        this.name = name;
    }
    
    public void addStudent(Student student)
    {
        students.add(student);
    }
    
    public String getName()
    {
        return name;
    }
    
    public List<Student> getStudents()
    {
        return students;
    }
    
    public double getAvgGPA()
    {
        double GPA = 0;
        int count = 0;
        for (Student student: students)
        {
            double score = student. avGPA();
            GPA += score;
            count++;
        }
        GPA = GPA/count;
        return GPA;
    }
    
    public String toString()
    {
        out = "Name: %f" + "%n" + "Enrollment: %" + "%n" + "Averag GPA at %d is %f";
        return out;
    }
}
