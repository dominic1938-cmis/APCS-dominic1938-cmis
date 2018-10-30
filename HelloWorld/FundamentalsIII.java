public class FundamentalsIII
{
    public static void main (String[] args){
        int [][] defarray = new int [5][5];
        int [][] litarray = {{1,2,3,4,5},{5,6,7,8,7},{1,4,2,5,4}, {1,2,3,3,4},{4,3,4,2,1}};
        double [][] dearray = new double [5][5];
        double [][] liarray = {{1,2,3,4,5},{5,6,7,8,7},{1,4,2,5,4},{1,2,3,3,4},{4,3,4,2,1}};
        String [][] checker = {{" ", "#", " ", "#", " ", "#", " ", "#"}, {" ", "#", " ", "#", " ", "#", " ", "#"}, {" ", "#", " ", "#", " ", "#", " ", "#"},{" ", "#", " ", "#", " ", "#", " ", "#"},{" ", "#", " ", "#", " ", "#", " ", "#"},{" ", "#", " ", "#", " ", "#", " ", "#"},{" ", "#", " ", "#", " ", "#", " ", "#"},{" ", "#", " ", "#", " ", "#", " ", "#"},};
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
}