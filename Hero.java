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
    private  int pause = 100;

    public Hero() {
        super();
        gravity = 2.8;
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
         
                setLocation(300, 200);
                setImage("p1.png");
            }
            geraakt = false;
            
        }
    }

    public void handleInput() {
        if (geraakt == false){
        if (Greenfoot.isKeyDown("w") && (isTouching(Tile.class))) {
            velocityY = -15;
        }

        if (Greenfoot.isKeyDown("a")) {
            velocityX = -2;
        } else if (Greenfoot.isKeyDown("d")) {
            velocityX = 2;
        }
    }
}

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();
    }
}