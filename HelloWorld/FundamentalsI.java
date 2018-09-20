public class FundamentalsI
{
    public static void main (String args[] ){
        dataTypes();
        add(69,69);
        mul(69,69);
        div(5,2);
        compare(10,15);
        evenOddZero(12);
    }
    
    public static void dataTypes(){
        byte by = 100;
        short sh = 10000;
        int in = 100000;
        long lo = 100000L;
        float fl = 234.5f;
        double db = 123.4;
        boolean b2 = true;
        char ch = 'A';
        String Bite = "A Byte can store the number of toes, fingers and dicount value";
        String Shrt = "A short can store the price of lego sets, price of lego brick, price of hair cuts"; 
        String Int = "A int can store the price of lego minifigures, dog, laptop";
        String Lng = "A long can store the length of, our solar system in nanometers, biggest star we know in micrometers, mass of moon";
        String Flt = "A float can store 1000000 lightyears in cm, the milkyway in nanometers, biggest blackhole in milimeters";
        String dbl = "A double can store it can store 100000000 lightyears in cm, the known universe in cm,a quintillion Jeff Bezos's net worth";
        String bool = "A bool represent life is suffering, all living things die eventually, Hearthstone is skill based game";
        String chr = "A char can store the price of keyboards, price of chocolate, price of curtains";
        System.out.format("Example data types: %n byte :%d%n short :%d%n int :%d%n long :%d%n float :%f%n double :%f%n boolean :%s%n char :%s%n", by,sh,in,lo,fl,db,b2,ch);
    }
    
    public static int add(int a, int b){
        int add = a + b;
        return add;
    }
    
    public static int sub(int a, int b){
        int sub = a - b;
        return sub;
    }
    
    public static int mul(int a, int b){
        int mul = a * b;
        return mul;
    }
    
    public static int div(int a, int b){
        int div = a / b;
        return div;
    }
    
    public static double add(double a, double b){
        double add = a + b;
        return add;
    }
    
    public static double sub(double a, double b){
        double sub = a - b;
        return sub;
    }
    
    public static double mul(double a, double b){
        double mul = a * b;
        return mul;
    }
    
    public static double div(double a, double b){
        double div = a / b;
        return div;
    }
    
    public static void compare(int a, int b){
       if (a<b) {
           System.out.format("The value of a is %d and it is less than b whose value is %d%n", a,b);
        }
       else if (a>b) {
           System.out.format("The value of a is %d and it is greater than b whose value is %d%n", a,b);
        }
       else {
           System.out.format("The value of a is %d and it is equal to b whose value is %d%n",a,b);
        }
    }
    
    public static void evenOddZero(int a){
        if (a % 2 == 0) {
            System.out.println(1);
        }
        
        if (a % 2 != 0) {
            System.out.println(-1);
        }
        
        if (a == 0) {
            System.out.println(0);
        }
    }

    public static void squareTable(){
        int a = 1;
        int b = 1;
        for (a = 1; a <= 10; a++){
            b = a * a;
            int c = (int)(Math.random() * ((b - a) + 1)) + a;
            System.out.format("%d\t%d\t%d\n", a,b,c);
        }
    }
    
    public static int triangle (int a){
        int b = 0;
        for  (a = a; a >= 1; a--){
            b += a;
        }
        return b;
    }
    
    public static int pyramid (int a){
        int b = 0;
        for (a = a; a >= 1; a--){
            b += (a*a);
        }
        return b;
    }
}