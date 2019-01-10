public class BubbleSort
{
    public static void main(String[] args){
        int[] array = getArray(20, true);
        print(array);
        sort(array);
        print(array);
    }

    public static int[] sort(int[] array){
        int y = 0;
        int a = 0;
        int out[] = new int [array.length];
        for (boolean swap = false; swap != true; swap = swap)
        {
            for (int x = 1; x < array.length; x++)
            {
                if (array[x] > array[y])
                {
                    out[x] = array[x];
                    a++;
                }
                y++;
            }
            if (a > 0){
                swap = false;
                a = 0;
            }
            else
            {
                swap = true;
            }
        }
        return out; 
    }

    public static int[] getArray(int w, boolean random){
        int[] array = new int[w];
        int ct = 0;
        for(int i = 0; i < w; i++){
            if(random)
                array[i] = (int)(Math.random() * 20000) * (Math.random() > 0.4 ? -1 : 1);
            else
                array[i] = ct++;
        }
        return array;
    }

    public static void print(int[] array){
        String out = "{";
        for(int i = 0; i < array.length; i++){
            out += array[i];
            if( i != array.length -1)
                out+=", ";
        }
        out+= "}\n";
        System.out.println(out);
    }
}