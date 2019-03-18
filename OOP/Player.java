import java.util.*;
import java.util.Scanner;
public class Player
{
    private Hand hands;
    private Deck deck;
    private int chips;

    public void addPlayer(Deck deck)
    {
        
    }

    public void draw(Deck deck)
    {
        hands.addCard(deck.draw());
    }

    public Hand getHand()
    {
        return hands;
    }
}

