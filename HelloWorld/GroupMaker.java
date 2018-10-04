public class GroupMaker{
    public static String[] makeGroups(String[] name, int groupSize){
        int size = name.length / groupSize;
        String [] result = new String [size];
        String [] randomize =  new String [name.length];
        int [] check = new int [name.length];
        for (int integer = 0; integer < name.length; integer++){
            while (randomize [integer] == null){
                int num = (int)(Math.random() * name.length);
                if (check [num] == 0)
                {
                    randomize [integer] = name[num];
                    check [num] = 1;
                }
            }
        }
        int times = 1;
        for (int posit = 0; posit < randomize.length; posit += groupSize){
            int zero = 0; 
            while (posit + zero < groupSize * times){
                result[posit] += randomize[posit + zero];
                zero ++;
            }
            times ++;
        }
        return result;
    }
}