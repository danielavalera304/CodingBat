
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/*

*/


//Este public class es el principal de la clase. Dentro de él está el constructor y el main pero ese no lo voy a tocar
// únicamente el constructor, que es como el run de eclipse.
public class VentanaPrincipal extends javax.swing.JFrame {
//DECLARO LAS VARIABLES
    
    //Imagen en la que pintaré los circulos.
    //Es una VARIABLE parecida a un Image pero acelerado
    private BufferedImage buffer = null;
    //Indica el número de circulos que hay en el array
    int indice = 0;
    //Con el ArrayList guardo un método(listaFormas) en el que se guardan todas las formas de mi Paint
    ArrayList listaFormas = new ArrayList ();
    //VARIABLE que almacena el tipo de forma que estoy dibujando
    // si vale 0 ==> dibujo circulos, etc, por ejemplo.
    int forma = 0;
    //VARIABLE para almacenar el color
    Color colorElegido = Color.BLACK;
    //VARIABLES para almacenar la posicion en la que se empieza a dibujar la forma
    int posX = 0;
    int posY = 0;
    //VARIABLE para el boton del relleno
    public boolean sinRelleno = true;
    

//Este es el constructor(el run de eclipse).
    public VentanaPrincipal() {
        //1º Con este método hago toda la interfaz
        initComponents();
        this.getContentPane().setBackground(new Color(242, 139, 238));
        //2º Hago el folio en el que voy a pintar(creo un buffer del tamaño del jPanel1).
        buffer = (BufferedImage) jPanel1.createImage(jPanel1.getWidth(), jPanel1.getHeight());
        //3º Hago que se pueda pintar en el folio
        buffer.createGraphics();
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        //4º Pinto el folio de blanco con el tamaño del buffer
        g2.setColor(Color.white);
        g2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
    
        jLabel2.setBackground(colorElegido);
    }
    
//Aquí hago todos los métodos
    
    
    //Este método chequea el punto en el que vaya a pinchar
    private boolean chequeaPunto(int x, int y){
        boolean contiene = false;
        for (int i = 0; i < listaFormas.size(); i++) {
            if (((Shape) listaFormas.get(i)).contains(x,y)){
                //si en algun momento el contains devuelve true
                //es porque el punto que he pasado está en una forma
                //de las que tengo guardadas en el arraylist
                contiene = true;
            }
        }
        return contiene;
    }

