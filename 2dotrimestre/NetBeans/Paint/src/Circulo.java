import java.awt.Color;
import java.awt.Graphics2D;
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
public class Circulo extends Ellipse2D.Double{
    
    public Color color = null;
    public boolean relleno = false;
    
    public Circulo (int x, int y, int width, Color color, boolean relleno){
        this.x = x - width/2;
        this.y = y - width/2;
        this.width = width;
        this.height = width;
        this.color = color;
//g2.fill es para el relleno
//g2.draw es para el contorno
        this.relleno = relleno;
    }
    
    public void pintaYcolorea(Graphics2D g2){
        //con esto le digo el color
        g2.setColor(this.color);
            if (this.relleno) {
                g2.fill(this);
            } else {
                g2.draw(this);
            }
    }
}

