import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PersonageSelectie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonageSelectie extends World
{
    public static boolean firstStart = true;

    /**
     * Constructor for objects of class PersonageSelectie.
     * 
     */
    public PersonageSelectie()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
    }
    public void act()
    {
        setBackground("personageSelectie.png");
        addObject (new Personage1(), 300,400);
        addObject (new Personage2(), 500,400);
        addObject (new Personage3(), 700,400);
        if (firstStart == false)
        {
            addObject (new TerugKnop(), 500, 700);
            
            
        }
    }
}
