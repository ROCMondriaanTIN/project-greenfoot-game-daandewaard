import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2B extends Levels
{
    /**
     * Act - do whatever the Level2B wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage("level2.png");
         if (Greenfoot.mouseClicked(this))
        {
            if (LevelSelect.lvl2A == true){
            MyWorld.firstStart = false;
            Hero.huidigLevel = 2;
               Greenfoot.setWorld(new Level2());
            }
            else{Greenfoot.setWorld(new NietBeschikbaar());}

        }
        // Add your action code here.
    }    
}
