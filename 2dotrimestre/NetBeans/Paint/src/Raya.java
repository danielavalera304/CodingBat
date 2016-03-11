import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;

/*
 * Mi primera clase java

La clase circulo permite almacenar un circulo
además de su posición en la pantalla, si está relleno o no,
su color etc.
 */

/**
 *
 * @author DanielaValentina
 */
public class Raya extends Polygon{
    
    public Color color = null;
    public boolean relleno = false;
    
    public Raya (int x, int y, int width, Color color){
        
        this.npoints = 2;
        
        this.xpoints[0] = x;
        this.ypoints[0] = y;
        this.xpoints[1] = x + width;
        this.ypoints[1] = y;
        this.color = color;
//g2.fill es para el relleno
//g2.draw es para el contorno
    }
    
    public void pintaYcolorea(Graphics2D g2){
        //con esto le digo el color
        g2.setColor(this.color);
                g2.draw(this);
    }
}