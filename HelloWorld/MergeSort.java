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
        int temp = 0;
        int f = 0;
        int b = 0;
        int count = 0;
        if (array.length == 1)
        {
            return array;
        }
        else
        {
            for (int i = 0; i < front.length; i++)
            {
                front[i] = array[i];
            }
            for (int i = array.length/2; i < array.length; i++)
            {
                back[i] = array[i];
            }
            front = merge(front);
            back = merge(back);
            while (f < front.length || b < back.length){
                if (front[f] > back[b])
                {
                    array[count] = front[f];
                    f++;
                }
                else
                {
                    array[count] = back[b];
                    b++;
                }
                count++;
            }
        }
        return array;
    }
}