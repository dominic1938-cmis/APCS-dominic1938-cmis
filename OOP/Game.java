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
        Player player =  new Player("Guy", 10000);
        players.add(player);
    }
    
    public void setup()
    {
        deck.shuffle();
        
    }
}
