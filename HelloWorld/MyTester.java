public class MyTester
{
    public static void main(String[] args){
        ArrayType at = ArrayType.SORTED; //SORTED, RANDOM, or REVERSED
        int n = 100000;
        int[] array = Util.getArray(n, at);
        int[] tmp = array;
        long start, stop, btime, itime, stime, mtime;
        System.out.println("UNSORTED");
        Util.print(array);

        long total = 0;
        int run;
        for (run  = 0; run < 50; run++){
            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            total += btime;
            array = tmp;;
        }
        long avg = (long) (total / (double)run);
        System.out.print (avg);
        /*
        start = System.nanoTime();
        SelectionSort.sort(array);
        stime = System.nanoTime() - start;
        array = tmp;

        start = System.nanoTime();
        InsertionSort.sort(array);
        itime = System.nanoTime() - start;
        array = tmp;

        start = System.nanoTime();
        MergeSort.sort(array);
        mtime = System.nanoTime() - start;

        System.out.println("SORTED");
        Util.print(array);
        */
    }
}
