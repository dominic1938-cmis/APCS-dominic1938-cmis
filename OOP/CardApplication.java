public class CardApplication
{ 
    public static void main(String[] args)
    {
        /*
        Card[] deck = new Card[52];
        int d = 0;
        for(int rank = 0; rank < 13; rank++){
            for(int suit = 0; suit < 4; suit++){
                deck[d] = new Card(suit, rank);
                d++;
            }
        }

        Hand hand = new Hand();
        while (hand. getVal() < 21)
        {
            hand.addCard(deck[(int)(Math.random() * 52)]);
        }

        System.out.println(hand);
        System.out.println(hand. getVal());
        */
        
        Deck decks = new Deck(2);
        while (decks. nCards() > 0)
        {
            System.out.println(decks.draw());
        }
    }
}

