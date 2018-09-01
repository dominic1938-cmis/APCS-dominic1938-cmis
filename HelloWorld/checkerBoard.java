import java.util.Scanner;
public class checkerBoard {
    public static void main (String[] args){
        Scanner Scan = new Scanner (System.in);
        int in_1 = Scan.nextInt();
        int in_2 = Scan.nextInt();
        System.out.println(checkerBoard(in_1, in_2));
    }

    public static String checkerBoard (int w, int h){
        String output = "";
        String mid1 = "";
        String mid2 = "";
        String dwn1 = "";
        String dwn2 = "";
        for (int a = 0; a <= h + 1; a++){
            if (a == 0){
                for (int c = 0; c < w; c++){
                    mid1 += "-";
                }
                output += "+" + mid1 + "+";
            }
            else if (a == h + 1){
                for (int q = 0; q < w; q++){
                    mid2 += "-";
                }
                output += "+" + mid2 + "+";
            }

            else if (a != 0 && a != h + 1){
                for (int k = 0; k < w; k++){
                    output += ".";
                }
            }
            if (a == 0){
                for (int p = 0; p < h; p++){
                    dwn1 += "|"; 
                }
                output += dwn1;
            }
            else if (a == w){
                for (int m = 0; m < h; m++){
                    dwn2 += "|"; 
                }
                output += dwn2;
            }
            output += "\n";
        }
        return output;
    }
}

