import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NietBeschikbaar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiamantScherm extends World
{

    /**
     * Constructor for objects of class NietBeschikbaar.
     * 
     */
    public DiamantScherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1000, 800, 1, false);
        
        
    
}
public void act(){
    
    
    
    if (LevelSelect.canAccesChest == false)
    {
       
    
this.setBackground("geenDiamanten.png");
addObject(new TerugKnop(), 500, 500);
}
    else if (Hero.diamanten < 4)
    {this.setBackground("aantalDiamanten.png");
addObject(new TerugKnop(), 500, 700);}
    else if (Hero.diamanten > 3 && Hero.diamanten < 9)
    {
        this.setBackground("groteSchatkist.png");
addObject(new TerugKnop(), 500, 700);
    }
    else if (Hero.diamanten > 8)
    {
        this.setBackground("alleDiamanten.png");
addObject(new TerugKnop(), 500, 700);
    }
}}