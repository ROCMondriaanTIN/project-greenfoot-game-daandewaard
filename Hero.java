import greenfoot.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author D. de Waard
 */
public class Hero extends Mover {

    private final double gravity;
    private int walking = 1;
    private int status = 0;
    private String richting = "rechts";
    public static boolean canCheck;

    private final double acc;
    private final double drag;
    private boolean geraakt = false;
    private int pause = 50;
    public static int levens = 2;
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
    public static boolean diamantAdded;
    public static int diamanten;
    private boolean isOnGround;
    public static boolean isLeft;
    
    public static int huidigLevel = 1;
    public static int Munten;

    public int animationCounter = 0;
    private int frame = 1;
    private static int teller = 1;
    public static boolean keyCollect = false;
    public static boolean keyNotFound = false;
    public static int aantalMunten;
    public static boolean isMirrored;
    public boolean hasJumped;
  

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
    private static GreenfootImage[] mirror = new GreenfootImage[33];

    public Hero() {
        super();
        gravity = 6.8;
        acc = 0.41;
        drag = 0.8;
        if (MyWorld.personage == 1) {
            setImage("p1.png");
        } else if (MyWorld.personage == 2) {
            setImage("p2_stand.png");
        } else {

            setImage("p3_stand.png");

        }

        mirror[0] = new GreenfootImage("p1_walk01.png");
        mirror[1] = new GreenfootImage("p1_walk02.png");
        mirror[2] = new GreenfootImage("p1_walk03.png");
        mirror[3] = new GreenfootImage("p1_walk04.png");
        mirror[4] = new GreenfootImage("p1_walk05.png");
        mirror[5] = new GreenfootImage("p1_walk06.png");
        mirror[6] = new GreenfootImage("p1_walk07.png");
        mirror[7] = new GreenfootImage("p1_walk08.png");
        mirror[8] = new GreenfootImage("p1_walk09.png");
        mirror[9] = new GreenfootImage("p1_walk10.png");
        mirror[10] = new GreenfootImage("p1_walk11.png");
        mirror[11] = new GreenfootImage("p2_walk01.png");
        mirror[12] = new GreenfootImage("p2_walk02.png");
        mirror[13] = new GreenfootImage("p2_walk03.png");
        mirror[14] = new GreenfootImage("p2_walk04.png");
        mirror[15] = new GreenfootImage("p2_walk05.png");
        mirror[16] = new GreenfootImage("p2_walk06.png");
        mirror[17] = new GreenfootImage("p2_walk07.png");
        mirror[18] = new GreenfootImage("p2_walk08.png");
        mirror[19] = new GreenfootImage("p2_walk09.png");
        mirror[20] = new GreenfootImage("p2_walk10.png");
        mirror[21] = new GreenfootImage("p2_walk11.png");
        mirror[22] = new GreenfootImage("p3_walk01.png");
        mirror[23] = new GreenfootImage("p3_walk02.png");
        mirror[24] = new GreenfootImage("p3_walk03.png");
        mirror[25] = new GreenfootImage("p3_walk04.png");
        mirror[26] = new GreenfootImage("p3_walk05.png");
        mirror[27] = new GreenfootImage("p3_walk06.png");
        mirror[28] = new GreenfootImage("p3_walk07.png");
        mirror[29] = new GreenfootImage("p3_walk08.png");
        mirror[30] = new GreenfootImage("p3_walk09.png");
        mirror[31] = new GreenfootImage("p3_walk10.png");
        mirror[32] = new GreenfootImage("p3_walk11.png");

        for (int i = 0; i < 33; i++) {
            mirror[i].mirrorHorizontally();
        }

    }

