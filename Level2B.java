import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2B extends Levels
{
    /**
     * Act - do whatever the Level2B wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage("level2.png");
         if (Greenfoot.mouseClicked(this))
        {
            MyWorld.firstStart = false;
               Greenfoot.setWorld(new Level2());

        }
        // Add your action code here.
    }    
}
