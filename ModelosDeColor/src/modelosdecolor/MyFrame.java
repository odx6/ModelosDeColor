/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelosdecolor;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author ever
 */
public class MyFrame extends JFrame implements ActionListener {
    
    JButton button;
    JLabel label;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        button = new JButton("Cambiar Color");
        button.addActionListener(this);
        label = new JLabel();
        label.setPreferredSize(new Dimension(100, 100));
        label.setBackground(Color.red);
        label.setOpaque(true);
        this.add(button);     
        this.add(label);

        this.pack();
        this.setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
        JColorChooser colorChooser = new JColorChooser();
        
        Color color=JColorChooser.showDialog(null, "Modelos De color", Color.yellow);
       
        label.setBackground(color);
        }
        
        
    }
    
    
    public static void main(String s[]) {
        new MyFrame();
    }
    
    
}
