
public class ReursiveExamples
{
    public static int multiply(int a, int b)
    {
        if (a < 0 && b < 0)
        {
            if (b == -1)
            {
                return a;
            }

            else if (b == 0 || a ==0)
            {
                return 0;
            }

            else 
            {
                return a + multiply(a, (b + 1));
            }
        }

        else if (b < 0)
        {
            if (b == -1)
            {
                return -a;
            }

            else if (b == 0 || a ==0)
            {
                return 0;
            }

            else
            {
                return -a + multiply(a, (b + 1));
            }
        }

        else
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
    }

    public static int divide(int a, int b)
    {
        if (a <= 0 && b <= 0){
            if(b == 1)
            {
                return a;
            }
            else if (a > b)
            {
                return 0;
            }
            else
            {
                return 1 + divide( a - b , b);
            }
        }
        else if (a < 0){
            if(b == 1)
            {
                return a;
            }
            else if (a > b)
            {
                return 0;
            }
            else
            {
                return -1 + divide( a + b , b);
            }
        }
        else if (b < 0)
        {
            if(b == 1)
            {
                return a;
            }
            else if (a < b)
            {
                return 0;
            }
            else
            {
                return -1 + divide( a + b , b);
            }
        }
        else{
            if(b == 1)
            {
                return a;
            }
            else if (a < b)
            {
                return 0;
            }
            else
            {
                return 1 + divide( a - b , b);
            }
        }
    }

    public static int power(int a, int b)
    {
        if (b == 0)
        {
            return 1;
        }

        else if (b == 1)
        {
            return a;
        }

        else
        {
            return multiply(a, power(a, b - 1));
        }
    }
}
