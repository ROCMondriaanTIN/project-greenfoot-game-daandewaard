/* import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level4B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
/*
public class DiamantScreen extends Levels
{
  
    public void act() 
    {
        setImage("levelDiamant.png");
        if (Greenfoot.mouseClicked(this)){
        if (LevelSelect.canAccesChest == false)
        {
            setImage("geenDiamanten.png");
            LevelSelect.isClicked = true;
        }
        // setImage("level1.png");dd your action code here.
    }}
    
    
}
*/

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DiamantScreen extends Levels
{
    /**
     * Act - do whatever the Level2B wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage("levelDiamant.png");
        if (Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new DiamantScherm());
        
        
        // Add your action code here.
    }    
}}
