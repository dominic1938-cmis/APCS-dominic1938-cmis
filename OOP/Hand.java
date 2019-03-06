import java.util.*;
public class Hand
{
    private List<Card>cards;
    private int count;
    
    public Hand()
    {
        cards = new ArrayList<Card>();
    }
    
    public void addCard(Card card)
    {
        cards.add(card);
    }
    
    public int getVal()
    {
        for (Card card : cards)
        {
            count += 
        }
    }
    
    public String toString()
    {
        String out = "";
        for (Card card : cards)
        {
            out += card.toString() + " ";
        }
        return out;
    }
}
