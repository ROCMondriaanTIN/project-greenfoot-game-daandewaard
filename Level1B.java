import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1B extends Levels
{
    /**
     * Act - do whatever the Level1B wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setImage("level1.png");
        if (Greenfoot.mouseClicked(this))
        {
            MyWorld.firstStart = false;
               Greenfoot.setWorld(new Level1());

        }
    }    
}
