
/*
Esta clase es la principal del Paint, tiene clases externas con las formas 
a las que las llamo aquí.
Este paint dibuja cuadrados, rectangulos, rombos, cruces, estrellas, pentagonos,
triangulos, circulos y ovalos. Las unicas regulares son el cuadrado y el rectangulo.
Con regulares me refiero a que cuando lo amplias, en el dragged, se amplia pero con 
la forma que tiene, sin deformarse. 
Todas estas figuras por defecto van con relleno, incorpora la opción de ponerlas sin relleno. 
También tiene una barra para seleccionar el tamaño.
Cuenta con un borrador, que se puede hacer grande y pequeño. Un selector de color, un lapiz,
una raya a la que solo se le puede modificar la longitud, no su grosor. También un spray.
Tiene botones para deshacer paso a paso y para eliminar todo el dibujo.
Además cuenta con un marco en el que te indica el color que estás usando.
Como complemento puedes guardar el dibujo y abrir uno con el unico que fallo que abrir tiene 
un poco de fallo jeje.
*/


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
    //En este caso me aparecerá el circulo por defecto, nada más abrir el paint, ya que le he indicado el 0 
    // que corresponde al circulo.
    int forma = 0;
    //VARIABLE para almacenar el color. El color por defecto será el negro.
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
        buffer = (BufferedImage) folio.createImage(folio.getWidth(), folio.getHeight());
        //3º Hago que se pueda pintar en el folio
        buffer.createGraphics();
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        //4º Pinto el folio de blanco con el tamaño del buffer
        g2.setColor(Color.white);
        g2.fillRect(0, 0, folio.getWidth(), folio.getHeight());
        
        
        //Con esto hago que me muestre el color que estoy usando (Color en uso :)
        muestraColorcito.setBackground(colorElegido);
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

    //Éste método (paint) hace que se vean las imágenes en la pantalla pero como es predefinido, o sea que ya lo crearon
    // hace mucho y es el método tal cual entonces, para tocarlo pongo un @Override. Ahora ya está listo para que 
    // pueda modificarlo, añadir nuevo código.
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //Empiezo a dibujar en un lado
        Graphics2D g2 = (Graphics2D) buffer.getGraphics();
        //Dibujo el folio con el tamaño del jPanel
        g2.setColor(Color.white);
        g2.fillRect(0, 0, folio.getWidth(), folio.getHeight());
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
        g2 = (Graphics2D) folio.getGraphics();
        g2.drawImage(buffer, 0, 0, folio.getWidth(), folio.getHeight(), null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jColorChooser1 = new javax.swing.JColorChooser();
        aceptar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jFileChooser1 = new javax.swing.JFileChooser();
        folio = new javax.swing.JPanel();
        circulito = new javax.swing.JButton();
        crucecita = new javax.swing.JButton();
        estrellita = new javax.swing.JButton();
        rombito = new javax.swing.JButton();
        triangulito = new javax.swing.JButton();
        eliminarTodo = new javax.swing.JButton();
        deshacer = new javax.swing.JButton();
        tamaño = new javax.swing.JSlider();
        marcadorTamaño = new javax.swing.JLabel();
        colorcito = new javax.swing.JButton();
        borradorcito = new javax.swing.JButton();
        pentagonito = new javax.swing.JButton();
        lapicerito = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        cuadradito = new javax.swing.JButton();
        rectangulito = new javax.swing.JButton();
        ovalito = new javax.swing.JButton();
        rayita = new javax.swing.JButton();
        spraycito = new javax.swing.JButton();
        muestraColorcito = new javax.swing.JLabel();
        colorEnUso = new javax.swing.JLabel();
        marcoMuestraColorcito = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        aceptar.setText("Aceptar");
        aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aceptarMousePressed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(aceptar)
                .addGap(114, 114, 114)
                .addComponent(cancelar))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addComponent(jColorChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aceptar)
                    .addComponent(cancelar))
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

        folio.setBackground(new java.awt.Color(255, 255, 255));
        folio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                folioMouseDragged(evt);
            }
        });
        folio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                folioMousePressed(evt);
            }
        });

        javax.swing.GroupLayout folioLayout = new javax.swing.GroupLayout(folio);
        folio.setLayout(folioLayout);
        folioLayout.setHorizontalGroup(
            folioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        folioLayout.setVerticalGroup(
            folioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        getContentPane().add(folio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 550, 480));

        circulito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulo.png"))); // NOI18N
        circulito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                circulitoMousePressed(evt);
            }
        });
        getContentPane().add(circulito, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 40, 40));

        crucecita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cruz.png"))); // NOI18N
        crucecita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                crucecitaMousePressed(evt);
            }
        });
        getContentPane().add(crucecita, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 40, 40));

        estrellita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estrella.png"))); // NOI18N
        estrellita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                estrellitaMousePressed(evt);
            }
        });
        getContentPane().add(estrellita, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 340, 40, 40));

        rombito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rombo.png"))); // NOI18N
        rombito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rombitoMousePressed(evt);
            }
        });
        getContentPane().add(rombito, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 40, 40));

        triangulito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/triangulo.png"))); // NOI18N
        triangulito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                triangulitoMousePressed(evt);
            }
        });
        getContentPane().add(triangulito, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 40, 40));

        eliminarTodo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Equis_roja.png"))); // NOI18N
        eliminarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                eliminarTodoMousePressed(evt);
            }
        });
        getContentPane().add(eliminarTodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 70, 70));

        deshacer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flecha1.png"))); // NOI18N
        deshacer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                deshacerMousePressed(evt);
            }
        });
        getContentPane().add(deshacer, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 140, 70, 70));

        tamaño.setMinimumSize(new java.awt.Dimension(5, 5));
        tamaño.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                tamañoMouseDragged(evt);
            }
        });
        tamaño.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tamañoMousePressed(evt);
            }
        });
        getContentPane().add(tamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 128, 14));

        marcadorTamaño.setText("50");
        getContentPane().add(marcadorTamaño, new org.netbeans.lib.awtextra.AbsoluteConstraints(648, 460, -1, -1));

        colorcito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/circulocromatico1.png"))); // NOI18N
        colorcito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                colorcitoMousePressed(evt);
            }
        });
        getContentPane().add(colorcito, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, 70, 70));

        borradorcito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/borra.png"))); // NOI18N
        borradorcito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                borradorcitoMousePressed(evt);
            }
        });
        getContentPane().add(borradorcito, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 70, 70, 70));

        pentagonito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pentagono.png"))); // NOI18N
        pentagonito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pentagonitoMousePressed(evt);
            }
        });
        getContentPane().add(pentagonito, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 40, 40));

        lapicerito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lapiz.png"))); // NOI18N
        lapicerito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lapiceritoMousePressed(evt);
            }
        });
        getContentPane().add(lapicerito, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 60, 40));

        jCheckBox1.setText("Sin relleno");
        jCheckBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jCheckBox1MousePressed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        cuadradito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cuadrado.png"))); // NOI18N
        cuadradito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cuadraditoMousePressed(evt);
            }
        });
        getContentPane().add(cuadradito, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, 40, 40));

        rectangulito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rectangulo.png"))); // NOI18N
        rectangulito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rectangulitoMousePressed(evt);
            }
        });
        getContentPane().add(rectangulito, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 40, 40));

        ovalito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ovalo.png"))); // NOI18N
        ovalito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ovalitoMousePressed(evt);
            }
        });
        getContentPane().add(ovalito, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 380, 40, 40));

        rayita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/raya.png"))); // NOI18N
        rayita.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                rayitaMousePressed(evt);
            }
        });
        getContentPane().add(rayita, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 60, 40));

        spraycito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/spray3.png"))); // NOI18N
        spraycito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                spraycitoMousePressed(evt);
            }
        });
        getContentPane().add(spraycito, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 70, 70));

        muestraColorcito.setOpaque(true);
        getContentPane().add(muestraColorcito, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 260, 30, 30));

        colorEnUso.setText("Color en uso:");
        getContentPane().add(colorEnUso, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, -1, -1));

        javax.swing.GroupLayout marcoMuestraColorcitoLayout = new javax.swing.GroupLayout(marcoMuestraColorcito);
        marcoMuestraColorcito.setLayout(marcoMuestraColorcitoLayout);
        marcoMuestraColorcitoLayout.setHorizontalGroup(
            marcoMuestraColorcitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );
        marcoMuestraColorcitoLayout.setVerticalGroup(
            marcoMuestraColorcitoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        getContentPane().add(marcoMuestraColorcito, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 253, 43, 43));

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

        menu.add(jMenu1);

        jMenu2.setText("Edit");
        menu.add(jMenu2);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Este método consigue que se pinten las formas en el folio
    private void folioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_folioMousePressed
        
        //VARIABLES para la posición de las formas en el Dragged
        posX = evt.getX();
        posY = evt.getY();
        
        switch (forma){
            //cada forma tiene el movimiento del raton en la posicion X e Y, el tamaño lo da el 'tamaño.getValue();',
            // el color que quiero para cada forma el 'colorElegido' 
            // y para que pueda elegir si va con relleno o no el 'sinRelleno'.
            case 0: listaFormas.add( new Circulo (evt.getX(), evt.getY(), tamaño.getValue(), colorElegido, sinRelleno)); break;
            case 1: listaFormas.add( new Triangulo (evt.getX(), evt.getY(), tamaño.getValue(), colorElegido, sinRelleno)); break;
            case 2: listaFormas.add( new Rombo (evt.getX(), evt.getY(), tamaño.getValue(), tamaño.getValue(), colorElegido, sinRelleno)); break;
            case 3: listaFormas.add( new Cruz (evt.getX(), evt.getY(), tamaño.getValue(), colorElegido, sinRelleno)); break;
            case 4: listaFormas.add( new Estrella (evt.getX(), evt.getY(), tamaño.getValue(), colorElegido, sinRelleno)); break;
            case 5: listaFormas.add( new Pentagono (evt.getX(), evt.getY(), tamaño.getValue(), colorElegido, sinRelleno)); break;
            case 8: listaFormas.add( new Cuadrado (evt.getX(), evt.getY(), tamaño.getValue(), colorElegido, sinRelleno)); break;
            case 9: listaFormas.add( new Rectangulo (evt.getX(), evt.getY(), tamaño.getValue(), colorElegido, sinRelleno)); break;
            //en el caso de la raya como no quiero que se elija su grosor, para obtener el aspecto de una raya 
            //le he dado como tamaño predefinido el 1.
            case 10: listaFormas.add( new Raya (evt.getX(), evt.getY(), 1, colorElegido)); break;
            case 11: listaFormas.add( new Ovalo (evt.getX(), evt.getY(), tamaño.getValue(), colorElegido, sinRelleno)); break;
            //el caso del Spray, al ser un circulo muy pequeño para obtener el aspecto de un spray le he dado varios puntos.
            //solo he jugado con las coordenadas, son al azar.
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
    }//GEN-LAST:event_folioMousePressed

    //Este método extiende la forma al tamaño que quieras al instante
    private void folioMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_folioMouseDragged
        switch (forma){
            //Expando el circulo
            case 0:{
                //leo el ultimo elemento de la lista. Sé que se añadió en el mousePressed.
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
            
            
            //Expando el Rombo
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
            
            
            //Expando la cruz
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
            
            
            //Expando la estrella
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
            
            
            //Expando el pentagono
            case 5 : {
            Pentagono aux = (Pentagono) listaFormas.get(listaFormas.size() -1);
            
            aux.xpoints[0]=(int)(posX + (evt.getX()-posX) * Math.cos(0 * 2 * Math.PI / 5));
            aux.ypoints[0]=(int) (posY + (evt.getY()-posY) * Math.sin(0 * 2 * Math.PI / 5));
            
            aux.xpoints[1]=(int)(posX + (evt.getX()-posX) * Math.cos(1 * 2 * Math.PI / 5));
            aux.ypoints[1]=(int) (posY + (evt.getY()-posY) * Math.sin(1 * 2 * Math.PI / 5)); 
            
            aux.xpoints[2]=(int)(posX + (evt.getX()-posX) * Math.cos(2 * 2 * Math.PI / 5));
            aux.ypoints[2]=(int) (posY + (evt.getY()-posY) * Math.sin(2 * 2 * Math.PI / 5)); 
            
            aux.xpoints[3]=(int)(posX + (evt.getX()-posX) * Math.cos(3 * 2 * Math.PI / 5));
            aux.ypoints[3]=(int) (posY + (evt.getY()-posY) * Math.sin(3 * 2 * Math.PI / 5)); 
            
            aux.xpoints[4]=(int)(posX + (evt.getX()-posX) * Math.cos(4 * 2 * Math.PI / 5));
            aux.ypoints[4]=(int) (posY + (evt.getY()-posY) * Math.sin(4 * 2 * Math.PI / 5)); 
            }break;
            
            //Caso para el borrador. El caso es el mismo que el circulo pero para que parezca un borrador le he cambiado
            // el color a blanco y con relleno sin opción a cambiarlo.
            case 6 : {listaFormas.add( new Circulo (evt.getX(), evt.getY(), tamaño.getValue(),Color.WHITE, true)); break;}
            
            //Caso para el lapiz
            case 7: {listaFormas.add( new Circulo (evt.getX(), evt.getY(), tamaño.getValue(), colorElegido, true)); break;}
            
            //Expando el cuadrado
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
            }break;
            
            
            //Expando el rectangulo
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
            
            }break;
            
            
            //Expando la raya
            case 10 : {
            Raya aux = (Raya) listaFormas.get(listaFormas.size() -1);
            
            aux.xpoints[0] = posX;
            aux.ypoints[0] = posY;
            
            aux.xpoints[1] = posX + (evt.getX() - posX);
            aux.ypoints[1] = posY + (evt.getY() - posY);
            }break;
            
            
            //Expando el ovalo
            case 11: {
            Ovalo aux = (Ovalo) listaFormas.get(listaFormas.size() -1);
                
                int radio = (int)(evt.getX() - aux.x);
                aux.width = radio/2;
                aux.height = radio;
            }break;
            
            
            //Caso para el spray. No le doy puntos porque son muchos circulos pequeñitos
            // colocados en diferente posicion (evt.getX()+8, evt.getY()+4...)
            //El 1 es el tamaño del circulo para que parezca un spray.
            case 12: {
                listaFormas.add( new Spray (evt.getX(), evt.getY(), 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+2, evt.getY()+5, 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+8, evt.getY()+2, 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+20, evt.getY()+8, 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+1, evt.getY()+4, 1, colorElegido, true));
                listaFormas.add( new Spray (evt.getX()+5, evt.getY()+10, 1, colorElegido, true));
                
            } break;  
        }
        //Este repaint con los 1 quita la epilepsia. Obra maestra de Alejandro Dieta.
        repaint(1,1,1,1);
    }//GEN-LAST:event_folioMouseDragged
        //circulo
    private void circulitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_circulitoMousePressed
        forma = 0;
    }//GEN-LAST:event_circulitoMousePressed
        //cruz
    private void crucecitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crucecitaMousePressed
        forma = 3;
    }//GEN-LAST:event_crucecitaMousePressed
        //estrella
    private void estrellitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estrellitaMousePressed
        forma = 4;
    }//GEN-LAST:event_estrellitaMousePressed
        //rombo
    private void rombitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rombitoMousePressed
        forma = 2;
    }//GEN-LAST:event_rombitoMousePressed
        //triangulo
    private void triangulitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_triangulitoMousePressed
        forma = 1;
    }//GEN-LAST:event_triangulitoMousePressed
        //deshacer
    private void deshacerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deshacerMousePressed
        if (listaFormas.size() > 0) {
            listaFormas.remove(listaFormas.size()-1);
            repaint();
        }
    }//GEN-LAST:event_deshacerMousePressed
        //X --> elimina todo
    private void eliminarTodoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarTodoMousePressed
        listaFormas.clear();
        repaint();
    }//GEN-LAST:event_eliminarTodoMousePressed
        //jSlider1
    private void tamañoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tamañoMousePressed
        marcadorTamaño.setText(String.valueOf(tamaño.getValue()));
    }//GEN-LAST:event_tamañoMousePressed
        //jDialog1 --> color
    private void colorcitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colorcitoMousePressed
        //tamaño del dialogo
        jDialog1.setSize(620, 420);
        //para que lo muestre
        jDialog1.setVisible(true);
    }//GEN-LAST:event_colorcitoMousePressed
        //aceptar
    private void aceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMousePressed
        colorElegido = jColorChooser1.getColor();
        jDialog1.setVisible(false);
        //color del cuadradito pequeñito. Con esto hago que me muestre que color estoy utilizando.
        muestraColorcito.setBackground(colorElegido);
    }//GEN-LAST:event_aceptarMousePressed
        //cancelar
    private void cancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMousePressed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_cancelarMousePressed
        //jSlider1
    private void tamañoMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tamañoMouseDragged
         marcadorTamaño.setText(String.valueOf(tamaño.getValue()));
    }//GEN-LAST:event_tamañoMouseDragged
        //botón de abrir
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
        //botón de guardar
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
        //borrador
    private void borradorcitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_borradorcitoMousePressed
       forma = 6;
    }//GEN-LAST:event_borradorcitoMousePressed
        //pentagono
    private void pentagonitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pentagonitoMousePressed
        forma = 5;
    }//GEN-LAST:event_pentagonitoMousePressed
        //lapiz
    private void lapiceritoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lapiceritoMousePressed
        forma = 7;
    }//GEN-LAST:event_lapiceritoMousePressed
        //cuadrado
    private void cuadraditoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cuadraditoMousePressed
        forma = 8;
    }//GEN-LAST:event_cuadraditoMousePressed
        //rectangulo
    private void rectangulitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rectangulitoMousePressed
        forma = 9;
    }//GEN-LAST:event_rectangulitoMousePressed
        //raya
    private void rayitaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rayitaMousePressed
        forma = 10;
    }//GEN-LAST:event_rayitaMousePressed
        //ovalo
    private void ovalitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ovalitoMousePressed
        forma = 11;
    }//GEN-LAST:event_ovalitoMousePressed
        //spray
    private void spraycitoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_spraycitoMousePressed
        forma = 12;
    }//GEN-LAST:event_spraycitoMousePressed
        //relleno
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
    private javax.swing.JButton aceptar;
    private javax.swing.JButton borradorcito;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton circulito;
    private javax.swing.JLabel colorEnUso;
    private javax.swing.JButton colorcito;
    private javax.swing.JButton crucecita;
    private javax.swing.JButton cuadradito;
    private javax.swing.JButton deshacer;
    private javax.swing.JButton eliminarTodo;
    private javax.swing.JButton estrellita;
    private javax.swing.JPanel folio;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JButton lapicerito;
    private javax.swing.JLabel marcadorTamaño;
    private javax.swing.JPanel marcoMuestraColorcito;
    private javax.swing.JMenuBar menu;
    private javax.swing.JLabel muestraColorcito;
    private javax.swing.JButton ovalito;
    private javax.swing.JButton pentagonito;
    private javax.swing.JButton rayita;
    private javax.swing.JButton rectangulito;
    private javax.swing.JButton rombito;
    private javax.swing.JButton spraycito;
    private javax.swing.JSlider tamaño;
    private javax.swing.JButton triangulito;
    // End of variables declaration//GEN-END:variables
}
