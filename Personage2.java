import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Personage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Personage2 extends Levels
{
    /**
     * Act - do whatever the Personage2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage("p2_stand.png");
        if (Greenfoot.mouseClicked(this))
        {
            MyWorld.personage = 2;
            MyWorld.personagestring = "2";
            PersonageSelectie.firstStart = false;
            Greenfoot.setWorld(new LevelSelect());
        }
    }    
}
