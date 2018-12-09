
import greenfoot.Greenfoot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 302305958
 */
public class StartScreen extends Mover 
{
    
    
         public void act(){
   
   
   
       setImage("gameoverr.png");
       if(Greenfoot.isKeyDown("space")){
   getWorld().removeObject(this);
       MyWorld.isGameOver = false;}
   }
    }

    

