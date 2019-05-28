import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Monsters extends Actor
{
    Monsters monster;
    Monsters[] allMonsters = new Monsters[4];
    
    public void act() 
    {
        add();
    }    

    public void add()
    {
        allMonsters[0] = new Bat();
        allMonsters[1] = new Bee();
        allMonsters[2] = new Mouse();
        allMonsters[3] = new Squid();
    }
    
    public Monsters()
    {
        int ranMonster = (int)(Math.random() * 3);
        this.monster = allMonsters[ranMonster];
    }

    public Monsters getMonster()
    {
        return monster;
    }
    
    public Monsters[] getList()
    {
        return allMonsters;
    }
}
