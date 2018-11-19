public class FundamentalsIII
{
    public static void main (String[] args){
        int [][] defarray = new int [5][5];
        int [][] litarray = {{1,2,3,4,5},{5,6,7,8,7},{1,4,2,5,4}, {1,2,3,3,4},{4,3,4,2,1}};
        double [][] dearray = new double [5][5];
        double [][] liarray = {{1,2,3,4,5},{5,6,7,8,7},{1,4,2,5,4},{1,2,3,3,4},{4,3,4,2,1}};
        String [][] checker = {
                {" ", "#", " ", "#", " ", "#", " ", "#"}, 
                {"#", " ", "#", " ", "#", " ", "#", " "}, 
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "},
                {" ", "#", " ", "#", " ", "#", " ", "#"},
                {"#", " ", "#", " ", "#", " ", "#", " "}};
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
                for (int p = arr[x].length - 1; p >= 0; p--)
                {
                    System.out.print(arr[x][p] + " ");
                }
            }
        }
    }

    public static String[][] locate(String[][] arr)
    {
        int rand = (int)(Math.random() * (8 - 2) * 2);
        int a = (int)(Math.random() * arr.length);
        int b = (int)(Math.random() * arr[0].length);
        String re = rand + "";
        int help = 0;
        for (int y = 0; y < arr.length; y ++)
        {
            for (int x = 0; x < arr[0].length ; x ++)
            {
                if (x % 2 == 0 && y % 2 != 0 && x == a && y == b && help == 0)
                {
                    arr [y][x] = re;
                    help ++;
                }
                else if (x % 2 != 0 && y % 2 == 0 && x == a && y == b && help == 0)
                {
                    arr [y][x] = re;
                    help ++;
                }
                else if (help == 0 && x == a && y == b)
                {
                    if (x == arr.length || x == arr.length - 1)
                    {
                        arr [y][x - 1] = re;
                        help ++;
                    }
                    else
                    {
                        arr [y][x + 1] = re;
                        help ++;
                    }
                }
            }
        }
        return arr;
    }

    public static int[][] replace(int[][] arr, int threshold, int newValue)
    {
        for (int x = 0; x < arr.length; x++)
        {
            for (int y = 0; y < arr[x].length; y++)
            {
                if (arr[x][y] > threshold)
                {
                    arr[x][y] = newValue;
                }
            }
        }
        return arr;
    }

    public static double[][] shift(double[][] arr, int row){
        double [][] output = new double [arr.length][arr[0].length]; 
        for (int b = 0; b < arr.length; b++){
            if (b < row){
                output[b] = arr[b]; 
            }
            else if(b >= row && b != arr.length -1){
                output[b+1] = arr[b]; 
            }
        }
        for (int c = 0; c < arr[0].length; c++){
            output[row][c] = Math.random() * 10; 
        }
        return output; 
    }

    public static double[][] tilt(double[][] arr){
        double[][] output = new double [arr.length][arr[0].length]; 
        for (int a = 0; a < arr.length; a++){
            for (int b = 0; b < arr[0].length; b++){
                output[b][a] = arr[a][b]; 
            }
        }
        return output; 
    }

    public static void GreatestSum (int [][] arr)
    {
        int col = 0;
        int row = 0;
        for (int x = 0; x < (arr.length + arr[0].length); x++)
        {
            for (int a = 0; a < arr.length; a++){
                col += arr[a][x];
            }
            for (int b = 0; b < arr[0].length; b++){
                row += arr[x][b];
            }
            if (col > row)
            {
                System.out.println("Colum " + x + " has the greatest sum");
            }
            else
            {
                System.out.println("Row " + x + " has the greatest sum");
            }

        }
    }
}
