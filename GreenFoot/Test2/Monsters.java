import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Monsters extends Actor
{
    Monsters monster;
    Monsters[] allMonsters = new Monsters[4];
    private World battle = new Battle();
    public void act() 
    {
        add();
        summon();
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

    public void summon()
    {
        battle.addObject(new Monsters(),300,200);
    }
}
