public class Test {
    public static double[][] tilt(double[][] arr){
        double[][] output = new double [arr.length][arr[0].length]; 
        for (int a = 0; a < arr.length; a++){
            for (int b = 0; b < arr[0].length; b++){
                output[b][a] = arr[a][b]; 
            }
        }
        return output; 
    }
}