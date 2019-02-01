//package Sorting;

public class MergeSort
{
    public static int steps = 0;
    public static void main(String[] args){

    }
    
    public static int[] sort(int[] array){
        steps+=2;
        //BASE CASE
        if(array.length <= 1){
            steps+=1;
            return array;
        }
        
        //SPLIT STEP
        int half = array.length / 2;
        int[] front = new int[half];
        int[] back = new int[array.length - half];
        steps+=7;
        for(int i = 0; i < array.length; i++){
            steps+=3;
            if(i < half){
                steps+=3;
                front[i] = array[i];
            }else{
                steps+=3;
                back[i - half] = array[i];
            }
        }

        //MERGESORT STEP
        steps+=3;
        front  = sort(front);
        back = sort(back);
        
        //MERGE STEP
        steps+=4;
        int fi = 0;
        int bi = 0;
        for(int i = 0; i < array.length; i++){
            steps+=9;
            if((bi >= back.length) || (fi < front.length  &&  front[fi] < back[bi])){
                steps+=4;
                array[i] = front[fi];
                fi++;
            }else{
                steps+=4;
                array[i] = back[bi];
                bi++;
            }
        }
        steps++;
        return array;
    }

}
