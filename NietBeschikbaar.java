import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NietBeschikbaar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NietBeschikbaar extends World
{

    /**
     * Constructor for objects of class NietBeschikbaar.
     * 
     */
    public NietBeschikbaar()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1000, 800, 1, false);
        
        
    
}
public void act(){
this.setBackground("nietBeschikbaar.png");
addObject(new TerugKnop(), 500, 500);
}
}