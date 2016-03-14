
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/*
La clase Estrella permite almacenar una estrella
además de su posición en la pantalla, si está relleno o no,
su color etc.
 */

/**
 *
 * @author DanielaValentina
 */
public class Estrella extends Polygon{
    
    public Color color = null;
    public boolean relleno = false;
    
    public Estrella (int x, int y, int width, Color color, boolean relleno){
        //Estrella rellena parcialmente
        //0
        addPoint((int) (x + width * Math.cos(0 * 2 * Math.PI / 5)), (int) (y + width * Math.sin(0 * 2 * Math.PI / 5)));
        //1
        addPoint((int) (x + width * Math.cos(2 * 2 * Math.PI / 5)), (int) (y + width * Math.sin(2 * 2 * Math.PI / 5)));
        //2
        addPoint((int) (x + width * Math.cos(4 * 2 * Math.PI / 5)), (int) (y + width * Math.sin(4 * 2 * Math.PI / 5)));
        //3
        addPoint((int) (x + width * Math.cos(1 * 2 * Math.PI / 5)), (int) (y + width * Math.sin(1 * 2 * Math.PI / 5)));
        //4
        addPoint((int) (x + width * Math.cos(3 * 2 * Math.PI / 5)), (int) (y + width * Math.sin(3 * 2 * Math.PI / 5)));
        
        
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
