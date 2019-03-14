import java.util.*;
public class Deck
{
    private List<Card> cards;
    public Deck(int nDecks){
        cards = new ArrayList<Card>(nDecks * 52);
        while (nDecks-- > 0)
        {
            for(int suit = 0; suit < 4; suit++){
                for(int rank = 0; rank < 13; rank++){
                    cards.add(new Card(suit, rank));
                }
            }
        }
    }

    public int nCards(){
        return cards.size();
    }

    public Card draw(){
        int last = cards.size() - 1;
        return cards.remove(last);
    }

    public void shuffle(){
        for (int x = 0; x < cards.size(); x++)
        {
            int indexOne = ((int)(Math.random() * cards.size()));
            int indexTwo = ((int)(Math.random() * cards.size()));
            Card c1 = cards.get(x);
            Card c2 = cards.get(indexTwo);
            cards.set(indexTwo, c1);
            cards.set(x, c2);
        }
    }
}