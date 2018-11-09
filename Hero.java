import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Hero extends Mover {

    private final double gravity;
    private final double acc;
    private final double drag;
    private  int pause = 10;

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
                setImage("p1_hurt.png");
                if (pause != 0) {
    pause--;
    return;
}
         
                getWorld().removeObject(this);
                break;
            }
        }
    }

    public void handleInput() {
        if (Greenfoot.isKeyDown("w") && (isTouching(Tile.class))) {
            velocityY = -10;
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