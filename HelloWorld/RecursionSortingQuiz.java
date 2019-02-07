public class RecursionSortingQuiz
{
    public static void main(String[] args){
        System.out.println("I'm ready to serve you!");
    }

    /**
     * @param n the value
     * @return n!
     * 
     * Factorials
     * n! => n * n-1 * n-2 * ... * n -(n-1)
     * 10! => 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1 => 3628800
     * 5! => 5 * 4 * 3 * 2 * 1 => 120
     * 0! => 1
     */
    public static int factorial(int n){
        if (n == 1)
        {
            return 1;
        }
        else if (n == 0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n-1);
        }
    }

    /**
     * @param array the array to be sorted
     * @return the array sorted
     */
    public static int[] kiefferSort(int[] array){
        if (array.length == 1 || array.length == 0)
        {
            return array;
        }
        
        
        else{
            for(int i = 0; i < array.length-1; i++){
                if (array[i] > array[i + 1])
                {
                    int rand = (int)(Math.random() * (array.length));
                    int first = array[0];
                    array[0] =  array[rand];
                    array[rand] = first;
                    array = kiefferSort(array);
                }
            }
        }
        return array;
    }
}