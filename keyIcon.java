/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 302305958
 */
public class keyIcon extends Mover 
{
    
    
         public void act(){
    if (Hero.keyCollect == true){
    setImage("hud_keyYellow.png");}
    else{
    setImage("hud_keyYellow_disabled.png");}}
    
}
