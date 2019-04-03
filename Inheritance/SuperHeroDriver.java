import java.util.*;
public class SuperHeroDriver
{
    public static void main(String[] args)
    {
        List<SuperHero> heroes = new ArrayList<SuperHero>();

        FriedEggMan eggman = new FriedEggMan();
        VeryCoolMan cool = new VeryCoolMan();
        AsteroidMan asteroid = new AsteroidMan();

        eggman.setSuitColor("Yellow");
        cool.setSuitColor("Black");
        asteroid.setSuitColor("Grey");

        eggman.setCape(true);
        cool.setCape(false);
        asteroid.setCape(true);

        heroes.add(eggman);
        heroes.add(cool);
        heroes.add(asteroid);

        p("Original set of ArrayList Heroes...");
        for (SuperHero hero: heroes)
        {
            p(hero + "\t" + hero.isCaped() + "\t" + hero.getSuitColor() + "\t" + hero.motto() + "\t");
        }
        p("\n");
        //next part

        SuperHero[][] capedHeroes = new SuperHero[3][3];
        int index = 0; 
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                if (index < heroes.size() && heroes.get(index).isCaped() == true){
                    capedHeroes[a][b] = heroes.get(index); 
                    heroes.remove(index); 
                }else{
                    index ++; 
                }
            }
        }

        p("Printing 2D Array CapedHeroes..."); 
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                System.out.print(capedHeroes[a][b] + "\t"); 
            }
            System.out.println(); 
        }
        p("\n");
        //next part

        p("Printing contents of Caped Heroes...");
        for(int a = 0; a < 3; a++){
            for(int b = 0; b < 3; b++){
                if (capedHeroes[a][b] != null){
                    System.out.print(capedHeroes[a][b] + "\t" + capedHeroes[a][b].isCaped()+ "\t" + capedHeroes[a][b].getSuitColor() + "\t" + capedHeroes[a][b].motto() + "\n"); 
                }
            }
        }
        p("\n");

        p("Remaining set of ArrayList Heroes...");
        for (SuperHero hero: heroes)
        {
            p(hero + "\t" + hero.isCaped() + "\t" + hero.getSuitColor() + "\t" + hero.motto());
        }

    }

    public static void p(Object string){
        System.out.println(string);
    }
}
