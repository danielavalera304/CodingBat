
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
            if (this.relleno) {
                g2.fill(this);
            } else {
                g2.draw(this);
            }
    }
}
