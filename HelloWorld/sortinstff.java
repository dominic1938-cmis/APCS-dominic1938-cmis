public class sortinstff
{
    public static int[] merge(int[] front, int[] back){
        int[] array = new int [front.length + back.length];
        int count = 0;
        int f = 0;
        int b = 0;
        while (count < array.length)
        {
            if (front[f] < back[b])
            {
                array[count] = front[f];
                if (f + 1 < front.length)
                {
                    f++;
                }
            }
            else if (back[b] < front[f])
            {
                array[count] = back[b];
                if (b + 1 < back.length)
                {
                    b++;
                }
            }
            count++;
        }
        return array;
    }
}
