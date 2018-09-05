public class Checkerboard {
    public static void check(int h, int w){
        System.out.print("+");
        int width = w;
        for (int looptime = w; w > 0; w--)
        {
            System.out.print("-");
            if (w == 1){
                System.out.print("+ \n");
            }
        }
        w = width;
        for(int luptime = h; h > 0; h--){
            System.out.print("|");
            System.out.print("#");
            if (w % 2 != 0){
                for (int looptime = w; w > 0; w--){
                    System.out.print(" ");
                    if (w == 1){
                        System.out.print("| \n");
                    }
                }
                w = width;
            }  
            else if (w % 2 == 0){
                for (int looptime = w; w > 0; w--){
                    System.out.print("#");
                    if (w == 1){
                        System.out.print("| \n");
                    }
                }
            }
        }
        w = width;
        System.out.print("+");
        for (int looptime = w; w > 0; w--)
        {
            System.out.print("-");
            if (w == 1){
                System.out.print("+ \n");
            }
        }   
    }
}