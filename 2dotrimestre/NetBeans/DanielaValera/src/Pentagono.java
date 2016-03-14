
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/*
 * La clase Pentagono permite almacenar un pentagono
además de su posición en la pantalla, si está relleno o no,
su color etc.
 */

/**
 *
 * @author DanielaValentina
 */
public class Pentagono extends Polygon{
    
    public Color color = null;
    public boolean relleno = false; 
    
    public Pentagono (int x, int y, int width, Color color, boolean relleno){
        //codigo del pentagono
        for (int i=0;i<5; i++){
        addPoint((int)(x + width * Math.cos(i * 2 * Math.PI / 5)), (int) (y + width * Math.sin(i * 2 * Math.PI / 5)));
        }
        
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
