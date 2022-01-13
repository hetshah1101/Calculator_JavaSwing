/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1;

/**
 *
 * @author hetshah
 */

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Lab1 {
    static int flag = 0, a = 0, b = 0, result = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame jf = new JFrame("Calculator");
        
        
        jf.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        
        JTextField jt1 = new JTextField(20);
        jt1.setEditable(false);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 0;
	c.gridy = 0;
        c.gridwidth = 4;
        jf.add(jt1,c);
        
        JButton b0 = new JButton("0");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        JButton b8 = new JButton("8");
        JButton b9 = new JButton("9");
        
        JButton badd = new JButton("+");
        JButton bsub = new JButton("-");
        JButton bmul = new JButton("*");
        JButton bdiv = new JButton("/");
        JButton beq = new JButton("=");
        JButton bclear = new JButton("C");
        
        //row 2
        c.gridwidth = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 1;
        
        c.gridx = 0;
        jf.add(b1, c);
        c.gridx = 1;
        jf.add(b2, c);
        c.gridx = 2;
        jf.add(b3, c);
        c.gridx = 3;
        jf.add(badd, c);
        
        // row 3
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 2;
        
        c.gridx = 0;
        jf.add(b4, c);
        c.gridx = 1;
        jf.add(b5, c);
        c.gridx = 2;
        jf.add(b6, c);
        c.gridx = 3;
        jf.add(bsub, c);
        
        // row 4
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 3;
        
        c.gridx = 0;
        jf.add(b7, c);
        c.gridx = 1;
        jf.add(b8, c);
        c.gridx = 2;
        jf.add(b9, c);
        c.gridx = 3;
        jf.add(bmul, c);
        
        // row 5
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridy = 4;
        
        c.gridx = 0;
        bclear.setForeground(Color.red);
        jf.add(bclear, c);
        c.gridx = 1;
        jf.add(b0, c);
        c.gridx = 2;
        beq.setForeground(Color.blue);
        jf.add(beq, c);
        c.gridx = 3;
        jf.add(bdiv, c);
        
        //Event Handlers
        b0.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               jt1.setText( jt1.getText()+"0" );
            }
        });
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               jt1.setText( jt1.getText()+"1" );
            }
        });
        b2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               jt1.setText( jt1.getText()+"2" );
            }
        });
        b3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               jt1.setText( jt1.getText()+"3" );
            }
        });
        b4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               jt1.setText( jt1.getText()+"4" );
            }
        });
        b5.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               jt1.setText( jt1.getText()+"5" );
            }
        });
        b6.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               jt1.setText( jt1.getText()+"6" );
            }
        });
        b7.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               jt1.setText( jt1.getText()+"7" );
            }
        });
        b8.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               jt1.setText( jt1.getText()+"8" );
            }
        });
        b9.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               jt1.setText( jt1.getText()+"9" );
            }
        });
        bclear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               jt1.setText("");
            }
        });
        
        badd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               a = Integer.parseInt(jt1.getText());
               jt1.setText("");
               flag = 1;
            }
        });
        
        bsub.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               a = Integer.parseInt(jt1.getText());
               jt1.setText("");
               flag = 2;
            }
        });
        
        bmul.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               a = Integer.parseInt(jt1.getText());
               jt1.setText("");
               flag = 3;
            }
        });
        
        bdiv.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               a = Integer.parseInt(jt1.getText());
               jt1.setText("");
               flag = 4;
            }
        });
        
        beq.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               b = Integer.parseInt(jt1.getText());
               
               switch(flag){
                   case 1: result = a + b;
                        jt1.setText(String.valueOf(result));
                        break;
                   case 2: result = a - b;
                        jt1.setText(String.valueOf(result));
                        break;
                   case 3: result = a * b;
                        jt1.setText(String.valueOf(result));
                        break;
                   case 4:
                       if (b == 0)
                       {
                           jt1.setText("Divide By Zero Error");
                           break;
                       }
                       result = a / b;
                       jt1.setText(String.valueOf(result));
                   break;
               }
            }
        });
        
        jf.setSize(300,300);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
