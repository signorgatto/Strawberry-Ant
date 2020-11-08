import greenfoot.*;
public class Ant extends Actor
{   public void act() {
    //move(2);
    movement();
    eating();}
    public void movement(){
        if (Greenfoot.mouseMoved(null)){
            MouseInfo mouse = Greenfoot.getMouseInfo();
            setLocation (mouse.getX(), mouse.getY());}}
    public void eating(){
        Actor Strawberry;
        Strawberry = getOneObjectAtOffset(0,0,
        Strawberry.class);
        if (Strawberry != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Strawberry);
        }
    }
}

