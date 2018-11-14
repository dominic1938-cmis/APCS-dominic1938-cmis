
public class Test {
    public static void print2DArray(int[][] array, boolean rowMajor)
    {
        int y = 0;
        int z = 0;
        if (rowMajor)
        {
            while (y < array.length){
                for (int x = 0; x < array[0].length; x++)
                {
                    System.out.println("x");
                }
                y++;
                System.out.print("y");
            }
        }
    }      
}
