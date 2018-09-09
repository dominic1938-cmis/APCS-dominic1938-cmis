public class Checkerboard {
    public static void check(int h, int w){
        String mid = "";
        String mid2 = "";
        int randomNum = (int)(Math.random() * ((10 - 1) + 1));
        int randomY = (int)(Math.random() * ((h - 1) + 1)) + 1;
        int randomX = (int)(Math.random() * ((w - 1) + 1)) + 1;
        for (int x = 1; x <= w; x++)
        {
            mid += ("-");
        }
        System.out.print("+" + mid + "+ \n");
        for(int y = 0; y < h; y++){
            System.out.print("|");
            for (int x = 0; x < w; x++){
                if (y % 2 != 0){
                    if (x % 2 != 0){
                        if ((randomY == y || randomY == y + 1) && (randomX == x || randomX == x+1)){
                            System.out.print(randomNum);
                            randomX = 0;
                            randomY = 0;
                        }
                        else {
                            System.out.print("#");
                        }
                    }
                    else{
                        System.out.print(" ");
                    }
                    if (x == w || w == x + 1){
                        System.out.print("| \n");
                    }
                }
                if (y % 2 == 0){
                    if (x % 2 == 0){
                        if ((randomY == y || randomY == y + 1) && (randomX == x || randomX == x+1)){
                            System.out.print(randomNum);
                            randomX = 0;
                            randomY = 0;
                        }
                        else {
                            System.out.print("#");
                        }
                    }
                    else{
                        System.out.print(" ");
                    }
                    if (x == w || w == x + 1){
                        System.out.print("| \n");
                    }
                }
            }
        }
        for (int x = w; x > 0; x--)
        {
            mid2 += ("-");
            if (x == 1){
                System.out.print("+" + mid2 + "+ \n");
            }
        }   
    }
}