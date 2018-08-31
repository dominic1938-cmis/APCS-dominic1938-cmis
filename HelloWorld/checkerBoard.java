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
        for (int a = 0; a <= h + 1; a++){
            if (a == 0){
                for (int c = 0; c < w; c++){
                    mid1 += "-";
                }
                output += "+" + mid1 + "+";
            }
            else if (a == h + 1){
                for (int d = 0; d < w; d++){
                    mid2 += "-";
                }
                output += "+" + mid2 + "+";
            }
            else{ 
                for (int b = 0; b < w; b++){
                    output += ".";
                }
            }
            output += "\n";
        }
        return output;
   }  
}