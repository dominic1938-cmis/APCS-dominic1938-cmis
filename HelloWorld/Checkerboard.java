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
        for(int y = h; y >= 0; y--){
            System.out.print("|");
            for (int x = w; x > 0; x --){
                if (y % 2 != 0){
                    if (x % 2 != 0){
                        System.out.print("#");
                    }
                    else{
                        System.out.print(" ");
                    }
                    if (x == 1 || x == w + 1){
                        System.out.print("| \n");
                    }
                }
                if (y % 2 == 0){
                    if (x % 2 == 0){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("#");
                    }
                    if (x == 1 || x == w + 1){
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