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

    public static void printArray(double[] arr, boolean skip){
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

    public static void printArray(String[] arr, boolean skip){
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

    public static void printArray(boolean[] arr, boolean skip){
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
        if (array.length % 2 != 0){
            int x = array[array.length / 2]                                                                                                                                                                                                                                                                                                                                                                                                                                                      ;
            return x;
        }
        else{
            int x = array[(array.length / 2) - 1];
            return x;
        }
    }

    public static double middleItem(double[] array){
        if (array.length % 2 != 0){
            double x = array[array.length / 2]                                                                                                                                                                                                                                                                                                                                                                                                                                                      ;
            return x;
        }
        else{
            double x = array[(array.length / 2) - 1];
            return x;
        }
    }

    public static String middleItem(String[] array){
        if (array.length % 2 != 0){
            String x = array[array.length / 2]                                                                                                                                                                                                                                                                                                                                                                                                                                                      ;
            return x;
        }
        else{
            String x = array[(array.length / 2) - 1];
            return x;
        }
    }

    public static boolean middleItem(boolean[] array){
        if (array.length % 2 != 0){
            boolean x = array[array.length / 2]                                                                                                                                                                                                                                                                                                                                                                                                                                                      ;
            return x;
        }
        else{
            boolean x = array[(array.length / 2) - 1];
            return x;
        }
    }

    public static int[] randomInts(int n, int min, int max){
        int[] array = new int[n];
        for (int x = 0; x < n; x++){
            int num = (int)(Math.random() * ((max) - min) + min);
            array[x] = num;
        }
        return array;
    }

    public static double[] randomDouble(int n, double min, double max){
        double [] array = new double[n];
        for (int x = 0; x < n; x++){
            double num = (double)(Math.random() * ((max) - min) + min);
            array[x] = num;
        }
        return array;
    }

    public static int[] copy(int[] array){
        int [] cop = array;
        return cop;
    }

    public static double[] copy(double[] array){
        double [] cop = array;
        return cop;
    }

    public static String[] copy(String[] array){
        String [] cop = array;
        return cop;
    }

    public static Boolean[] copy(Boolean[] array){
        Boolean [] cop = array;
        return cop;
    }

    public static int[] pairs(int n){
        int len = n * 2;
        int [] array = new int [len];
        for (int x = 0; x <= n; x++){
            int num1 = x + 2;
            int num2 = num1 + 2;
            array [x] = num1;
        }
        return array;
    }
}
