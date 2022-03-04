/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textfield.textevent;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements TextListener,ActionListener{
    Label l1,l2;
    TextField tf;
    
    MyFrame(){
        super("Text Field Demo");
        
        l1= new Label("No text entered,Text field is blank");
        l2= new Label("Enter key is not pressed yet");
        tf = new TextField(20);
        tf.setEchoChar('*');
        
        tf.addTextListener(this);
        tf.addActionListener(this);
        
        setLayout(new FlowLayout());
        add(l1);
        add(tf);
        add(l2);
        
        
    }

   //event handling
    public void textValueChanged(TextEvent e) {   //handles dynamic label on left side 
        l1.setText(tf.getText());
    }

    
    public void actionPerformed(ActionEvent e) {   //handles event on pressing Enter
        l2.setText(tf.getText());
    }
}


public class TextFieldTextEvent {

    
    public static void main(String[] args) {
       MyFrame f= new MyFrame();
       f.setSize(400,400);
       f.setVisible(true);
    }
    
}
