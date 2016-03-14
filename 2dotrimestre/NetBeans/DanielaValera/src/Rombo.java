
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/*
La clase Rombo permite almacenar un rombo
además de su posición en la pantalla, si está relleno o no,
su color etc.
 */

/**
 *
 * @author DanielaValentina
 */
public class Rombo extends Polygon{
    
    public Color color = null;
    public boolean relleno = false;
    
    public Rombo (int x, int y, int height, int width, Color color, boolean relleno){

        //con esto guardo cuatro puntos del triangulo
        this.npoints = 4;
        
        //le digo donde están exactamente esos puntos [0](un punto) [1](otro punto) [2](el tercer punto)
        this.xpoints[0] = x;
        this.ypoints[0] = y + height;
        
        this.xpoints[1] = x - width;
        this.ypoints[1] = y;
        
        this.xpoints[2] = x;
        this.ypoints[2] = y - height;
        
        this.xpoints[3] = x + width;
        this.ypoints[3] = y;
        
        this.color = color;
        this.relleno = relleno;
    }
    
    public void pintaYcolorea(Graphics2D g2){
        //con esto le digo el color
        g2.setColor(this.color);
        //con esto el relleno
            if (this.relleno) {
                //g2.fill es para el relleno
                g2.fill(this);
            } else {
                //g2.draw es para el contorno
                g2.draw(this);
            }
    }
}
