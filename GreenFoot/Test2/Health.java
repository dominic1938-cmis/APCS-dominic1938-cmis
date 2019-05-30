import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Health extends Actor
{
    GreenfootImage img;
    Color color = new Color(55, 186, 77);
    public Health(int life){
        img = new GreenfootImage(100, 30);
        img.setColor(Color.BLACK);
        img.fill();
        img.setColor(color);
        img.fillRect(0,0,life, 30);
        img.setColor(Color.WHITE);
        img.drawString(""+life, 75, 20);
        setImage(img);
    }

    public void setLife(int life){
        img.setColor(Color.BLACK);
        img.fill();
        img.setColor(color);
        img.fillRect(0,0,life, 30);
        img.setColor(Color.WHITE);
        img.drawString(""+life, 75, 20);
    }  
    
    public Health(int life, boolean x){
        img = new GreenfootImage(300, 30);
        img.setColor(Color.BLACK);
        img.fill();
        img.setColor(Color.RED);
        img.fillRect(0,0,life, 30);
        img.setColor(Color.WHITE);
        img.drawString(""+life, 140, 20);
        setImage(img);
    }
    
    public void setLife(int life, boolean x){
        img.setColor(Color.BLACK);
        img.fill();
        img.setColor(Color.RED);
        img.fillRect(0,0,life, 30);
        img.setColor(Color.WHITE);
        img.drawString(""+life, 79, 20);
    }  
}
