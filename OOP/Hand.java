import java.util.*;
public class Hand
{
    private List<Card>hands;
    public Hand()
    {
        hands = new ArrayList<Card>();
    }

    public void addCard(Card card)
    {
        hands.add(card);
    }

    public int getVal(){
        int score = 0;
        for(Card card: hands){
            int rank = card.getRank();
            if(rank == 0){
                if(score + 11 > 21){
                    score += 1;
                }else{
                    score += 11;
                }
            }else if(rank < 10){
                score += rank + 1;
            }else{
                score += 10;
            }
        }
        return score;
    }
    
    public String toString()
    {
        String out = "";
        for (Card card : hands)
        {
            out += card.toString() + " ";
        }
        return out;
    }
}
