public class Bubble
{
    public static void main(String[] args){
        int[] array = getArray(20, true);
        print(array);
        sort(array);
        print(array);
    }

    public static int[] sort(int[] array){
        int temp = 0;
        boolean swap = true;
        while (swap != false)
        {
            swap = false;
            for (int x = 0; x < array.length - 1; x++)
            {
                if (array[x] > array[x + 1])
                {
                    temp = array[x];
                    array[x] = array[x + 1];
                    array[x + 1] = temp;
                    swap = true;
                }
            }
        }
        return array;
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