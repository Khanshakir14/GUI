/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textfieldevent_2;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame 
{
    Label l1,l2;
    TextField tf;
    
    MyFrame()
    {
        super("TextField Demo");
        
        l1=new Label("No Text is Entered Yet");
        l2=new Label("Enter key is not yet hit");
        tf=new TextField(20);
        tf.setEchoChar('*');
        
        Handler h=new Handler();
        
        tf.addTextListener(h);  // we have attached our interfaces by using an inner
        tf.addActionListener(h);// handler class and we have attached our components to the
                                //interfaces using object of that inner class instead of this reference 
        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
        
        
    }
    
    
    
    class Handler implements TextListener,ActionListener //we have implemented our interfaces here instead of the Myframe class
    {
        public void textValueChanged(TextEvent te)
        {
             l1.setText(tf.getText());
        }
    
        public void actionPerformed(ActionEvent ae)
        {
            l2.setText(tf.getText());
        }
    }
    
} 
public class TextFieldEvent_2 {

       public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(400,400);
        f.setVisible(true);
    }   
    
}
