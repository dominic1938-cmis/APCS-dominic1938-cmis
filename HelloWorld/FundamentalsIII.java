public class FundamentalsIII
{
    public static void main (String[] args){
        int [][] defarray = new int [5][5];
        int [][] litarray = {{1,2,3,4,5},{5,6,7,8,7},{1,4,2,5,4}, {1,2,3,3,4},{4,3,4,2,1}};
        double [][] dearray = new double [5][5];
        double [][] liarray = {{1,2,3,4,5},{5,6,7,8,7},{1,4,2,5,4},{1,2,3,3,4},{4,3,4,2,1}};
        String [][] checker = {{" ", "#", " ", "#", " ", "#", " ", "#"}, 
                {" ", "#", " ", "#", " ", "#", " ", "#"}, 
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {" ", "#", " ", "#", " ", "#", " ", "#"},};
    }

    public static int choice (int array [][], int r, int c)
    {
        int output = array [r][c];
        return output;
    }

    public static double choice (double array [][], int r, int c)
    {
        double output = array [r][c];
        return output;
    }

    public static String choice (String array [][], int r, int c)
    {
        String output = array [r][c];
        return output;
    }

    public static void setValue(int [][] arr, int r, int c, int v)
    {
        arr [r][c] = v;
    }

    public static void setValue(double [][] arr, int r, int c, double v)
    {
        arr [r][c] = v;
    }

    public static void setValue(String [][] arr, int r, int c, String v)
    {
        arr [r][c] = v;
    }

    public static void print2DArray(int[][] array, boolean rowMajor)
    {
        int y = 0;
        int z = 0;
        if (rowMajor)
        {
            while (y < array.length){
                for (int x = 0; x < array[y].length; x++)
                {
                    System.out.print(array[y][x] + "\t");
                }
                y++;
                System.out.print("\n");
            }
        }
        else{
            while (z < array.length){
                for (int a = 0; a < array[y].length; a++)
                {
                    System.out.print(array[a][z] + "\t");
                }
                z++;
                System.out.print("\n");
            }
        }
    }

    public static void snakePrint(int[][] arr)
    {
        for (int x = 0; x < arr.length; x++)
        {
            if (x % 2 == 0){
                for (int y = 0; y < arr[x].length; y++)
                {
                    System.out.print(arr[x][y] + " ");
                }
            }
            
            else
            {
                for (int p = arr[x].length; p > 0; p--)
                {
                    System.out.print(arr[x][p] + " ");
                }
            }
        }
    }
}
