/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosdecolor;

import java.awt.BorderLayout;
import java.awt.Color;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javax.swing.BorderFactory;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.event.ChangeEvent;

/**
 *
 * @author ever
 */
public class ModelosDeColor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // titulo del frame 

        JFrame fr= new JFrame("Modelos De color ");
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JColorChooser selectorColor  = new JColorChooser();
        // Titulo para la ventana 
        
        final JLabel lb= new JLabel("Modelo De Color",JLabel.CENTER);
        selectorColor.setBorder(BorderFactory.createTitledBorder("Selecciona un color"));
        
        ColorSelectionModel modeloSelecion = selectorColor.getSelectionModel();
        
        ChangeListener escuchaCambios = new ChangeListener(){
           
            public void stateChanged(ChangeEvent e){
                Color nuevoColor =  selectorColor.getColor();
                // seCambia el label
                lb.setForeground(nuevoColor);
            }

            @Override
            public void changed(ObservableValue ov, Object t, Object t1) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
             
            
            
        };
        modeloSelecion.addChangeListener((javax.swing.event.ChangeListener) escuchaCambios);
        fr.add(lb,BorderLayout.SOUTH);       
        fr.add(selectorColor,BorderLayout.CENTER);
        fr.pack();
        fr.setVisible(true);
        
        
        
        
        
    }
    
}
