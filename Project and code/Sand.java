import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sand extends World
{

    /**
     * Constructor for objects of class Sand.
     * 
     */
    public Sand()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Ant ant = new Ant();
        addObject(ant,301,195);
        Spider spider = new Spider();
        addObject(spider,93,94);
        Spider spider2 = new Spider();
        addObject(spider2,93,335);
        Spider spider3 = new Spider();
        addObject(spider3,512,331);
        Spider spider4 = new Spider();
        addObject(spider4,513,92);
        Strawberry strawberry = new Strawberry();
        addObject(strawberry,298,85);
        Strawberry strawberry2 = new Strawberry();
        addObject(strawberry2,299,328);
        Strawberry strawberry3 = new Strawberry();
        addObject(strawberry3,482,208);
        Strawberry strawberry4 = new Strawberry();
        addObject(strawberry4,120,213);
        Strawberry strawberry5 = new Strawberry();
        addObject(strawberry5,32,32);
        Strawberry strawberry6 = new Strawberry();
        addObject(strawberry6,571,29);
        Strawberry strawberry7 = new Strawberry();
        addObject(strawberry7,571,368);
        Strawberry strawberry8 = new Strawberry();
        addObject(strawberry8,34,365);
        spider2.setLocation(91,333);
        spider2.setLocation(101,316);
        spider.setLocation(110,114);
        spider4.setLocation(491,109);
        spider3.setLocation(483,309);
    }
}
