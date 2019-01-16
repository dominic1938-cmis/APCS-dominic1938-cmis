public class SelectionSort
{
    public static void main(String[] args){
        int[] numbers = new int[15];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int)(Math.random() * 100);
        }
        print(numbers);
        sort(numbers);
        print(numbers);
    }

    public static void print(int[] array){
        for(int i : array){
            System.out.println(i);
        }
        System.out.println();
    }

    public static void sort(int[] array){
        int temp = 0;
        int min = 0;
        int index = 0;
        boolean swap = true;
        while (swap != false){
            swap = false;
            for (int x = 0; x < array.length; x++)
            {
                for (int y = x; y < array.length; y++)
                {
                    if (y == x){
                        min = array[y];
                        index = y;
                    }
                    if (array[y] < array[x])
                    {
                        min = array[y];
                        index = y;
                        swap = true;
                    }
                }
                temp = array[x];
                array[x] = min;
                array[index] = temp;
            }
        }
    }
}