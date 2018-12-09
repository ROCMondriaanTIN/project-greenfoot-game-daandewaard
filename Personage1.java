import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personage1 extends Levels
{
    /**
     * Act - do whatever the Personage1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage("p1.png");
        if (Greenfoot.mouseClicked(this))
        {
            MyWorld.personage = 1;
            MyWorld.personagestring = "1";
            PersonageSelectie.firstStart = false;
            Greenfoot.setWorld(new LevelSelect());
        }
    }    
}