    @Override
    public void act() {
        updateOnGroundStats();
        

        jumpFix();
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("keyYellow")) {
                getWorld().removeObject(tile);
                keyCollect = true;
                Greenfoot.playSound("coin.wav");

                return;

            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("fence")) {
                if (Greenfoot.isKeyDown("space"))
                {
                    velocityY = -16;
                }

                

            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("ladder")) {
                if (Greenfoot.isKeyDown("space"))
                {
                    velocityY = -16;
                }

                

            }
        }
        
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("lock_yellow")) {
                if (keyCollect == true) {
                    
              
                    
                    
                    
                    
                    
                    getWorld().removeObject(tile);
                    Greenfoot.playSound("coin.wav");
                    if (huidigLevel == 1)
                    {
                        
                        keyCollect = false;
                        LevelSelect.lvl2A = true;
                        Greenfoot.setWorld(new LevelSelect());
                        break;
                    }
                    else if (huidigLevel == 2)
                    {
                        
                        keyCollect = false;
                        LevelSelect.lvl3A = true;
                        Greenfoot.setWorld(new LevelSelect());
                        break;
                    }
                    else if (huidigLevel == 3)
                    {
                     
                        keyCollect = false;
                        LevelSelect.lvl4A = true;
                        Greenfoot.setWorld(new LevelSelect());
                        break;
                    }
                    else if (huidigLevel == 4)
                    {
                        keyCollect = false;
                        LevelSelect.canAccesChest = true;
                        Greenfoot.setWorld(new LevelSelect());
                        break;
                    }
                } else if (keyCollect == false) {
                   
                        
                        break;
                }

            }
        }
        for (Actor actor : getIntersectingObjects(Tile.class)) {
            Tile tile = (Tile) actor;
            if (tile.getImage().toString().contains("gemYellow")) {
                diamantAdded = true;
                Greenfoot.playSound("coin.wav");
                diamanten ++;
                getWorld().removeObject(tile);

            }
        }

        for (Tile tile : getIntersectingObjects(Tile.class)) {

            if (tile.getImage().toString().contains("coinGold")) {
                getWorld().removeObject(tile);
                Greenfoot.playSound("coin.wav");
                aantalMunten += 2;
                Munten ++;
            }

        }
        for (Tile tile : getIntersectingObjects(Tile.class)) {

            if (tile.getImage().toString().contains("coinSilver")) {
                getWorld().removeObject(tile);
                Greenfoot.playSound("coin.wav");
                aantalMunten++;
                Munten++;
            }

        }
        if (aantalMunten == 40) {
            levens++;
            aantalMunten = 0;
        }

        for (Tile tile : getIntersectingObjects(Tile.class)) {
            if (getWorld().getObjects(Hero.class).size() != 0) {
                //Tile tile = (Tile) actor;
                if (tile.getImage().toString().contains("Water")) {
                    
                    while (pause != 0) {
                        geraakt = true;
                        if (MyWorld.personage == 1) {
                            setImage("p1_hurt.png");
                        } else if (MyWorld.personage == 2) {
                            setImage("p2_hurt.png");
                        } else {
                            setImage("p3_hurt.png");
                        }
                        pause--;
                        return;
                    }
                    pause = 50;

                    setLocation(300, 200);
                    setImage("p1.png");
                    geraakt = false;

                    levens--; 
                    JOptionPane.showMessageDialog(
                            null, "Je hebt nog  " + (levens) + " levens");
                }

                if (levens == 0) {
                    levens = 2;

                    Greenfoot.setWorld(new GameOver());

                            }
                continue;
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
                    if (isTouching(Tile.class)) {
                        

                        levens--;
                        JOptionPane.showMessageDialog(
                                null, "Je hebt nog  " + (levens) + " levens");
                        setLocation(300, 200);

                        geraakt = false;
                    } else {
                        getWorld().removeObject(enemy);
                        continue;

                    }
                    
                }
                
                            }
            for (Tile tile : getIntersectingObjects(Tile.class)) {
            if (getWorld().getObjects(Hero.class).size() != 0) {
                //Tile tile = (Tile) actor;
                if (tile.getImage().toString().contains("fireball")) {
                    
                    
                    while (pause != 0) {
                        geraakt = true;
                        if (MyWorld.personage == 1) {
                            setImage("p1_hurt.png");
                        } else if (MyWorld.personage == 2) {
                            setImage("p2_hurt.png");
                        } else {
                            setImage("p3_hurt.png");
                        }
                        pause--;
                        return;
                    }
                    pause = 50;

                    setLocation(300, 200);
                    setImage("p1.png");
                    geraakt = false;

                    levens--;
                    JOptionPane.showMessageDialog(
                            null, "Je hebt nog  " + (levens) + " levens");
                }

                
            }
        }

        }
    }

    public void jumpFix() {
        {

             if (Greenfoot.isKeyDown("Space") && (isOnGround)) {
                //for (Tile tile : getIntersectingObjects(Tile.class)) {
                  //  if (tile.getImage().toString().contains("grass")) {
                
                velocityY = -16;
                if (MyWorld.personage == 1)
                if (isLeft)
                {
                    setImage("p1_jumpM.png");
                }
                else{
                {
                setImage("p1_jump.png");
                }
            }
                else if (MyWorld.personage == 2)
                if (isLeft){
                setImage("p2_jumpM.png");}
                else{
                {
                    setImage("p2_jump.png");
                }}
                else
                {
                    if (isLeft){
                        setImage("p3_jumpM.png");}
                        else{
                    setImage("p3_jump.png");
                }}
            }
        }
    }
