import java.util.*;
import java.util.Scanner;
public class Game
{
    private List<Player> players;
    private Player dealer;
    private Deck deck;

    public Game()
    {
        deck = new Deck(5);
    }
    
    public void addPlayer()
    {
        Player player =  new Player("Guy");
        players.add(player);
    }
    
    public void setup()
    {
        deck.shuffle();
        for (int x = 0; x < players.size(); x++)
        {
            ;
        }
    }
}
