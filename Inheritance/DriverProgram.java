import java.util.*;
public class DriverProgram
{
    public static void main(String[] args)
    {
        List<Television> televisions = new ArrayList<Television>();

        DLP dlp = new DLP("DLP Silver", 59.99);
        LCD lcd = new LCD("LCD Gold",199.99);
        LED led = new LED("LED Platinum", 399.99);
        Plasma plasma = new Plasma("Plasma Sapphire", 499.99);

        televisions.add(dlp);
        televisions.add(lcd);
        televisions.add(led);
        televisions.add(plasma);
        
        p("TVs in the store...");
        for (Television tv: televisions)
        {
            p(tv);
        }
    }

    public static void p(Object string){
        System.out.println(string);
    }
}
