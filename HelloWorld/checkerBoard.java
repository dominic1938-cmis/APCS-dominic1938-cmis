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
        }
        for (int lup = h; h > 0; h--){
            System.out.print("|");
            for (int tim = w; w > 0; w--){
                System.out.print(".");
                if (w == 1){
                    System.out.print("| \n");
                }
            }
        }
        output += "\n";
        return output;
    }
}
