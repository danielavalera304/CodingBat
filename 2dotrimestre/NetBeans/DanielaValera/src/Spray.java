import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/*
La clase Spray permite almacenar un spray
además de su posición en la pantalla, si está relleno o no,
su color etc.
 */

/**
 *
 * @author DanielaValentina
 */
// Es la misma clase que el circulo pero sin relleno, solo con contorno.
public class Spray extends Ellipse2D.Double{
    
    public Color color = null;
    public boolean relleno = false;
    
    public Spray (int x, int y, int width, Color color, boolean relleno){
        
        this.x = x - width/2;
        this.y = y - width/2;
        this.width = width;
        this.height = width;
        this.color = color;
        this.relleno = relleno;

    }
    
    public void pintaYcolorea(Graphics2D g2){
        //con esto le digo el color
        g2.setColor(this.color);
        //g2.draw es para el contorno
                g2.draw(this);
    }
}