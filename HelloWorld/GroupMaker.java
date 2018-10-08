public class GroupMaker{
    public static String[] makeGroups(String[] name, int groupSize){
        int size = name.length / groupSize;
        String [] result = new String [size];
        for (int length = 0; length < size; length ++)
        {
            result [length] = "";
        }

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

        int randposit = 0;
        for (int resultposit = 0; resultposit < size; resultposit ++)
        {
            int insideposit = 0;
            while (insideposit < groupSize)
            {
                result [resultposit] += randomize [randposit];
                randposit ++;
                insideposit ++;
            }
        }
        if (name.length % groupSize != 0)
        {
            int finallength = name.length % groupSize;
            String yeet = "";
            for (int finalposit = name.length - 1; finalposit > name.length - (1 + finallength); finalposit --)
            {
                yeet += randomize [finalposit];
            }
        }
        return result;
    }
}