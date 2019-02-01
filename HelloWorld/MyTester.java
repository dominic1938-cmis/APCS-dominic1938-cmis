//package Sorting;

public class MyTester
{
    public static void main(String[] args){
        ArrayType at = ArrayType.REVERSED; //SORTED, RANDOM, or REVERSED
        int n = 10;
        int[] array = Util.getArray(n, at);
        int[] tmp = array;
        long start, stop, btime, itime, stime, mtime;
        System.out.println("UNSORTED");
        Util.print(array);

        int count = 0;
        long total = 0;
        int run;
        for (run  = 0; run < 10; run++){
            start = System.nanoTime();
            BubbleSort.sort(array);
            btime = System.nanoTime() - start;
            count += BubbleSort.steps;
            total += btime;
            array = tmp;;
            BubbleSort.steps = 0;
        }
        long avg = (long) (total / (double)run);
        long avgStp = (long) (count / (double)run);
        System.out.println ("Bubble Time: " + avg);
        System.out.println ("Bubble Steps: " + avgStp);

        count = 0;
        total = 0;
        for (run  = 0; run < 10; run++){
            start = System.nanoTime();
            SelectionSort.sort(array);
            btime = System.nanoTime() - start;
            count += SelectionSort.steps;
            total += btime;
            array = tmp;;
            SelectionSort.steps = 0;
        }
        avg = (long) (total / (double)run);
        avgStp = (long) (count / (double)run);
        System.out.println ("Selection Time: " + avg);
        System.out.println ("Selection Steps: " + avgStp);

        count = 0;
        total = 0;
        for (run  = 0; run < 10; run++){
            start = System.nanoTime();
            InsertionSort.sort(array);
            btime = System.nanoTime() - start;
            count += InsertionSort.steps;
            total += btime;
            array = tmp;;
            InsertionSort.steps = 0;
        }
        avg = (long) (total / (double)run);
        avgStp = (long) (count / (double)run);
        System.out.println ("Insertion Time: " + avg);
        System.out.println ("Insertion Steps: " + avgStp);
        
        count = 0;
        total = 0;
        for (run  = 0; run < 10; run++){
            start = System.nanoTime();
            MergeSort.sort(array);
            btime = System.nanoTime() - start;
            count += MergeSort.steps;
            total += btime;
            array = tmp;;
            MergeSort.steps = 0;
        }
        avg = (long) (total / (double)run);
        avgStp = (long) (count / (double)run);
        System.out.println ("Insertion Time: " + avg);
        System.out.println ("Insertion Steps: " + avgStp);
        
        
        System.out.println("SORTED");
        Util.print(array);

    }
}
