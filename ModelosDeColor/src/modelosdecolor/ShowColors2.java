// Fig. 12.6: ShowColors2.java
 // Choosing colors with JColorChooser.
package modelosdecolor;
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

 public class ShowColors2 extends JFrame {
    private JButton changeColorButton;
    private Color color = Color.LIGHT_GRAY;
    private Container container;
     ShapeDemo2D applet = new ShapeDemo2D();
    // set up GUI
 public ShowColors2()
 {
    super( "Modelos de Color" );
    container = getContentPane();
     container.add(applet);
    container.setLayout( new FlowLayout() );
   
   ;
    // set up changeColorButton and register its event handler
    changeColorButton = new JButton( "Change Color" );
    changeColorButton.addActionListener(new ActionListener() { // anonymous inner class
            // display JColorChooser when user clicks button
            public void actionPerformed( ActionEvent event )
            {
                color = JColorChooser.showDialog(
                ShowColors2.this, "Choose a color", color );
                // set default color, if no color is returned
                if ( color == null )
                    color = Color.LIGHT_GRAY;
                // change content pane's background color
                container.setBackground( color );
            }
        } // end anonymous inner class
    ); // end call to addActionListener
    
    
   
    container.add( changeColorButton );
    setSize( 1000, 1000);    
    setVisible( true );
    applet.setVisible( true );

 } // end ShowColor2 constructor
// execute application
 public static void main( String args[] )
 {
 ShowColors2 application = new ShowColors2();
 application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
 
 
 }

 } // end class ShowColors2
