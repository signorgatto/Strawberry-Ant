import greenfoot.*;
public class Spider extends Actor
{   public void act() 
    {
        movement();
        eating();}
    public void movement()
    {   move(5);
        turn(Greenfoot.getRandomNumber(9));}
    public void eating()
    {   Actor Ant;
        Ant = getOneObjectAtOffset(0,0, Ant.class);
        if (Ant != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Ant);}}}
