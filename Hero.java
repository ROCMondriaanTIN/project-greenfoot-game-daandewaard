
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
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
    private int frame = 1;

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

    public void jump() {

    }

    public Hero() {
        super();
        gravity = 6.8;
        acc = 0.61;
        drag = 0.8;
        setImage("p1.png");
    }

    @Override
    public void act() {
        if(frame > 10)
        {
        frame = 1;
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
                    System.out.print(levens);
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
    

    public void handleInput() {
        if (geraakt == false) {

            if (Greenfoot.isKeyDown("w") && (isTouching(Tile.class)) && (velocityY <= 0)) {
                velocityY = -20;
            }
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -2;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 2;
            animateRight();
            System.out.println(frame);
        }
    }
    public void animateRight(){
        if(frame == 1)
        {
        setImage(run1);
        }
        else if(frame == 2)
        {
            setImage(run1);
        }
        else if(frame == 3)
        {
        setImage(run2);
        }
        else if(frame == 4)
        {
            setImage(run2);
        }
        else if(frame == 5)
        {
            setImage(run3);
        }
        else if(frame == 6)
        {
            setImage(run3);
        }
        else if(frame == 7)
        {
            setImage(run4);
        }
        else if(frame == 8)
        {
            setImage(run4);
        }
        else if(frame == 9)
        {
            setImage(run5);
        }
        else if(frame == 10)
        {
            setImage(run5);
        }
        else if(frame == 11)
        {
            setImage(run6);
            return;
        }
    
        

        frame ++;
        
    }


    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();

    }
}
