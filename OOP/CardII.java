public class CardII
{
    private String suit;
    private String rank;
    private int intRank;
    private String[] suitSet = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] rankSet = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Queen", "King", "Ace"};
    private int[] convertRankSet = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 11};

    public CardII()
    {
        int randomSuit = (int)(Math.random() * ((4 - 1) + 1));
        int randomRank = (int)(Math.random() * ((12 - 1) + 1));
        this. suit = suitSet[randomSuit];
        this. rank = rankSet[randomRank];
        this. intRank = convertRankSet[randomRank];
    }

    public String getCardII()
    {
        return suit + rank;
    }
    
    public String[] getSuitSet()
    {
        return suitSet;
    }
    
    public String[] getRankSet()
    {
        return rankSet;
    }
    
    public int getIntCardII()
    {
        return intRank;
    }   

    public String toString()
    {
        String out = "The " + this.rank + " of " + this.suit + "\n";
        return out;
    }
}
