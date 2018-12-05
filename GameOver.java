import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelSelect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends World
{


    /**
     * Constructor for objects of class LevelSelect.
     * 
     */
    public GameOver()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 800, 1); 
        
       
    }
    public void act()
    {
         this.setBackground("gameover.png");
         if(Greenfoot.isKeyDown("space")){
         Greenfoot.setWorld(new LevelSelect());}
         
         
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 302305958
 */
