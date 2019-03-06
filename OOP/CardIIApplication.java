public class CardIIApplication
{
    public static void main(String[] args)
    {
        String[] myHand = new String[3];
        for (int i = 0; i < myHand.length; i++)
        {
            CardII random = new CardII();
            myHand[i] = random. getCardII();
            System.out.println(myHand[i]);
        }
    }
}