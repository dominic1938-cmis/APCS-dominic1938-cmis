//package Sorting;

public class SelectionSort
{
    public static int steps = 0;
    public static void main(String[] args){
    }

    public static int[] sort(int[] array){
        int smallestIdx = 0;
        int temp;
        steps+=5;
        for(int s = 0; s < array.length; s++){
            smallestIdx = s;
            steps+=4;
            for(int n = s; n < array.length; n++){
                steps+=4;
                if(array[n] < array[smallestIdx]){
                    steps+=1;
                    smallestIdx = n;
                }
            }
            steps+=6;
            temp = array[smallestIdx];
            array[smallestIdx] = array[s];
            array[s] = temp;
        }
        steps++;
        return array;
    }
}