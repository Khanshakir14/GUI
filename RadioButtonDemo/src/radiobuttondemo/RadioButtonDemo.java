/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package radiobuttondemo;
import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ItemListener{
    Label l;
    Checkbox c1,c2,c3;
    CheckboxGroup cgd;
    
    public MyFrame(){
        super("RadioBox Demo");
        
        l = new Label("Nothing is selected");
        cgd =new CheckboxGroup(); 
        c1 = new Checkbox("Java",false,cgd);
        c2 = new Checkbox("Python",false,cgd);
        c3 = new Checkbox("c#",false,cgd);
        c1.addItemListener(this);
        c2.addItemListener(this);
        c3.addItemListener(this);
        
        setLayout(new FlowLayout());
        
        add(l);
        add(c1);
        add(c2);
        add(c3);
        
   
        
        
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
      
       String str="";
       if(c1.getState())
           str = str+" "+c1.getLabel();
       if (c2.getState())
           str= str+" "+c2.getLabel();
       if(c3.getState())
           str = str+" "+c3.getLabel();
       
       if(str.isEmpty())
           str="Noting is selected";
       l.setText(str);
        
    }
}
public class RadioButtonDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       MyFrame f= new MyFrame();
       f.setSize(400,400);
       f.setVisible(true);
    }
    }
    

