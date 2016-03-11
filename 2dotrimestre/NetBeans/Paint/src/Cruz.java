
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
public class Cruz extends Polygon{
    
    public Color color = null;
    public boolean relleno = false;
    
    public Cruz (int x, int y, int width, Color color, boolean relleno){

        //con esto guardo cuatro puntos del triangulo
        
        
        
        //le digo donde están los 12 puntos con coordenadas
        addPoint(x - width, y - 3*width);
        addPoint(x + width, y - 3*width);
        addPoint(x + width, y - width);
        addPoint(x +3* width, y - width);
        addPoint(x +3* width, y + width);
        addPoint(x + width, y + width);
        addPoint(x + width, y +3* width);
        addPoint(x - width, y +3* width);
        addPoint(x - width, y + width);
        addPoint(x -3* width, y + width);
        addPoint(x -3* width, y - width);
        addPoint(x - width, y - width);
        
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
