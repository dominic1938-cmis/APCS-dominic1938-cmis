import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
public class Monsters extends Actor
{
    private Monsters monster;
    private GreenfootImage[] allMonsters = new GreenfootImage[4];
    private GreenfootImage spooder = new GreenfootImage("spooder.png");
    private GreenfootImage bat = new GreenfootImage("bat.png");
    private GreenfootImage knight = new GreenfootImage("knight.png");
    private GreenfootImage zombie = new GreenfootImage("zombie.png");
    private GreenfootImage mouse = new GreenfootImage("mouse.png");
    public void act() 
    {
        add();
    }    

    public void add()
    {
        allMonsters[0] = spooder;
        allMonsters[1] = bat;
        allMonsters[2] = knight;
        allMonsters[3] = zombie;
        allMonsters[4] = mouse;
    }

    public Monsters()
    {
        int random = (int)(Math.random() * 4);
        monster.setImage(allMonsters[random]);
    }
}
