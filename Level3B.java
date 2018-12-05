import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3B extends Levels
{
    /**
     * Act - do whatever the Level3B wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         setImage("level3.png");
         if (Greenfoot.mouseClicked(this))
        {
            if (LevelSelect.lvl3A == true){
            MyWorld.firstStart = false;
            Hero.huidigLevel = 3;
               Greenfoot.setWorld(new Level3());

        }
            else{Greenfoot.setWorld(new NietBeschikbaar());}}
        // Add your action code here.
    }    
}
