import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personage3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personage3 extends Levels
{
    /**
     * Act - do whatever the Personage3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage("p3_stand.png");
        if (Greenfoot.mouseClicked(this))
        {
            MyWorld.personage = 3;
            MyWorld.personagestring = "3";
            PersonageSelectie.firstStart = false;
            
            
            Greenfoot.setWorld(new LevelSelect());
        }
    }    
}
