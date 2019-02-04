public class LinearSearchAlgorithm
{
    public static void main (String[] args)
    {
        int[] array = {1,4,8,9,10};
        System.out.println(search(array,9));
    }

    public static int search(int[] arr, int threshold)
    {
        for (int i  = 0; i <  arr.length; i++)
        {
            if (arr[i] == threshold)
            {
                return i;
            }
        }
        return -1;
    }
}