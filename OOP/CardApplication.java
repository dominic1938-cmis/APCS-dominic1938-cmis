import java.util.*;
import java.util.Scanner;
public class CardApplication
{ 
    public static void main(String[] args)
    {

        Card[] deck = new Card[52];
        int d = 0;
        for(int rank = 0; rank < 13; rank++){
            for(int suit = 0; suit < 4; suit++){
                deck[d] = new Card(suit, rank);
                d++;
            }
        }

        /*
        for(Card cards : deck)
        {
        System.out.println(cards);
        }
         */

        Deck decks = new Deck(2);
        /*
        while (decks. nCards() > 0)
        {
        System.out.println(decks.draw());
        }
         */

        decks = new Deck(2);
        decks.shuffle();
        /*
        while (decks. nCards() > 0)
        {
        System.out.println(decks.draw());
        }
         */

        Hand hand = new Hand();
        while (hand. getVal() < 21)
        {
            hand.addCard(deck[(int)(Math.random() * 52)]);
        }

        /*
        System.out.println(hand);
        System.out.println(hand. getVal());
         */
        
        Scanner Scan = new Scanner (System.in);
        int players = Scan.nextInt();
        
        List<Hand> hands = new ArrayList<Hand>();
        
        for (int x = 0; x < players; x++)
        {
            Hand tmpHnd = new Hand();
            for (int y = 0; y < 2; y++)
            {
                tmpHnd.addCard(decks.draw());
            }
            hands.add(tmpHnd);
        }
    }
}
