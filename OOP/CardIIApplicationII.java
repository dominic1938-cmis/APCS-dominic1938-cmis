public class CardIIApplicationII
{
    public static void main(String[] args)
    {
        int countDealer = 0;
        int countp1 = 0;
        int countp2 = 0;
        int countp3 = 0;
        int countp4 = 0;
        int countp5 = 0;
        String[] dealer = new String[2];
        String[] p1 = new String[2];
        String[] p2 = new String[2];
        String[] p3 = new String[2];
        String[] p4 = new String[2];
        String[] p5 = new String[2];
        for (int i = 0; i < 2; i++)
        {
            CardII random = new CardII();
            dealer[i] = random. getCardII();
            countDealer += random. getIntCardII();
        }

        for (int i = 0; i < 2; i++)
        {
            CardII random = new CardII();
            p1[i] = random. getCardII();
            countp1 += random. getIntCardII();
        }

        for (int i = 0; i < 2; i++)
        {
            CardII random = new CardII();
            p2[i] = random. getCardII();
            countp2 += random. getIntCardII();
        }

        for (int i = 0; i < 2; i++)
        {
            CardII random = new CardII();
            p3[i] = random. getCardII();
            countp3 += random. getIntCardII();
        }

        for (int i = 0; i < 2; i++)
        {
            CardII random = new CardII();
            p4[i] = random. getCardII();
            countp4 += random. getIntCardII();
        }

        for (int i = 0; i < 2; i++)
        {
            CardII random = new CardII();
            p5[i] = random. getCardII();
            countp5 += random. getIntCardII();
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
