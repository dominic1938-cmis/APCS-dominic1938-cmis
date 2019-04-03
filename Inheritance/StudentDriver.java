
public class StudentDriver
{
    public static void main(String[] args)
    {
        Student[][] studentBody = new Student[3][2];

        PostGraduate postgraduate1 = new PostGraduate("Jerry", "Algebra", 5);
        PostGraduate postgraduate2 = new PostGraduate("Joe", "Biology", 6);
        UnderGrad undergrad1 = new UnderGrad("Mary", "Calculus", 8);
        UnderGrad undergrad2 = new UnderGrad("Jesus", "Computer", 10);
        Graduate graduate1 = new Graduate("Charlie", "History", 3);
        Graduate graduate2 = new Graduate("Jesus", "English", 2);

        studentBody[0][0] = postgraduate1;
        studentBody[0][1] = postgraduate2;
        
        studentBody[1][0] = undergrad1;
        studentBody[1][1] = undergrad2;
        
        studentBody[2][0] = graduate1;
        studentBody[2][1] = graduate2;
        
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 2; b++){
                p(studentBody[a][b]);
            }
        }
    }

    public static void p(Object string){
        System.out.println(string);
    }
}