/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosdecolor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.*;


/**
 *
 * @author ever
 */
public class Shape2D {
    
    public static void main(String[] args){
      JFrame fr= new JFrame("Modelos De color ");
      fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JColorChooser selectorColor  = new JColorChooser();
 selectorColor.setBorder(BorderFactory.createTitledBorder("Selecciona un color"));
        
        
      
        
         JLabel VistaPrevia = new JLabel("Figura",JLabel.CENTER);
        //VistaPrevia.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,48));
        //VistaPrevia.setSize(VistaPrevia.getPreferredSize());
         //VistaPrevia.setBorder(BorderFactory.createEmptyBorder(0, 0, 1, 0));
          VistaPrevia.setPreferredSize(new Dimension(200, 200));
         VistaPrevia.setBackground(Color.red);
         
         VistaPrevia.setOpaque(true);
         


         
         //pn.add(ever);
         selectorColor.setPreviewPanel(VistaPrevia);
       
       //ShapeDemo2D applet = new ShapeDemo2D();
        //applet.CambiarColor(Color.red);
        //fr.add("Center", applet); 
        fr.add(selectorColor,BorderLayout.CENTER);
       //selectorColor.add(ever,BorderLayout.NORTH);
        fr.pack();
        fr.setVisible(true);
        
    }
    
}