    //Éste método (paint) hace que se vean las imágenes en la pantalla pero como es predefinido, o sea que ya lo crearon hace mucho
    // y es el método tal cual entonces, para tocarlo pongo un @Override. Ahora ya está listo para que pueda modificarlo,
    // añadir nuevo código.
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //Empiezo a dibujar en un lado
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        //Dibujo el folio con el tamaño del jPanel
        g2.setColor(Color.white);
        g2.fillRect(0, 0, jPanel1.getWidth(), jPanel1.getHeight());
        //Dibujo todos los elementos del array menores que el indice
        for (int i = 0; i < listaFormas.size(); i++) {
            
            //Los if's me crean la forma que quiero que se dibuje
            
            if (listaFormas.get(i) instanceof Circulo){
            ((Circulo) listaFormas.get(i)).pintaYcolorea(g2);
            }
            if (listaFormas.get(i) instanceof Triangulo){
            ((Triangulo) listaFormas.get(i)).pintaYcolorea(g2);
            
            }
            if (listaFormas.get(i) instanceof Rombo){
            ((Rombo) listaFormas.get(i)).pintaYcolorea(g2);
            
            }
            if (listaFormas.get(i) instanceof Cruz){
            ((Cruz) listaFormas.get(i)).pintaYcolorea(g2);
            
            }
            if (listaFormas.get(i) instanceof Estrella){
            ((Estrella) listaFormas.get(i)).pintaYcolorea(g2);
            }
            
            if (listaFormas.get(i) instanceof Pentagono){
            ((Pentagono) listaFormas.get(i)).pintaYcolorea(g2);
            }
            
            if (listaFormas.get(i) instanceof Cuadrado){
            ((Cuadrado) listaFormas.get(i)).pintaYcolorea(g2);
            }
            
            if (listaFormas.get(i) instanceof Rectangulo){
            ((Rectangulo) listaFormas.get(i)).pintaYcolorea(g2);
            }
            
            if (listaFormas.get(i) instanceof Ovalo){
            ((Ovalo) listaFormas.get(i)).pintaYcolorea(g2);
            }
            
            if (listaFormas.get(i) instanceof Raya){
            ((Raya) listaFormas.get(i)).pintaYcolorea(g2);
            }
            
            if (listaFormas.get(i) instanceof Spray){
            ((Spray) listaFormas.get(i)).pintaYcolorea(g2);
            }
        }
        //Con esto digo que se dibuje en el folio
        g2 = (Graphics2D) jPanel1.getGraphics();
        g2.drawImage(buffer, 0, 0, jPanel1.getWidth(), jPanel1.getHeight(), null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jSlider1 = new javax.swing.JSlider();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jButton9.setText("Aceptar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton9MousePressed(evt);
            }
        });

        jButton10.setText("Cancelar");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton10MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jButton9)
                .addGap(114, 114, 114)
                .addComponent(jButton10))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 623, Short.MAX_VALUE)
            .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 397, Short.MAX_VALUE)
            .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDialog2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jFileChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 550, 480));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png"))); // NOI18N
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 40, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cruz.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton2MousePressed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 40, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrella.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton3MousePressed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 40, 40));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rombo.png"))); // NOI18N
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton4MousePressed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 40, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/triangulo.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton5MousePressed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 40, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Equis_roja.png"))); // NOI18N
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton6MousePressed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 70, 70));

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha1.png"))); // NOI18N
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton7MousePressed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 70, 70));

        jSlider1.setMinimumSize(new java.awt.Dimension(5, 5));
        jSlider1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jSlider1MouseDragged(evt);
            }
        });
        jSlider1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jSlider1MousePressed(evt);
            }
        });
        getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 128, 14));

        jLabel1.setText("50");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 460, -1, -1));

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulocromatico1.png"))); // NOI18N
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton8MousePressed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 70, 70));

        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borra.png"))); // NOI18N
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton11MousePressed(evt);
            }
        });
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 70, 70));

        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pentagono.png"))); // NOI18N
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton12MousePressed(evt);
            }
        });
        getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 40, 40));

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton13MousePressed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 60, 40));

        jCheckBox1.setText("Sin relleno");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCheckBox1MousePressed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadrado.png"))); // NOI18N
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton14MousePressed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 40, 40));

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectangulo.png"))); // NOI18N
        jButton15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton15MousePressed(evt);
            }
        });
        getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 40, 40));

        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ovalo.png"))); // NOI18N
        jButton17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton17MousePressed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 40, 40));

        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/raya.png"))); // NOI18N
        jButton16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton16MousePressed(evt);
            }
        });
        getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 60, 40));

        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/spray3.png"))); // NOI18N
        jButton18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton18MousePressed(evt);
            }
        });
        getContentPane().add(jButton18, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 70, 70));

        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 260, 30, 30));

        jLabel3.setText("Color en uso:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, -1, -1));

        jMenu1.setText("Archivo");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Abrir...");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Guardar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Este método consigue que se pinten las formas en el folio
    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        
        //VARIABLES para la posición de las formas en el Dragged
        posX = evt.getX();
        posY = evt.getY();
        
        switch (forma){
            case 0: listaFormas.add(new Circulo (evt.getX(), evt.getY(), jSlider1.getValue(), colorElegido, sinRelleno)); break;
            case 1: listaFormas.add( new Triangulo (evt.getX(), evt.getY(), jSlider1.getValue(), colorElegido, sinRelleno)); break;
            case 2: listaFormas.add( new Rombo (evt.getX(), evt.getY(), jSlider1.getValue(), jSlider1.getValue(), colorElegido, sinRelleno)); break;
            case 3: listaFormas.add( new Cruz (evt.getX(), evt.getY(), jSlider1.getValue(), colorElegido, sinRelleno)); break;
            case 4: listaFormas.add( new Estrella (evt.getX(), evt.getY(), jSlider1.getValue(), colorElegido, sinRelleno)); break;
            case 5: listaFormas.add( new Pentagono (evt.getX(), evt.getY(), jSlider1.getValue(), colorElegido, sinRelleno)); break;
            case 8: listaFormas.add( new Cuadrado (evt.getX(), evt.getY(), jSlider1.getValue(), colorElegido, sinRelleno)); break;
            case 9: listaFormas.add( new Rectangulo (evt.getX(), evt.getY(), jSlider1.getValue(), colorElegido, sinRelleno)); break;
            case 10: listaFormas.add( new Raya (evt.getX(), evt.getY(), 1, colorElegido)); break;
            case 11: listaFormas.add( new Ovalo (evt.getX(), evt.getY(), jSlider1.getValue(), colorElegido, sinRelleno)); break;
            case 12: {
                listaFormas.add( new Spray (evt.getX(), evt.getY(), 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+4, evt.getY()+5, 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+1, evt.getY()+2, 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+2, evt.getY()+8, 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+9, evt.getY()+4, 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+2, evt.getY()+10, 1, colorElegido, true));
                
            } break;
        }
            repaint();
    }//GEN-LAST:event_jPanel1MousePressed

    //Este método extiende la forma al tamaño que quieras al instante
    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        switch (forma){
            //Expando el circulo
            case 0:{
                //leo el ultimo elemento de la lista. Sé que se añadió
                // en el mousePressed
                //a la clase Circulo la llamo aux
                Circulo aux = (Circulo) listaFormas.get(listaFormas.size() -1);
                //variable radio = el radio será cuando pinche con el ratón para arrastrar - la X del circulo, es decir,
                // cuando pincho es el punto 1, x ej, y según voy arrastrando màs grande es el evt.getX entonces la diferencia
                // entre el pinchazo inicial y donde suelte será el radio del circulo.
                int radio = (int)(evt.getX() - aux.x);
                aux.width = radio;
                aux.height = radio;
            } break;
            //Expando el triangulo
            case 1:{
                Triangulo aux = (Triangulo) listaFormas.get(listaFormas.size() -1);
                
                aux.xpoints[0] = posX ;
                aux.ypoints[0] = posY ;
                
                aux.xpoints[1] = posX + (evt.getX() - posX);
                aux.ypoints[1] = posY + (evt.getY() - posY);
                
                aux.xpoints[2] = posX - (evt.getX() - posX);
                aux.ypoints[2] = posY + (evt.getY() - posY);
            } break;
            
            case 2:{
            Rombo aux = (Rombo) listaFormas.get(listaFormas.size() -1);
            
                aux.xpoints[0] = posX ;
                aux.ypoints[0] = posY ;
                
                aux.xpoints[1] = posX + (evt.getX() - posX)/2;
                aux.ypoints[1] = posY + (evt.getY() - posY)/2;
                
                aux.xpoints[2] = posX;
                aux.ypoints[2] = posY + (evt.getY()-posY);
                
                aux.xpoints[3] = posX - (evt.getX() - posX)/2;
                aux.ypoints[3] = posY + (evt.getY() - posY)/2;
            } break;
            
            case 3:{
            Cruz aux = (Cruz) listaFormas.get(listaFormas.size() -1);
            
            aux.xpoints[0] = posX;
            aux.ypoints[0] = posY;
            aux.xpoints[1] = posX + (evt.getX() - posX);
            aux.ypoints[1] = posY;
            aux.xpoints[2] = posX + (evt.getX() - posX);
            aux.ypoints[2] = posY - (evt.getY() - posY);
            aux.xpoints[3] = posX + (evt.getX() - posX)*2;
            aux.ypoints[3] = posY - (evt.getY() - posY);
            aux.xpoints[4] = posX + (evt.getX() - posX)*2;
            aux.ypoints[4] = posY;
            aux.xpoints[5] = posX + (evt.getX() - posX)*3;
            aux.ypoints[5] = posY;
            aux.xpoints[6] = posX + (evt.getX() - posX)*3;
            aux.ypoints[6] = posY + (evt.getY() - posY);
            aux.xpoints[7] = posX + (evt.getX() - posX)*2;
            aux.ypoints[7] = posY + (evt.getY() - posY);
            aux.xpoints[8] = posX + (evt.getX() - posX)*2;
            aux.ypoints[8] = posY + (evt.getY() - posY)*2;
            aux.xpoints[9] = posX + (evt.getX() - posX);
            aux.ypoints[9] = posY + (evt.getY() - posY)*2;
            aux.xpoints[10] = posX + (evt.getX() - posX);
            aux.ypoints[10] = posY + (evt.getY() - posY);
            aux.xpoints[11] = posX;
            aux.ypoints[11] = posY + (evt.getY() - posY);

            } break;
            
            case 4:{
            Estrella aux = (Estrella) listaFormas.get(listaFormas.size() -1);
            
            aux.xpoints[0] = (int)(posX + (evt.getX()-posX)* Math.cos(0 * 2 * Math.PI / 5) ) ;
            aux.ypoints[0] = (int)(posY+(evt.getY()-posY)* Math.sin(0 * 2 * Math.PI / 5));
            aux.xpoints[1] = (int)(posX+ (evt.getX()-posX)* Math.cos(2 * 2 * Math.PI / 5));
            aux.ypoints[1] = (int)(posY+(evt.getY()-posY)* Math.sin(2 * 2 * Math.PI / 5));
            aux.xpoints[2] = (int)(posX+ (evt.getX()-posX)* Math.cos(4 * 2 * Math.PI / 5));
            aux.ypoints[2] = (int)(posY+(evt.getY()-posY)* Math.sin(4 * 2 * Math.PI / 5));
            aux.xpoints[3] = (int)(posX+ (evt.getX()-posX)* Math.cos(1 * 2 * Math.PI / 5));
            aux.ypoints[3] = (int)(posY+(evt.getY()-posY)* Math.sin(1 * 2 * Math.PI / 5));
            aux.xpoints[4] = (int)(posX+ (evt.getX()-posX)* Math.cos(3 * 2 * Math.PI / 5));
            aux.ypoints[4] = (int)(posY+(evt.getY()-posY)* Math.sin(3 * 2 * Math.PI / 5));
            
            } break;
            
            case 5 : {
            Pentagono aux = (Pentagono) listaFormas.get(listaFormas.size() -1);
            
            aux.xpoints[0]=(int)(posX + (evt.getX()-posX) * Math.cos(0 * 2 * Math.PI / 5));
            aux.ypoints[0]= (int) (posY + (evt.getY()-posY) * Math.sin(0 * 2 * Math.PI / 5));
            
            aux.xpoints[1]=(int)(posX + (evt.getX()-posX) * Math.cos(1 * 2 * Math.PI / 5));
            aux.ypoints[1]= (int) (posY + (evt.getY()-posY) * Math.sin(1 * 2 * Math.PI / 5)); 
            
            aux.xpoints[2]=(int)(posX + (evt.getX()-posX) * Math.cos(2 * 2 * Math.PI / 5));
            aux.ypoints[2]= (int) (posY + (evt.getY()-posY) * Math.sin(2 * 2 * Math.PI / 5)); 
            
            aux.xpoints[3]=(int)(posX + (evt.getX()-posX) * Math.cos(3 * 2 * Math.PI / 5));
            aux.ypoints[3]= (int) (posY + (evt.getY()-posY) * Math.sin(3 * 2 * Math.PI / 5)); 
            
            aux.xpoints[4]=(int)(posX + (evt.getX()-posX) * Math.cos(4 * 2 * Math.PI / 5));
            aux.ypoints[4]= (int) (posY + (evt.getY()-posY) * Math.sin(4 * 2 * Math.PI / 5)); 
            } 
            break;
            //caso para el borrador
            case 6 : {listaFormas.add( new Circulo (evt.getX(), evt.getY(), jSlider1.getValue(), Color.WHITE, true)); break;}
            //caso para el lapiz
            case 7: {listaFormas.add( new Circulo (evt.getX(), evt.getY(), jSlider1.getValue(), colorElegido, true)); break;}
            //caso para el cuadrado
            case 8: {
            Cuadrado aux = (Cuadrado) listaFormas.get(listaFormas.size() -1);
            
            aux.xpoints[0] = posX;
            aux.ypoints[0] = posY ;
            
            aux.xpoints[1] = posX + (evt.getX() - posX);
            aux.ypoints[1] = posY ;
            
            aux.xpoints[2] = posX + (evt.getX() - posX);
            aux.ypoints[2] = posY + (evt.getX() - posX);
            
            aux.xpoints[3] = posX ;
            aux.ypoints[3] = posY + (evt.getX() - posX);
            }
            break;
            
            case 9 : {
            Rectangulo aux = (Rectangulo) listaFormas.get(listaFormas.size() -1);
            
            aux.xpoints[0] = posX;
            aux.ypoints[0] = posY ;
            
            aux.xpoints[1] = posX + (evt.getX() - posX)*2;
            aux.ypoints[1] = posY ;
            
            aux.xpoints[2] = posX + (evt.getX() - posX)*2;
            aux.ypoints[2] = posY + (evt.getX() - posX);
            
            aux.xpoints[3] = posX ;
            aux.ypoints[3] = posY + (evt.getX() - posX);
            
            }
            break;
            
            case 10 : {
            Raya aux = (Raya) listaFormas.get(listaFormas.size() -1);
            
            aux.xpoints[0] = posX;
            aux.ypoints[0] = posY;
            aux.xpoints[1] = posX + (evt.getX() - posX);
            aux.ypoints[1] = posY + (evt.getY() - posY);
            }
            break;
            
            case 11: {
            Ovalo aux = (Ovalo) listaFormas.get(listaFormas.size() -1);
                
                int radio = (int)(evt.getX() - aux.x);
                aux.width = radio/2;
                aux.height = radio;
            }
            break;
            
            case 12: {
                listaFormas.add( new Spray (evt.getX(), evt.getY(), 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+2, evt.getY()+5, 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+8, evt.getY()+2, 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+20, evt.getY()+8, 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+1, evt.getY()+4, 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+5, evt.getY()+10, 1, colorElegido, true));
                
            } break;  
        }
        repaint();
    }//GEN-LAST:event_jPanel1MouseDragged

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        forma = 0;
    }//GEN-LAST:event_jButton1MousePressed

    private void jButton2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MousePressed
        forma = 3;
    }//GEN-LAST:event_jButton2MousePressed

    private void jButton3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MousePressed
        forma = 4;
    }//GEN-LAST:event_jButton3MousePressed

    private void jButton4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MousePressed
        forma = 2;
    }//GEN-LAST:event_jButton4MousePressed

    private void jButton5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MousePressed
        forma = 1;
    }//GEN-LAST:event_jButton5MousePressed

    private void jButton7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MousePressed
        if (listaFormas.size() > 0) {
            listaFormas.remove(listaFormas.size()-1);
            repaint();
        }
    }//GEN-LAST:event_jButton7MousePressed

    private void jButton6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MousePressed
        listaFormas.clear();
        repaint();
    }//GEN-LAST:event_jButton6MousePressed

    private void jSlider1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MousePressed
        jLabel1.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1MousePressed

    private void jButton8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MousePressed
        //tamaño del dialogo
        jDialog1.setSize(620, 420);
        //para que lo muestre
        jDialog1.setVisible(true);
    }//GEN-LAST:event_jButton8MousePressed

    private void jButton9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MousePressed
        colorElegido = jColorChooser1.getColor();
        jDialog1.setVisible(false);
        //color cuadradito pequeñito
        jLabel2.setBackground(colorElegido);
    }//GEN-LAST:event_jButton9MousePressed

    private void jButton10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MousePressed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_jButton10MousePressed

    private void jSlider1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSlider1MouseDragged
         jLabel1.setText(String.valueOf(jSlider1.getValue()));
    }//GEN-LAST:event_jSlider1MouseDragged

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jFileChooser1.setFileFilter(new FileNameExtensionFilter(".jpg", "jpg"));
        jFileChooser1.setFileFilter(new FileNameExtensionFilter(".png", "png"));
        int seleccion = jFileChooser1.showOpenDialog(this);
        
        switch (seleccion){
            case JFileChooser.APPROVE_OPTION : {
                File fichero = jFileChooser1.getSelectedFile();
                String nombre = fichero.getName();
                String extension = nombre.substring(nombre.lastIndexOf('.')+1, nombre.length());
                
                if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")){
            try {
                buffer = ImageIO.read(fichero);
                repaint();
                        } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            } break;
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jFileChooser1.setFileFilter(new FileNameExtensionFilter(".jpg", "jpg"));
        jFileChooser1.setFileFilter(new FileNameExtensionFilter(".png", "png"));
        int seleccion = jFileChooser1.showSaveDialog(this);
        
        switch (seleccion){
            case JFileChooser.APPROVE_OPTION : {
                File fichero = jFileChooser1.getSelectedFile();
                String nombre = fichero.getName();
                String extension = nombre.substring(nombre.lastIndexOf('.')+1, nombre.length());
                
                if (extension.equalsIgnoreCase("jpg") || extension.equalsIgnoreCase("png")){
            try {
                ImageIO.write(buffer, "jpg", fichero);
                        } catch (IOException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
                }
            } break;
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MousePressed
       forma = 6;
    }//GEN-LAST:event_jButton11MousePressed

    private void jButton12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MousePressed
        forma = 5;
    }//GEN-LAST:event_jButton12MousePressed

    private void jButton13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MousePressed
        forma = 7;
    }//GEN-LAST:event_jButton13MousePressed

    private void jButton14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MousePressed
        forma = 8;
    }//GEN-LAST:event_jButton14MousePressed

    private void jButton15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton15MousePressed
        forma = 9;
    }//GEN-LAST:event_jButton15MousePressed

    private void jButton16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton16MousePressed
        forma = 10;
    }//GEN-LAST:event_jButton16MousePressed

    private void jButton17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton17MousePressed
        forma = 11;
    }//GEN-LAST:event_jButton17MousePressed

    private void jButton18MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton18MousePressed
        forma = 12;
    }//GEN-LAST:event_jButton18MousePressed

    private void jCheckBox1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckBox1MousePressed
        if (jCheckBox1.isSelected()){
            sinRelleno = true;
        }
        else {
            sinRelleno = false;
        }
    }//GEN-LAST:event_jCheckBox1MousePressed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSlider jSlider1;
    // End of variables declaration//GEN-END:variables
}
