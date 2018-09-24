public class FundamentalsII{
    public static void main (String args[]){
        int [] intArr = {21,69,420,2003,911};
        double [] dblArr = {2.1, 6.9, 7.8, 8.1, 9.11};
        String [] strArr = {"Kwakuh", "Nugget", "Pupper", "I-skweem", "Baloney"};
        System.out.println(intArr[0]);
        System.out.println(dblArr[2]);
        System.out.println(strArr[4]);
    }

    public static void printArray(int[] arr, boolean skip){
        int x = 0;
        int y = 0;
        if (skip == true){
            while (x < arr.length){
                System.out.println(arr[x]);
                x += 2;
            }
        }
        else if (skip == false){
            while (y < arr.length){
                System.out.println(arr[y]);
                y += 1;
            }
        }
    }

    public static int lastItem(int[] array){
        int x = 0;
        x = (array.length - 1);
        return array[x];
    }

    public static double lastItem(double[] array){
        int x = (array.length - 1);
        return array[x];
    }

    public static String lastItem(String[] array){
        int x = (array.length - 1);
        return array[x];
    }

    public static boolean lastItem(boolean[] array){
        int x = (array.length - 1);
        return array[x];
    }
    
    public static int middleItem(int[] array){
        int x = (array.length / 2);
        return array[x];
    }
    
    public static double middleItem(double[] array){
        int x = (array.length / 2);
        return array[x];
    }
    
    public static String middleItem(String[] array){
        int x = (array.length / 2);
        return array[x];
    }
    
    public static boolean middleItem(boolean[] array){
        int x = (array.length / 2);
        return array[x];
    }
    
    public static int[] randomInts(int n, int min, int max){
        
    }
}
