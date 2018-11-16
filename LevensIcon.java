/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 302305958
 */
public class LevensIcon extends Mover
{
    
    
    public void act(){
        
      if (null == MyWorld.personagestring){
          if (Hero.levens == 3){
              setImage("p33.png");}
          else if (Hero.levens == 2){
              setImage("p32.png");}
          else if (Hero.levens == 1){
              setImage("hud_p3.png");}
          else{
          setImage("empty.png");}
          
      }
      else switch (MyWorld.personagestring) {
            case "1":
                if (Hero.levens == 3){
                    setImage("p13.png");}
                else if (Hero.levens == 2){
                    setImage("p12.png");}
                else if(Hero.levens == 1){
                    setImage("hud_p1.png");}
                else{
                setImage("empty.png");}
                
                break;
            case "2":
                if (Hero.levens == 3){
                    setImage("p23.png");}
                else if (Hero.levens == 2){
                    setImage("p22.png");}
                else if (Hero.levens == 1){
                    setImage("hud_p2.png");
                } else{
                    setImage("empty.png");
                }break;
            default:
                if (Hero.levens == 3){
                    setImage("p33.png");}
                else if (Hero.levens == 2){
                    setImage("p32.png");}
                else if (Hero.levens == 1){
                    setImage("hud_p3.png");}
                else{
                setImage("empty.png");}break;
        }
    }
}
    
