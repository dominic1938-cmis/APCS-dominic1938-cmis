public class Fundamentals1Quiz{
    public static int method1(int a, int b, int c){
        int AxB = a * b;
        int AxC = a * c;
        int BxC = b * c;
        int output = 0;
        if (AxB >= AxC && AxB >= BxC){
            output = (AxB);
        }
        else if (AxC >= AxB && AxC >= BxC){
            output = (AxC);
        }
        else if (BxC >= AxB && BxC >= BxC){
            output = (BxC);
        }
        return output;
    }

    public static int method2(int a, int b){
        int output = 0;
        for (int c = 0; c <= a; c++){
            output += b * c;
        }
        return output;
    }

    public static void method3(int h, int w){
        String output = "";
        if (h % 2 == 0 || w % 2 == 0){
            output += "+";
        }
        else{
            for (int y = 0; y < h; y++){
                output += "|\n";
                for (int x = 0; x < w; x++){
                    output += "-";
                }
            }
        }
        System.out.print(output);
    }
}
