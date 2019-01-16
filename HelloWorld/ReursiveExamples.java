public class ReursiveExamples
{
    
    public static int multiply(int a, int b)
    {
        if (b == 1)
        {
            return a;
        }
        
        else if (b == 0 || a ==0)
        {
            return 0;
        }
        
        else {
            return a + multiply(a, (b - 1));
        }
    }
    
    public static int divide(int a, int b)
    {
        if (b == 1)
        {
            return a;
        }  
        
        else if (a == 0)
        {
            return 0;
        }
        
        else {
            return 1 + divide((a - b), b);
        }
    }
}



