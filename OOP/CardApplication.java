public class CardApplication
{
    public static void main(String[] args)
    {
        String[] myHand = new String[3];
        for (int i = 0; i < myHand.length; i++)
        {
            Card random = new Card();
            myHand[i] = random. getCard();
            System.out.println(myHand[i]);
        }
    }
}