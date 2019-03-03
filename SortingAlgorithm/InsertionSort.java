//package Sorting;

public class InsertionSort
{
    public static long steps = 0;
    public static void main(String[] args){
    }

    public static int[] sort(int[] array){
        steps+=2;
        int temp;
        for(int forwards = 1; forwards < array.length; forwards++){
            steps+=3;
            for(int backwards = forwards; backwards > 0; backwards--){
                steps+=5;
                if(array[backwards] < array[backwards-1]){
                    steps+=6;
                    temp = array[backwards-1];
                    array[backwards-1] = array[backwards];
                    array[backwards] = temp;
                }
            }
        }
        steps++;
        return array;
    }
}