//}}

    public void handleInput() {
      // if (Greenfoot.isKeyDown("p")) {
        //    velocityY = -20;
        //    animationCounter = animationCounter + 1;
            
       // }

        if (Greenfoot.isKeyDown("a")) {
               isLeft = true;
            velocityX = -4;

            animationCounter = animationCounter + 1;
            if (animationCounter % 5 == 0) {
                animationLeft();

            }
//mirrorImg();
        } else if (Greenfoot.isKeyDown("d")) {
               isLeft = false;
            animationCounter = animationCounter + 1;
    
           if (animationCounter % 5 == 0) {
                animationRight();
            }
            velocityX = 4;

        }

    }

   private void animationRight() {

        switch (MyWorld.personage) {
            case 1:
                switch (teller) {
                    case 1:
                        setImage(run1);
                        teller++;
                        break;
                    case 2:
                        setImage(run2);
                        teller++;
                        break;
                    case 3:
                        setImage(run3);
                        teller++;
                        break;
                    case 4:
                        setImage(run4);
                        teller++;
                        break;
                    case 5:
                        setImage(run5);
                        teller++;
                        break;
                    case 6:
                        setImage(run6);
                        teller++;
                        break;
                    case 7:
                        setImage(run7);
                        teller++;
                        break;
                    case 8:
                        setImage(run8);
                        teller++;
                        break;
                    case 9:
                        setImage(run9);
                        teller++;
                        break;
                    case 10:
                        setImage(run10);
                        teller++;
                        break;
                        
                    default:
                        teller = 1;
                }   break;
            case 2:
                switch (teller) {
                    case 1:
                        setImage(p2run1);
                        teller++;
                        break;
                    case 2:
                        setImage(p2run2);
                        teller++;
                        break;
                    case 3:
                        setImage(p2run3);
                        teller++;
                        break;
                    case 4:
                        setImage(p2run4);
                        teller++;
                        break;
                    case 5:
                        setImage(p2run5);
                        teller++;
                        break;
                    case 6:
                        setImage(p2run6);
                        teller++;
                        break;
                    case 7:
                        setImage(p2run7);
                        teller++;
                        break;
                    case 8:
                        setImage(p2run8);
                        teller++;
                        break;
                    case 9:
                        setImage(p2run9);
                        teller++;
                        break;
                    case 10:
                        setImage(p2run10);
                        teller++;
                        break;
                        
                    default:
                        teller = 1;
                }   break;
            default:
                switch (teller) {
                    case 1:
                        setImage(p3run1);
                        teller++;
                        break;
                    case 2:
                        setImage(p3run2);
                        teller++;
                        break;
                    case 3:
                        setImage(p3run3);
                        teller++;
                        break;
                    case 4:
                        setImage(p3run4);
                        teller++;
                        break;
                    case 5:
                        setImage(p3run5);
                        teller++;
                        break;
                    case 6:
                        setImage(p3run6);
                        teller++;
                        break;
                    case 7:
                        setImage(p3run7);
                        teller++;
                        break;
                    case 8:
                        setImage(p3run8);
                        teller++;
                        break;
                    case 9:
                        setImage(p3run9);
                        teller++;
                        break;
                    case 10:
                        setImage(p3run10);
                        teller++;
                        break;
                        
                    default:
                        teller = 1;
                }   break;
        }

    }

    private void animationLeft() {

        if (MyWorld.personage == 1) {
            switch (teller) {
                case 1:
                    setImage(mirror[0]);
                    teller++;
                    break;
                case 2:
                    setImage(mirror[1]);
                    teller++;
                    break;
                case 3:
                    setImage(mirror[2]);
                    teller++;
                    break;
                case 4:
                    setImage(mirror[3]);
                    teller++;
                    break;
                case 5:
                    setImage(mirror[4]);
                    teller++;
                    break;
                case 6:
                    setImage(mirror[5]);
                    teller++;
                    break;
                case 7:
                    setImage(mirror[6]);
                    teller++;
                    break;
                case 8:
                    setImage(mirror[7]);
                    teller++;
                    break;
                case 9:
                    setImage(mirror[8]);
                    teller++;
                    break;
                case 10:
                    setImage(mirror[9]);
                    teller++;
                    break;
                case 11:
                    //setImage(mirror[10]);
                    //teller++;
                    teller = 1;
                    break;

                default:
                    teller = 1;
            }

        } else if (MyWorld.personage == 2) {
            switch (teller) {
                case 1:
                    setImage(mirror[11]);
                    teller++;
                    break;
                case 2:
                    setImage(mirror[12]);
                    teller++;
                    break;
                case 3:
                    setImage(mirror[13]);
                    teller++;
                    break;
                case 4:
                    setImage(mirror[14]);
                    teller++;
                    break;
                case 5:
                    setImage(mirror[15]);
                    teller++;
                    break;
                case 6:
                    setImage(mirror[16]);
                    teller++;
                    break;
                case 7:
                    setImage(mirror[17]);
                    teller++;
                    break;
                case 8:
                    setImage(mirror[18]);
                    teller++;
                    break;
                case 9:
                    setImage(mirror[19]);
                    teller++;
                    break;
                case 10:
                    setImage(mirror[20]);
                    teller++;
                    break;
                case 11:
                    setImage(mirror[21]);
                    teller++;
                    break;

                default:
                    teller = 1;
            }
        } else {
            switch (teller) {
                case 1:
                    setImage(mirror[22]);
                    teller++;
                    break;
                case 2:
                    setImage(mirror[23]);
                    teller++;
                    break;
                case 3:
                    setImage(mirror[24]);
                    teller++;
                    break;
                case 4:
                    setImage(mirror[25]);
                    teller++;
                    break;
                case 5:
                    setImage(mirror[26]);
                    teller++;
                    break;
                case 6:
                    setImage(mirror[27]);
                    teller++;
                    break;
                case 7:
                    setImage(mirror[28]);
                    teller++;
                    break;
                case 8:
                    setImage(mirror[29]);
                    teller++;
                    break;
                case 9:
                    setImage(mirror[30]);
                    teller++;
                    break;
                case 10:
                    setImage(mirror[31]);
                    teller++;
                    break;
                case 11:
                    setImage(mirror[32]);
                    teller++;
                    break;

                default:
                    teller = 1;
            }
        }

    }

    public int getWidth() {
        return getImage().getWidth();
    }

    public int getHeight() {
        return getImage().getHeight();

    }

    public void mirrorImg() {
        if (richting.equals("left")) {
           getImage().mirrorHorizontally();
        }
    }
    private void updateOnGroundStats() {
        
            
        int dx = getImage().getWidth() / 2;
        int dy = getImage().getHeight() / 2 + 1;

        //checks if here is not going up or down
        if (velocityY != 0) {
            isOnGround = false;
            return;
        }
        //checks tile exacly under hero
        for (Tile tile : getObjectsAtOffset(0, dy, Tile.class)) {
            if (tile.isSolid) isOnGround = true;
            break;
        }
        //checks if hero is on the edge of a block
        if (!isOnGround) {
            for (Tile tile : getObjectsAtOffset(dx - 3, dy, Tile.class)) {
                if (tile.isSolid) isOnGround = true;
                break;
            }
            if (!isOnGround) {
                for (Tile tile : getObjectsAtOffset(dx * -1 + 3, dy, Tile.class)) {
                    if (tile.isSolid) isOnGround = true;
                    break;
                }}
            }
        }
    }

