public class Card
{
    private int suit; 
    private int rank; 
    private boolean faceUp;
    private int num;

    public Card(){
        suit = (int)(Math.random() * 4);
        rank = (int)(Math.random() * 13);
    }
    
    public Card (int newSuit, int newRank)
    {
        this.suit = newSuit;
        this.rank = newRank;
    }
    
    public int getSum()
    {
        if (num == 0)
        {
            return 11;
        }
        else if (num > 10)
        {
            return 10;
        }
        else if (num <= 10)
        {
            return num;
        }
        return -1;
    }
    
    public String toString(){
        String[] suits = {"H","D","S","C"};
        String[] ranks = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String out = String.format("%s%s", ranks[rank], suits[suit]);
        return out;
    }
}
