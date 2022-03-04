/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package keyeventdemo;

import java.awt.*;
import java.awt.event.*;
import java.util.Date;

class MyFrame extends Frame implements KeyListener   //there are three methods in this interface which we are going to override
{
    Label l1,l2,l3,l4;
    
    public MyFrame()
    {
        super("KeyEvent Demo");
        l1=new Label("");
        l2=new Label("");
        l3=new Label("");
        l4=new Label("");
        
        setLayout(null);  // Here we have not set any type of layput instead we are going to set it manually using setBounds method
        
        l1.setBounds(30,30,100,20);
        l2.setBounds(30, 70,100,20);
        l3.setBounds(30,100,100,20);
        l4.setBounds(30,130,200,20);
        
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        
        addKeyListener(this);
    }

    

    @Override
    public void keyPressed(KeyEvent e)
    {
        l1.setText("keypressed");
        l2.setText("");
        }

    @Override
    public void keyReleased(KeyEvent e) {
        l2.setText("keyreleased");
        l1.setText("");
        l3.setText("");
        l4.setText("");
    }
    
    @Override
    public void keyTyped(KeyEvent e)
    {
        l3.setText("key Typed");
        l4.setText(new Date(e.getWhen())+"");
        
    }
}

public class KeyEventDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }
    
}