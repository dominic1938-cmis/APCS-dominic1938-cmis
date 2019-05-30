import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Battle extends World
{
    private Meg meg = new Meg();
    private int chance = 98;
    private int roundNum = 9;
    private int amountSummoned;
    private int condition = 10;
    private boolean start = false;
    private boolean waiting = false;
    private int wait = 500;
    private int attackCount = 250;
    private int bulletCount;
    private int amount = 5;
    Boss boss = new Boss();
    private GreenfootImage[] maps = new GreenfootImage[4];
    public Battle()
    {    
        super(600, 400, 1);
        setBackground(new GreenfootImage("forest.jpg"));
        prepare();
        showText("Press Space to Start", 300,200);
        maps[0] = new GreenfootImage("map1.png");
        maps[1] = new GreenfootImage("map3.png");
        maps[2] = new GreenfootImage("forest.jpg");
        maps[3] = new GreenfootImage("map4.png");
    }

    public void act()
    {
        if (roundNum == 10)
        {
            prepareBoss();
            if (attackCount > 0)
            {
                attackCount--;
                if (attackCount == 0)
                {
                    bossAttack();
                    bulletCount++;
                    attackCount = 250 - amount;
                }
            }
        }
        else if (start || Greenfoot.isKeyDown("space"))
        {
            showText("",300,200);
            start = true;
            int ran = (int)(Math.random() *100);
            int side = (int)((Math.random() * 2) + 1);
            int ranXl = (int)((Math.random() * 28) + 8);
            int ranYl = (int)((Math.random() * 239) +219);
            int ranXr = (int)((Math.random() * 591) + 586);
            int ranYr = (int)((Math.random() * 395) +223);
            showText("Round " + roundNum, 300,100);
            showText("Monsters Left " + (condition-amountSummoned), 500,25);
            if (amountSummoned == condition)
            {
                waiting = true;
                if (wait > 0)
                {
                    wait--;
                    if (wait == 0)
                    {
                        int ranMap = (int)(Math.random() * 3);
                        roundNum++;
                        setBackground(maps[ranMap]);
                        setDifficulty(1);
                        amountSummoned = 0;
                        condition += 10;
                        waiting = false;
                        wait = 500;
                    }
                }
            }
            else if (ran > chance && !waiting)
            {
                if (side == 2)
                {
                    summon(ranXl, ranYl);
                    amountSummoned++;
                }
                else if (side == 1)
                {
                    summon(ranXr, ranYr);
                    amountSummoned++;
                }
            }
        }
    }

    public void prepare()
    {
        Face face = new Face();
        addObject(meg,562,290);
        addObject(face,42,42);
    }

    public void summon(int x, int y)
    {
        int ranMonster = (int)(Math.random() * 4);
        switch(ranMonster)
        {
            case(0):
            addObject(new Bee(), x,y);
            break;
            case(1):
            addObject(new Squid(), x,y);
            break;
            case(2):
            addObject(new Mouse(), x,y);
            break;
            case(3):
            addObject(new Bat(), x,y);
            break;
        }
    }

    public void bossAttack()
    {
        if (bulletCount == 5)
        {
            amount += 10;
            bulletCount = 0;
        }
        BossProjectile[] shoot = new BossProjectile[amount];
        for(int i= 0;i<shoot.length;i++)
        {
            shoot[i] = new BossProjectile();
            int shootX = Greenfoot.getRandomNumber(getWidth());
            int shootY = Greenfoot.getRandomNumber(getHeight());
            addObject(shoot[i],shootX,shootY);
        }
        if (boss.getHealth() <= 10000)
        {
            int random = Greenfoot.getRandomNumber(100);
            if (random <= 95)
            {
                summon(boss.bossX(), boss.bossY());
            }
        }
    }

    public void prepareBoss()
    {
        start = false;
        setBackground(new GreenfootImage("map2.png"));
        showText("",500,25);
        showText("",300,100);
        addObject(boss, 300, 125);
    }

    public void setDifficulty(int x)
    {
        chance -= x;
    }

    public Meg getMeg()
    {
        return meg;
    }
}
