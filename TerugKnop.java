import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TerugKnop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TerugKnop extends Levels
{
    /**
     * Act - do whatever the TerugKnop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
        // setImage("level1.png");dd your action code here.
         setImage("tnm.png");
         if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new LevelSelect());
        }
    }}
      