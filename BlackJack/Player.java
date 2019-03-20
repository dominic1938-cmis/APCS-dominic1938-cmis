import java.util.*;
import java.util.Scanner;
public class Player
{
    private Hand hand;
    private Deck deck;
    private int chips;
    private int counter;

    public Player (String name)
    {
        Player newPlayer = new Player("Player" + name);
    }

    public void draw()
    {
        hand.addCard(deck.draw());
    }

    public Hand getHand()
    {
        return hand;
    }
}

