public class Card
{
    private String suit;
    private String rank;
    private int intRank;
    private String[] suitSet = {"Clubs", "Spades", "Diamonds", "Hearts"};
    private String[] rankSet = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Queen", "King", "Ace"};
    private int[] convertRankSet = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 1};

    public Card()
    {
        int randomSuit = (int)(Math.random() * ((4 - 1) + 1));
        int randomRank = (int)(Math.random() * ((12 - 1) + 1));
        this. suit = suitSet[randomSuit];
        this. rank = rankSet[randomRank];
        this. intRank = convertRankSet[randomRank];
    }

    public String getCard()
    {
        return suit + rank;
    }
    
    public int getIntCard()
    {
        return intRank;
    }

    public Card(String value1, String value2)
    {
        this();
        this. suit = value1;
        this. rank = value2;
    }

    public String toString()
    {
        String out = "The " + this.rank + " of " + this.suit + "\n";
        return out;
    }
}
