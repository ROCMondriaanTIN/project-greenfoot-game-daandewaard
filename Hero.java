
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
   private int walking = 1;
    private int status = 0;
    private String richting = "right";

    private final double acc;
    private final double drag;
    private boolean geraakt = false;
    private int pause = 50;
    private int levens = 3;
    public static boolean canJump;
    private GreenfootImage run1 = new GreenfootImage("p1_walk01.png");
    private GreenfootImage run2 = new GreenfootImage("p1_walk02.png");
    private GreenfootImage run3 = new GreenfootImage("p1_walk03.png");
    private GreenfootImage run4 = new GreenfootImage("p1_walk04.png");
    private GreenfootImage run5 = new GreenfootImage("p1_walk05.png");
    private GreenfootImage run6 = new GreenfootImage("p1_walk06.png");
    private GreenfootImage run7 = new GreenfootImage("p1_walk07.png");
    private GreenfootImage run8 = new GreenfootImage("p1_walk08.png");
    private GreenfootImage run9 = new GreenfootImage("p1_walk09.png");
    private GreenfootImage run10 = new GreenfootImage("p1_walk10.png");
    private GreenfootImage run11 = new GreenfootImage("p1_walk11.png");
    private GreenfootImage p2run1 = new GreenfootImage("p2_walk01.png");
    private GreenfootImage p2run2 = new GreenfootImage("p2_walk02.png");
    private GreenfootImage p2run3 = new GreenfootImage("p2_walk03.png");
    private GreenfootImage p2run4 = new GreenfootImage("p2_walk04.png");
    private GreenfootImage p2run5 = new GreenfootImage("p2_walk05.png");
    private GreenfootImage p2run6 = new GreenfootImage("p2_walk06.png");
    private GreenfootImage p2run7 = new GreenfootImage("p2_walk07.png");
    private GreenfootImage p2run8 = new GreenfootImage("p2_walk08.png");
    private GreenfootImage p2run9 = new GreenfootImage("p2_walk09.png");
    private GreenfootImage p2run10 = new GreenfootImage("p2_walk10.png");
    private GreenfootImage p2run11 = new GreenfootImage("p2_walk11.png");
    private GreenfootImage p3run1 = new GreenfootImage("p3_walk01.png");
    private GreenfootImage p3run2 = new GreenfootImage("p3_walk02.png");
    private GreenfootImage p3run3 = new GreenfootImage("p3_walk03.png");
    private GreenfootImage p3run4 = new GreenfootImage("p3_walk04.png");
    private GreenfootImage p3run5 = new GreenfootImage("p3_walk05.png");
    private GreenfootImage p3run6 = new GreenfootImage("p3_walk06.png");
    private GreenfootImage p3run7 = new GreenfootImage("p3_walk07.png");
    private GreenfootImage p3run8 = new GreenfootImage("p3_walk08.png");
    private GreenfootImage p3run9 = new GreenfootImage("p3_walk09.png");
    private GreenfootImage p3run10 = new GreenfootImage("p3_walk10.png");
    private GreenfootImage p3run11 = new GreenfootImage("p3_walk11.png");
    public int animationCounter = 0;
    private int frame = 1;
    private static int teller = 1;

    public boolean jumpEnabled(boolean canJump) {
        Hero.canJump = canJump;
        if (canJump == true) {
            canJump = true;
            return canJump;
        } else {
            canJump = false;
            return canJump;
        }
    }
    public void removeTile(){
    removeTouching(Tile.class);}
    

    public void jump() {

    }

    public Hero() {
        super();
        gravity = 6.8;
        acc = 0.41;
        drag = 0.8;
        if (MyWorld.personage == 1){
        setImage("p1.png");
        }
        else if (MyWorld.personage == 2){
            setImage("p2_stand.png");
        }
        else{
            
        setImage("p3_stand.png");
        
    }}
    

    @Override
    public void act() {
        jumpFix();
        
        
        
        
        for (Tile tile : getIntersectingObjects(Tile.class))
        {
            //Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("Water"))
            {     
                Greenfoot.playSound("death.wav");
                while (pause != 0) {
                        geraakt = true;
                        setImage("p1_hurt.png");
                        pause--;
                        return;
                    }
                    pause = 50;

                    setLocation(300, 200);
                    setImage("p1.png");
                    geraakt = false;
            
                    levens--;
                    System.out.println(levens);
                }

                if (levens == 0) {
                    getWorld().removeObject(this);

                }
        }
        for (Tile tile : getIntersectingObjects(Tile.class))
        {
            if (tile.getImage().toString().contains("keyYellow"))
            {
                   Hero remover = new Hero();
                   remover.removeTile();
            }
        }
    
    
        
         {

            handleInput();

            velocityX *= drag;
            velocityY += acc;
            if (velocityY > gravity) {
                velocityY = gravity;
            }
            applyVelocity();
            

            
            for (Actor enemy : getIntersectingObjects(Enemy.class)) {
                if (enemy != null) {
                    Greenfoot.playSound("death.wav");

                    while (pause != 0) {
                        geraakt = true;
                        setImage("p1_hurt.png");
                        pause--;
                        return;
                    }
                    pause = 50;

                    setLocation(300, 200);
                    setImage("p1.png");
                    geraakt = false;
                }
                for (Actor enemy2 : getIntersectingObjects(Enemy.class)) {
                    if (enemy != null) {
                        Greenfoot.playSound("death.wav");

                        while (pause != 0) {
                            geraakt = true;
                            setImage("p1_hurt.png");
                            pause--;
                            return;
                        }
                        pause = 50;

                        setLocation(300, 200);
                        setImage("p1.png");
                    }
                    geraakt = false;
                    levens--;
                    System.out.println(levens);
                }

                if (levens == 0) {
                    getWorld().removeObject(this);
                    

                }
                for (Tile tile : getIntersectingObjects(Tile.class)){
                    System.out.println(Tile.tileNum);
                 if (Tile.tileNum == 46) 
                 {
                     while (pause != 0) {
                        geraakt = true;
                        setImage("p1_hurt.png");
                        pause--;
                        return;
                    }
                    pause = 50;

                    setLocation(300, 200);
                    setImage("p1.png");
                     
                }
                 
                }
            }

        }
    }
    
    public void jumpFix(){         {

            if (Greenfoot.isKeyDown("space") && (isTouching(Tile.class)) && (velocityY <= 0)) {
                velocityY = -20;
            }
        }}
    public void handleInput(){


        if (Greenfoot.isKeyDown("a")) {
            velocityX = -2;
        } else if (Greenfoot.isKeyDown("d")) {
            animationCounter = animationCounter +1;

        if(animationCounter % 5 == 0)
        {
        animation();
        }
            velocityX = 2;
            
        }
            
            }
             
            
        {
    
        }
            
            
        

    
    private void animation() {
        if (MyWorld.personage == 1){
        switch (teller){
                case 1:
                setImage(run2);
                teller ++;
                break;
                case 2:
                setImage(run2);
                teller ++;
                break;
                case 3:
                setImage(run2);
                teller ++;
                break;
                case 4:
                setImage(run2);
                teller ++;
                break;
                case 5:
                setImage(run2);
                teller ++;
                break;
                case 6:
                setImage(run5);
                teller ++;
                break;
                case 7:
                setImage(run5);
                teller ++;
                break;
                case 8:
                setImage(run5);
                teller ++;
                break;
                case 9:
                setImage(run5);
                teller ++;
                break;
                case 10:
                setImage(run5);
                teller ++;
                break;
                case 11:
                setImage(run8);
                teller ++;
                break;
                case 12:
                setImage(run8);
                teller ++;
                break;
                case 13:
                setImage(run8);
                teller ++;
                break;
                case 14:
                setImage(run8);
                teller ++;
                break;
                case 15:
                setImage(run8);
                teller ++;
                break;
                default:
                teller = 1;
    }
    }
        else if (MyWorld.personage == 2)
        {
            switch (teller){
                case 1:
                setImage(p2run2);
                teller ++;
                break;
                case 2:
                setImage(p2run2);
                teller ++;
                break;
                case 3:
                setImage(p2run2);
                teller ++;
                break;
                case 4:
                setImage(p2run2);
                teller ++;
                break;
                case 5:
                setImage(p2run2);
                teller ++;
                break;
                case 6:
                setImage(p2run5);
                teller ++;
                break;
                case 7:
                setImage(p2run5);
                teller ++;
                break;
                case 8:
                setImage(p2run5);
                teller ++;
                break;
                case 9:
                setImage(p2run5);
                teller ++;
                break;
                case 10:
                setImage(p2run5);
                teller ++;
                break;
                case 11:
                setImage(p2run8);
                teller ++;
                break;
                case 12:
                setImage(p2run8);
                teller ++;
                break;
                case 13:
                setImage(p2run8);
                teller ++;
                break;
                case 14:
                setImage(p2run8);
                teller ++;
                break;
                case 15:
                setImage(p2run8);
                teller ++;
                break;
                default:
                teller = 1;
    }
    }
        else if (MyWorld.personage == 3)
        {
            switch (teller){
                case 1:
                setImage(p3run2);
                teller ++;
                break;
                case 2:
                setImage(p3run2);
                teller ++;
                break;
                case 3:
                setImage(p3run2);
                teller ++;
                break;
                case 4:
                setImage(p3run2);
                teller ++;
                break;
                case 5:
                setImage(p3run2);
                teller ++;
                break;
                case 6:
                setImage(p3run5);
                teller ++;
                break;
                case 7:
                setImage(p3run5);
                teller ++;
                break;
                case 8:
                setImage(p3run5);
                teller ++;
                break;
                case 9:
                setImage(p3run5);
                teller ++;
                break;
                case 10:
                setImage(p3run5);
                teller ++;
                break;
                case 11:
                setImage(p3run8);
                teller ++;
                break;
                case 12:
                setImage(p3run8);
                teller ++;
                break;
                case 13:
                setImage(p3run8);
                teller ++;
                break;
                case 14:
                setImage(p3run8);
                teller ++;
                break;
                case 15:
                setImage(p3run8);
                teller ++;
                break;
                default:
                teller = 1;
            }}}

        
    
        

        


    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();

    }
    

}
