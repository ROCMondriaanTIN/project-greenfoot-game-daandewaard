
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class Level4B here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Info extends Levels
{
    /**
     * Act - do whatever the Level4B wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
   setImage("info.png");
   if (Greenfoot.mouseClicked(this))
        {
        JOptionPane.showMessageDialog(
                                null, "Greenfoot project Collect The Key");    
        }
    
    
}
}