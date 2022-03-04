/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package buttondemo;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
    int count =0;
    Label l;
    Button b;

    public MyFrame(){
        super("Button Demo");
        l =new Label("  "+count);
        b = new Button("Click");
        b.addActionListener(this);  //registering component with the interface

        setLayout(new FlowLayout());
        add(l);
        add(b);
        
    }
   
        public void actionPerformed(ActionEvent e)
        {
            count ++;  
            l.setText(" "+count);

    }
}

public class ButtonDemo{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyFrame f= new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }
    
}
