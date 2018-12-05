import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level4B extends Levels
{
    /**
     * Act - do whatever the Level4B wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // setImage("level1.png");dd your action code here.
         setImage("level4.png");
         if (Greenfoot.mouseClicked(this))
        {
            MyWorld.firstStart = false;
               Greenfoot.setWorld(new Level4());

        }
    }    
    
    
}
