//package Sorting;

public class BubbleSort
{
    public static int steps = 0;
    public static void main(String[] args){

    }

    public static int[] sort(int[] array){
        steps+=2;
        boolean sorted = false;
        while(!sorted){
            steps+=4;
            sorted = true;
            for(int i = 0;i < array.length-1; i++){
                steps+=1;
                if(array[i] > array[i + 1]){
                    steps+=7;
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                    sorted = false;
                }
            }
        }
        steps++;
        return array;
    }
}
