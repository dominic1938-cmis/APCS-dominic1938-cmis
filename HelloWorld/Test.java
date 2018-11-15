
public class Test {
    public static void print2DArray(int[][] arr)
    {
        for (int x = 0; x < arr.length; x++)
        {
            if (x % 2 == 0){
                for (int y = 0; y < arr[x].length; y++)
                {
                    System.out.print("a" + " ");
                }
            }
            
            else
            {
                for (int p = arr[x].length - 1; p >= 0; p--)
                {
                    System.out.print("b" + " ");
                }
            }
        }
    }      
}
