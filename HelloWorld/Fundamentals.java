public class Fundamentals
{
    public static void main (String args[] ){
        dataTypes();
    }
    
    public static void dataTypes(){
        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 234.5f;
        double d = 123.4;
        boolean b2 = true;
        char c = 'A';
        String Bite = "A Byte can store the number of toes, fingers and dicount value";
        String Shrt = "A short can store the price of lego sets, price of lego brick, price of hair cuts"; 
        String Int = "A int can store the price of lego minifigures, dog, laptop";
        String Lng = "A long can store the length of, our solar system in nanometers, biggest star we know in micrometers, mass of moon";
        String Flt = "A float can store 1000000 lightyears in cm, the milkyway in nanometers, biggest blackhole in milimeters";
        String dbl = "A double can store it can store 100000000 lightyears in cm, the known universe in cm,a quintillion Jeff Bezos's net worth";
        String bool = "A bool represent life is suffering, all living things die eventually, Hearthstone is skill based game";
        String chr = "A char can store the price of keyboards, price of chocolate, price of curtains";
        System.out.format("Example data types: %n byte :%d%n short :%d%n int :%d%n long :%d%n float :%f%n double :%f%n boolean :%s%n char :%s", b,s,i,l,f,d,b2,c);
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
    
    public static void math(){
        System.out.println(add(69,69));
        System.out.println(mul(69,69));
    }
} 