public class CardApplicationII
{
    public static void main(String[] args)
    {
        int countDealer = 0;
        int countp1 = 0;
        int countp2 = 0;
        int countp3 = 0;
        int countp4 = 0;
        int countp5 = 0;
        String store1 = "";
        String store2 = "";
        String[] dealer = new String[2];
        String[] p1 = new String[2];
        String[] p2 = new String[2];
        String[] p3 = new String[2];
        String[] p4 = new String[2];
        String[] p5 = new String[2];
        for (int i = 0; i < 2; i++)
        {
            Card random = new Card();
            dealer[i] = random. getCard();
            countDealer += random. getIntCard();
        }

        for (int i = 0; i < 2; i++)
        {
            Card random = new Card();
            p1[i] = random. getCard();
            countp1 += random. getIntCard();
        }
        store1 = p1[0];
        store2 = p1[1];
        if (store1 == "Ace" && 
        (store2 == "10" || store2 == "Queen" || store2 == "King"))
        {
            countp1 = 21;
        }
        else if (store2 == "Ace" && 
        (store1 == "10" || store1 == "Queen" || store1 == "King"))
        {
            countp1 = 21;
        }

        for (int i = 0; i < 2; i++)
        {
            Card random = new Card();
            p2[i] = random. getCard();
            countp2 += random. getIntCard();
        }
        store1 = p2[0];
        store2 = p2[1];
        if (store1 == "Ace" && 
        (store2 == "10" || store2 == "Queen" || store2 == "King"))
        {
            countp2 = 21;
        }
        else if (store2 == "Ace" && 
        (store1 == "10" || store1 == "Queen" || store1 == "King"))
        {
            countp2 = 21;
        }

        for (int i = 0; i < 2; i++)
        {
            Card random = new Card();
            p3[i] = random. getCard();
            countp3 += random. getIntCard();
        }
        store1 = p3[0];
        store2 = p3[1];
        if (store1 == "Ace" && 
        (store2 == "10" || store2 == "Queen" || store2 == "King"))
        {
            countp3 = 21;
        }
        else if (store2 == "Ace" && 
        (store1 == "10" || store1 == "Queen" || store1 == "King"))
        {
            countp3 = 21;
        }

        for (int i = 0; i < 2; i++)
        {
            Card random = new Card();
            p4[i] = random. getCard();
            countp4 += random. getIntCard();
        }
        store1 = p4[0];
        store2 = p4[1];
        if (store1 == "Ace" && 
        (store2 == "10" || store2 == "Queen" || store2 == "King"))
        {
            countp4 = 21;
        }
        else if (store2 == "Ace" && 
        (store1 == "10" || store1 == "Queen" || store1 == "King"))
        {
            countp4 = 21;
        }

        for (int i = 0; i < 2; i++)
        {
            Card random = new Card();
            p5[i] = random. getCard();
            countp5 += random. getIntCard();
        }
        store1 = p5[0];
        store2 = p5[1];
        if (store1 == "Ace" && 
        (store2 == "10" || store2 == "Queen" || store2 == "King"))
        {
            countp5 = 21;
        }
        else if (store2 == "Ace" && 
        (store1 == "10" || store1 == "Queen" || store1 == "King"))
        {
            countp5 = 21;
        }

        System.out.println("Dealer:");
        for (int i = 0; i < 2; i++)
        {
            System.out.println(dealer[i]);
        }
        System.out.println(countDealer);
        
        System.out.println("--------");
        System.out.println("Player 1:");
        for (int i = 0; i < 2; i++)
        {
            System.out.println(p1[i]);
        }
        System.out.println(countp1);
        
        System.out.println("--------");
        System.out.println("Player 2:");
        for (int i = 0; i < 2; i++)
        {
            System.out.println(p2[i]);
        }
        System.out.println(countp2);
        
        System.out.println("--------");
        System.out.println("Player 3:");
        for (int i = 0; i < 2; i++)
        {
            System.out.println(p3[i]);
        }
        System.out.println(countp3);
        
        System.out.println("--------");
        System.out.println("Player 4:");
        for (int i = 0; i < 2; i++)
        {
            System.out.println(p4[i]);
        }
        System.out.println(countp4);
        
        System.out.println("--------");
        System.out.println("Player 5:");
        for (int i = 0; i < 2; i++)
        {
            System.out.println(p5[i]);
        }
        System.out.println(countp5);
        
        System.out.println("-----* GAME RESULT$ *-----");
        if (countp1 != 21 &&
        countp2 != 21 &&
        countp3 != 21 &&
        countp4 != 21 &&
        countp5 != 21 &&
        countp1 <= countDealer &&
        countp2 <= countDealer &&
        countp3 <= countDealer &&
        countp4 <= countDealer &&
        countp5 <= countDealer)
        {
            System.out.println("Dealer: WiNneR WiNnEr cHIcKen DInnEr");
        }
        else
        {
            System.out.println("Dealer: You are the big LOSER");
        }
        
        if (countp1 != 21 && countp1 > countDealer)
        {
            System.out.println("Player 1: WiNneR WiNnEr cHIcKen DInnEr");
        }
        else if (countp1 == 21)
        {
            System.out.println("Player 1: BLACKJACK!");
        }
        else
        {
            System.out.println("Player 1: You are the big LOSER");
        }
        
        if (countp2 != 21 && countp2 > countDealer)
        {
            System.out.println("Player 2: WiNneR WiNnEr cHIcKen DInnEr");
        }
        else if (countp2 == 21)
        {
            System.out.println("Player 2: BLACKJACK!");
        }
        else
        {
            System.out.println("Player 2: You are the big LOSER");
        }
        
        if (countp3 != 21 && countp3 > countDealer)
        {
            System.out.println("Player 3: WiNneR WiNnEr cHIcKen DInnEr");
        }
        else if (countp3 == 21)
        {
            System.out.println("Player 3: BLACKJACK!");
        }
        else
        {
            System.out.println("Player 3: You are the big LOSER");
        }
        
        if (countp4 != 21 && countp4 > countDealer)
        {
            System.out.println("Player 4: WiNneR WiNnEr cHIcKen DInnEr");
        }
        else if (countp4 == 21)
        {
            System.out.println("Player 4: BLACKJACK!");
        }
        else
        {
            System.out.println("Player 4: You are the big LOSER");
        }
        
        if (countp5 != 21 && countp5 > countDealer)
        {
            System.out.println("Player 5: WiNneR WiNnEr cHIcKen DInnEr");
        }
        else if (countp5 == 21)
        {
            System.out.println("Player 5: BLACKJACK!");
        }
        else
        {
            System.out.println("Player 5: You are the big LOSER");
        }
    }
}
