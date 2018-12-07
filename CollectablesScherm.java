import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NietBeschikbaar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CollectablesScherm extends World
{
    public int diamantX = 600;
    

    /**
     * Constructor for objects of class NietBeschikbaar.
     * 
     */
    public CollectablesScherm()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(1000, 800, 1, false);
        
        
    
}
public void act(){
   
    setBackground("collectscreen.png");
    addObject (new TerugKnop(), 900, 700);
    addObject (new Cijfers(1), 600, 100);
    if (LevelSelect.lvl2A == true)
    {
        addObject (new Cijfers(2), 650, 100);
    }
    if (LevelSelect.lvl3A == true)
    {
        addObject (new Cijfers(3), 700, 100);
    }
    if (LevelSelect.lvl4A == true)
    {
        addObject (new Cijfers(4), 750, 100);
    }
    addObject (new PuntenTientallen(), 600, 270);
    addObject (new Punten(), 650,270);
   
    
if (Hero.levens == 1)
{
    addObject (new LevensIcon(),600 ,610);
}
if (Hero.levens == 2)
{
    addObject (new LevensIcon(),675 ,610);
}
if (Hero.levens == 3)
{
    addObject (new LevensIcon(),725 ,610);
}
if (Hero.levens == 4)
{
    addObject (new LevensIcon(),775 ,610);
}
if (Hero.levens == 5)
{
    addObject (new LevensIcon(),850 ,610);
}
if (Hero.diamanten == 1)
{
    addObject (new Diamant(),600 ,675);
}
if (Hero.diamanten == 2)
{
    addObject (new Diamant(),625 ,320);
}
    
    
    
    
    
    
    
    
    
}}
  