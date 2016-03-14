import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/*
La clase Ovalo permite almacenar un ovalo
además de su posición en la pantalla, si está relleno o no,
su color etc.
 */

/**
 *
 * @author DanielaValentina
 */
// Es la misma clase que el circulo pero con el ancho cambiado.
public class Ovalo extends Ellipse2D.Double{
    
    public Color color = null;
    public boolean relleno = false;
    
    public Ovalo (int x, int y, int width, Color color, boolean relleno){
        this.x = x - width/2;
        this.y = y - width/2;
        this.width = width/2;
        this.height = width;
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
