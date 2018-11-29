public class FundamentalsIIIQuiz{
    public static void main(String[] args){
        int[][] array1 = 
                {{606, -11778, 14724, 19623},
                {-9474, 12334, 2791, -13518},
                {-13681, -8397, -6940, -726},
                {-2978, 7212, 2201, 6735}};

        int[][] array2 = {{-11882, -4377, 5226, -664, -1108, 7142, 2017},
                {7071, -8942, -13904, -17035, -2606, -11831, -13766},
                {-12234, -9534, -15779, 13615, 10270, -6859, 6361},
                {-6033, -549, -15958, 17019, -9666, -4876, -6368}};

        int[][] array3 = {{-5487, -18628, 3365, -14728, 10979},
                {-11403, 13387, -10335, -10113, -12000},
                {-10585, -18889, 15515, -16093, -6097},
                {-17722, 9392, -13208, -17901, -6223},
                {-14081, -10776, -6435, -13976, 2823},
                {-13029, -8753, -5213, -3666, 13910},
                {16639, -11206, -14375, 8119, -9044},
                {7253, -11243, -9436, -14244, -15883}};

    }
    //allGreater should return true if every value in array is strictly greater than threshold

    public static boolean allGreater(int[][] array, int threshold)
    {
        boolean output = true;
        for (int row = 0; row < array.length; row++){
            for (int col = 0; col < array[0].length; col++){
                if (array[row][col] < threshold)
                {
                    output = false;
                    col = array[0].length;
                    row = array.length;
                }
            }
        }
        return output;
    }

    public static int[][] invertSign(int[][] array, boolean positive)
    {
        int [][] output = new int [array.length][array[0].length]; 
        if (positive == true)
        {
            for (int row = 0; row < array.length; row++){
                for (int col = 0; col < array[0].length; col++){
                    if (array[row][col] < 0)
                    {
                        output[row][col] = array[row][col] * -1;
                    }
                    else
                    {
                        output[row][col] = array[row][col];
                    }
                }
            }
        }
        else
        {
            for (int row = 0; row < array.length; row++){
                for (int col = 0; col < array[0].length; col++){
                    if (array[row][col] > 0)
                    {
                        output[row][col] = array[row][col] * -1;
                    }
                    else
                    {
                        output[row][col] = array[row][col];
                    }
                }
            }
        }
        return output;
    }

    public static int[][] swapColumns(int[][] array, int c1, int c2)
    {
        int [][] output = new int [array.length][array[0].length];
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < array[0].length; col++){
                if (col == c1)
                {
                    output[row][c1] = array[row][c2];
                }
                else if (col == c2)
                {
                    output[row][c2] = array[row][c1];
                }
                else
                {
                    output[row][col] = array[row][col];
                }
            }
        }
        return output;
    }
}