public class MergeSort
{
    public static void main(String[] args){
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        merge(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static int[] merge(int[] array){
        int[] front = new int [array.length/2];
        int[] back = new int [array.length/2];
        if (array.length == 1)
        {
            
        }
        else
        {
            return merge(front);
        }
    }
}
