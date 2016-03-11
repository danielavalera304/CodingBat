
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

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
public class Estrella extends Polygon{
    
    public Color color = null;
    public boolean relleno = false;
    
    public Estrella (int x, int y, int width, Color color, boolean relleno){

        //con esto guardo cuatro puntos del triangulo
        
//        //codigo del pentagono
//        for (int i=0;i<5; i++){
//        addPoint((int) (x + width * Math.cos(i * 2 * Math.PI / 5)), (int) (y + width * Math.sin(i * 2 * Math.PI / 5)));
//        }
        
        //Estrella rellena parcialmente
        addPoint((int) (x + width * Math.cos(0 * 2 * Math.PI / 5)), (int) (y + width * Math.sin(0 * 2 * Math.PI / 5)));
        addPoint((int) (x + width * Math.cos(2 * 2 * Math.PI / 5)), (int) (y + width * Math.sin(2 * 2 * Math.PI / 5)));
        addPoint((int) (x + width * Math.cos(4 * 2 * Math.PI / 5)), (int) (y + width * Math.sin(4 * 2 * Math.PI / 5)));
        addPoint((int) (x + width * Math.cos(1 * 2 * Math.PI / 5)), (int) (y + width * Math.sin(1 * 2 * Math.PI / 5)));
        addPoint((int) (x + width * Math.cos(3 * 2 * Math.PI / 5)), (int) (y + width * Math.sin(3 * 2 * Math.PI / 5)));
        
        
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
