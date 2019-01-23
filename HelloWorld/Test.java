public class Test {
    public static int[] merge(int[] array){
        int[] front = new int [array.length/2];
        int[] back = new int [array.length/2];
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
        return front;
    }
}
