import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3B extends Levels
{
    /**
     * Act - do whatever the Level3B wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage("level3.png");
         if (Greenfoot.mouseClicked(this))
        {
            MyWorld.firstStart = false;
               Greenfoot.setWorld(new Level3());

        }
        // Add your action code here.
    }    
}
