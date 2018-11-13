
import greenfoot.*;

/**
 *
 * @author R. Springer
 */
public class Tile extends Actor {

    static int tileNumGet;

    public boolean isSolid = false;
    
    private static int id;
    public int _id;
    public boolean canJump;
    public static int tileNum;
    public static boolean water;
    

    /**
     * Contructor of the tile. Creates a tile based on image, width and height
     *
     * @param image Path to the image file
     * @param width Width of the tile
     * @param heigth Height of the tile
     */
    public Tile(String image, int width, int heigth) {
        super();
        setImage(image);
        getImage().scale(width, heigth);
        if (CollisionEngine.DEBUG) {
            getImage().drawString("ÏD: " + id, 10, 10);
        }
        _id = id;
        id++;
    }

    Tile() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public String toString() {
        return "id: " + _id + "\n"
                + "X: " + getX() + "\n"
                + "Y: " + getY();
    }
    public int tileNumGet() {
      return tileNum;
    }
}
