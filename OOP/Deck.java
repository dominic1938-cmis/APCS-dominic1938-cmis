import java.util.*;
public class Deck
{
    private List<Card> cards;
    public Deck(int nDecks){
        cards = new ArrayList<Card>();
        for (int rounds = 0; rounds < nDecks; rounds++)
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
        int indexOne = ((int)(Math.random() * cards.size()));
        int indexTwo = ((int)(Math.random() * cards.size()));
        Card c1 = cards.get(indexOne);
        Card c2 = cards.get(indexOne);
        cards.set(c1, c2);
    }
}