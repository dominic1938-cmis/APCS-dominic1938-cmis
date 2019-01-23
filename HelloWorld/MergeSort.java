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
            int f = 0;
            int b = 0;
            int count = 0;
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
            if (front.length == 1 && back.length == 1)
            {
                while (count < array.length){
                    if (front[f] < back[b])
                    {
                        array[count] = front[f];
                    }
                    else if (front[f] > back[b])
                    {
                        array[count] = back[b];
                    }
                    else
                    {
                        if (front[f] < back[b])
                        {
                            array[count] = front[f];
                        }
                        else if (front[f] > back[b])
                        {
                            array[count] = back[b];
                        }
                    }
                    count++;
                }
            }
            else{
                while (f < front.length || b < back.length){
                    if (front[f] < back[b])
                    {
                        array[count] = front[f];
                        f++;
                    }
                    else if (front[f] > back[b])
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
}
