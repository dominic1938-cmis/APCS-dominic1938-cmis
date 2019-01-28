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
        if (array.length == 1 || array.length == 0)
        {
            return array;
        }
        else
        {
            int p = back.length;
            for (int i = 0; i < front.length; i++)
            {
                front[i] = array[i];
            }
            for (int x = 0; x < back.length; x++)
            {
                back[x] = array[p];
                p++;
            }
            front = merge(front);
            back = merge(back);
                    int f = 0;
        int b = 0;
        for (int count = 0; count < array.length; count ++)
        {
            if (front[f] <= back[b] && f != front.length)
            {
                array[count] = front[f];
                f++;
            }
            else if (back[b] < front[f] && b != back.length)
            {
                array[count] = back[b];
                b++;
            }
            if (f  == front.length)
            {
                count++;
                for (int i = b; i < back.length; i++)
                {
                    array[count] = back[i];
                    count++;
                }
            }
            else if (b == back.length)
            {
                count++;
                for (int i = f; i < front.length; i++)
                {
                    array[count] = front[i];
                    count++;
                }
            }
        }
            return array;
        }
    }
}
