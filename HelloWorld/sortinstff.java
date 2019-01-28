public class sortinstff
{
    public static int[] merge(int[] front, int[] back){
        int[] array = new int [front.length + back.length];
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
