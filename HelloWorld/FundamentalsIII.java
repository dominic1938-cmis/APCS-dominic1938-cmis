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
        if (rowMajor = true)
        {
            while (y < array.length){
                for (int x = 0; x < array[x].length; x++)
                {
                    for (int q = 0; q < array[x].length; q++){
                        System.out.print(array[q][y]);
                        z++;
                        if (z == array[x].length){
                            System.out.print("\n");
                        }
                    }
                }
                y++;
            }
        }
    }
}