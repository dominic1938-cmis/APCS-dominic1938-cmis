import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Health extends Actor
{
    GreenfootImage img;
    public Health(int life){
        img = new GreenfootImage(89, 30);
        img.fill();
        img.setColor(Color.BLUE);
        img.fillRect(0,0,89, 30);
        img.setColor(Color.WHITE);
        img.drawString(""+life, 0, 30);
        setImage(img);
    }
    
    public void setLife(int life){
        img.fill();
        img.setColor(Color.BLUE);
        img.fillRect(0,0,life, 20);
        img.setColor(Color.WHITE);
        img.drawString(""+life, 0, 30);
    }  
}
