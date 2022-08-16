/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author HP
 */
public class Swing {

    private JFrame jf;
    private JButton btn;
    private JLabel jl;
    public void init()
    {
        jf=new JFrame();
        jf.setVisible(true);
        jf.setSize(400,400);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(new FlowLayout());
        btn=new JButton("Click me");
        jf.add(btn);
        jl=new JLabel();
        jl.setText("not clicked yet!!!");
        jf.add(jl);
        btn.addActionListener(new MyListener());
        
    }
      
    public static void main(String[] args) {
    Swing obj=new Swing();
    obj.init();
       
       
       
       
    }
     class MyListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
           jl.setText("Clicked!!!");
            
        }
    }
}
   
    
