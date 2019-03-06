public class CardApplication
{ 
    public static void main(String[] args)
    {
        Card[] deck = new Card[52];
        int d = 0;
        for (int rank = 0; rank < 13; rank++)
        {
            for (int suit = 0; suit < 4; suit++)
            {
                deck[d] = new Card(suit,rank);
                d++;
            }
        }
        
        Hand hand = new Hand();
        for (int i = 0; i < 2; i++)
        {
            hand.addCard(deck[(int)(Math.random() * 52)]);
        }
        System.out.println(hand);
    }
}
