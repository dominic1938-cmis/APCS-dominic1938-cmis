import java.util.*;
import java.util.Scanner;
public class Player
{
    private Hand hand;
    private Deck deck;
    private int chips;
    private int counter;

    public Player (String name, int chip)
    {
        for (int y = 0; y < 2; y++)
        {
            hand.addCard(deck.draw());
        }
    }

    public void draw(Deck deck)
    {
        hand.addCard(deck.draw());
    }

    public Hand getHand()
    {
        return hand;
    }
    
    public Player deal()
    {
        
    }
}

