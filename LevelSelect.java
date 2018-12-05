import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelSelect extends World
{
    public static boolean lvl2A;
    public static boolean lvl3A;
    public static boolean lvl4A;
    public static boolean diamantA;

    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public LevelSelect()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        
       
    }
    public void act()
    {
         this.setBackground("levelBG.png");
         addObject(new Level1B(), 200, 350);
         addObject(new Level2B(), 400, 350);
         addObject(new Level3B(), 600, 350);
         addObject(new Level4B(), 800, 350);
         
         
    }
}
