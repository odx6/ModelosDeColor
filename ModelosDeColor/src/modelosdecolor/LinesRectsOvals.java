/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosdecolor;

/**
 *
 * @author ever
 */
// Fig. 12.14: LinesRectsOvals.java
// Drawing lines, rectangles and ovals.
 import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;
import java.awt.image.BufferedImage;
 import javax.swing.*;
public class LinesRectsOvals extends JFrame implements ActionListener {
public  JButton changeColorButton;


Color colorfi=Color.cyan;
Graphics g1;
 // set window's title bar String and dimensions
 public LinesRectsOvals()
 {
 super( "Dibujar figuras 2D gaspar Ruiz ISabel, Agustin Cruz Everardo Alvaro " );
 this.getContentPane().setBackground(Color.white);
changeColorButton = new JButton( "Cambiar color de las figuras " );
this.add( changeColorButton,BorderLayout.SOUTH );
changeColorButton.addActionListener(this);
 setSize( 500, 600 );
 setVisible( true );
 }

 // display various lines, rectangles and ovals
 public void paint( Graphics g)
 {
     
  
 super.paint( g ); 
 g1=g;
// call superclass's paint method
 g1.setColor( colorfi);
 g1.drawLine( 5, 30, 350, 30 );
 //g.drawString( "Agustin Cruz Everardo Alvaro", 40, 80 );

// cubo sin fondo 
 g1.setColor( colorfi);
 g1.drawRect( 5, 40, 90, 55 );
 // cube fill
 g1.setColor( colorfi);
 g1.fillRect( 100, 40, 90, 55 );
//oval fill
 g1.setColor( colorfi );
 g1.fillRoundRect( 195, 40, 90, 55, 50, 50 );
 // oval not fill 
 g1.setColor( colorfi);
 g1.drawRoundRect( 290, 40, 90, 55, 20, 20 );
// rect 3d 
 g1.setColor( colorfi );
 g1.draw3DRect( 5, 100, 90, 55, true );
 //cuadro 3d
 g1.setColor( colorfi );
 g1.fill3DRect( 100, 100, 90, 55, false );
  //oval not fill
 g1.setColor( colorfi );
 g1.drawOval( 195, 100, 90, 55 );
 //oval fill
 g1.setColor( colorfi );
 g1.fillOval( 290, 100, 90, 55 );
 
 // start at 0 and sweep 360 degrees
 g.setColor( Color.black );
 g.drawRect( 5, 165, 80, 80 );
 g.setColor( colorfi);
 g.drawArc( 5, 165, 80, 80, 0, 360 );

 // start at 0 and sweep 110 degrees
 g.setColor( Color.black );
 g.drawRect( 100, 165, 80, 80 );
 g.setColor( colorfi );
 g.drawArc( 100, 165, 80, 80, 0, 110 );

 // start at 0 and sweep -270 degrees
 g.setColor(Color.black );
 g.drawRect( 185, 165, 80, 80 );
 g.setColor( colorfi);
 g.drawArc( 185, 165, 80, 80, 0, -270 );

 // start at 0 and sweep 360 degrees
 g.fillArc( 15, 280, 80, 40, 0, 360 );

 // start at 270 and sweep -90 degrees
 g.fillArc( 100, 280, 80, 40, 270, -90 );

 // start at 0 and sweep -270 degrees
g.fillArc( 185, 280, 80, 40, 0, -270 );

// end arc 

Graphics2D g2d = ( Graphics2D ) g; // cast g to Graphics2D

 // draw 2D ellipse filled with a blue-yellow gradient
 g2d.setPaint( new GradientPaint( 5, 400, colorfi, 35, 100,
 Color.YELLOW, true ) );
 g2d.fill( new Ellipse2D.Double( 5, 400, 65, 100 ) );

 // draw 2D rectangle in red
 g2d.setPaint( colorfi );
 g2d.setStroke( new BasicStroke( 10.0f ) );
g2d.draw( new Rectangle2D.Double( 80, 400, 65, 100 ) );

 // draw 2D rounded rectangle with a buffered background
 BufferedImage buffImage = new BufferedImage( 10, 10,BufferedImage.TYPE_INT_RGB );

 Graphics2D gg = buffImage.createGraphics();
 gg.setColor( colorfi ); // draw in yellow
 gg.fillRect( 0, 0, 10, 10 ); // draw a filled rectangle
 gg.setColor( Color.BLACK ); // draw in black
gg.drawRect( 1, 1, 6, 6 ); // draw a rectangle
 gg.setColor( Color.BLUE ); // draw in blue
 gg.fillRect( 1, 1, 3, 3 ); // draw a filled rectangle
 gg.setColor( Color.RED ); // draw in red
 gg.fillRect( 4, 4, 3, 3 ); // draw a filled rectangle


// paint buffImage onto the JFrame
 g2d.setPaint( new TexturePaint( buffImage,
 new Rectangle( 10, 10 ) ) );
 g2d.fill( new RoundRectangle2D.Double( 155, 400, 75, 100, 50, 50 ) );
 // draw 2D pie-shaped arc in white
 g2d.setPaint( colorfi );
 g2d.setStroke( new BasicStroke( 6.0f ) );
 g2d.draw( new Arc2D.Double( 240, 400, 75, 100, 0, 270, Arc2D.PIE ) );

 // draw 2D lines in green and yellow
 g2d.setPaint( Color.GREEN );
 g2d.draw( new Line2D.Double( 400, 400, 320, 500 ) );

 float dashes[] = { 10 };

 g2d.setPaint( colorfi );
 g2d.setStroke( new BasicStroke( 4, BasicStroke.CAP_ROUND,
 BasicStroke.JOIN_ROUND, 10, dashes, 0 ) );
 g2d.draw( new Line2D.Double( 320, 400, 395, 500 ) ); 
 } // end method paint

 // execute application
 public static void main( String args[] )
 {
 LinesRectsOvals application = new LinesRectsOvals();
 
 application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==changeColorButton){
        JColorChooser colorChooser = new JColorChooser();
        
        Color color=JColorChooser.showDialog(null, "Modelos De color", Color.yellow);
       System.out.print("hola");
        colorfi=color;
         repaint();
        }
    }

 } // end class LinesRectsOvals