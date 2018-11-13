
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
    private  int pause = 50;
    private int levens = 3;
    public static boolean canJump;
    public boolean jumpEnabled(boolean canJump) {
    Hero.canJump = canJump;
    if (canJump == true){
    canJump = true;
    return canJump;
    }
    else{
      canJump = false;
      return canJump;
    }}
   
    

    public void jump(){
    
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
                
                while(pause != 0) {
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
            levens --;
            System.out.print(levens);
        }
        
        if (levens == 0)
        {
        getWorld().removeObject(this);
        
    }
    }

    public void handleInput() {
        if (geraakt == false){
       
            if (Greenfoot.isKeyDown("w") && (isTouching(Tile.class)) && (velocityY <= 0)) {
            velocityY = -20;
        }
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -2;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 2;
        }
    }


    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}