public class FundamentalsIIQuiz
{
    public static int[] minmax(int[] array)
    {
        int result4 [] = new int [2];
        int num1 = 0;
        int num2 = 0;
        int y = 0;
        for (int x = 0; x < array.length - 1; x++)
        {
            if (array[y] < array[x]){
                num1 = array[y];
            }
            else if (array [y] > array[x])
            {
                num1 = array[x];
                y = x;
            }
            result4 [0] = num1;
        }
        y = 0;
        for (int z = 0; z < array.length - 1; z++)
        {
            if (array[y] > array[z]){
                num2 = array[y];
            }
            else if (array [y] < array[z])
            {
                num2 = array[z];
                y = z;
            }
            result4 [1] = num2;
        }
        return result4;
    }

    public static int[] filter(int[] array, int min, int max, boolean positive)
    {
        int count = 0;
        if (positive = true){
            for (int x = 0; x < array.length - 1; x++){
                if (min < array[x] && array[x] < max){
                    count++;
                }
            }
        }
        else{
            for (int x = 0; x < array.length - 1; x++){
                if (min > array[x] && array[x] > max){
                    count++;
                }
            }
        }
        int result0 [] = new int [10];
        int y = 0;
        if (positive  = true)
        {
            for (int x = 0; x < result0.length - 1; x++)
            {
                if (min < array[x] && array[x] < max)
                {
                    result0 [y] = array[x];
                    y++;
                }
            }
        }

        else
        {
            for (int x = 0; x < result0.length - 1; x++)
            {
                if (min > array[x] && array[x] > max)
                {
                    result0 [y] = array[x];
                    y++;
                }
            }  
        }
        return result0;
    }    
}