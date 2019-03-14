import java.util.*;
import java.util.Scanner;
public class Game
{
    private List<Hand> player;
    private List<Hand> deck;
    
    public Deck setDeck(int nDecks)
    {
        Deck deck = new Deck(nDecks);
        deck.shuffle();
        return deck;
    }
    
    public Player createPlayer(int nPlayer)
    {
        
        for (int x = 0; x < nPlayer; x++)
        {
            Hand tmpHnd = new Hand();
            for (int y = 0; y < 2; y++)
            {
                tmpHnd.addCard(deck.draw());
            }
            player.add(tmpHnd);
        }
    }
}
