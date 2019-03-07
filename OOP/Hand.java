import java.util.*;
public class Hand
{
    private List<Card>cards;

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
        int count = 0;
        boolean isAce = false;
        for (Card card : cards)
        {
            count += card.getRank();
            if(card.getRank() == 11)
            {
                isAce = true;
            }
        }
        if (count > 21 && isAce)
        {
            count -= 10;
        }
        return count;
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
