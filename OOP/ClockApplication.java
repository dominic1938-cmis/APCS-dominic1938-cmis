import java.util.Scanner;
public class ClockApplication
{
    public static void main(String[] args)
    {
       Scanner scan = new Scanner (System.in);
       Clock kitchenClock = new Clock();
       System.out.println(kitchenClock. toString());
       System.out.println("Hour: ");
       int hr = scan.nextInt();
       System.out.println("Minute: ");
       int min = scan.nextInt();
       System.out.println("Seconds: ");
       int sec = scan.nextInt();
       Clock bedroomClock = new Clock(hr, min, sec);
       System.out.println(bedroomClock. toString());
    }
}
