package scrollbardemo;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements AdjustmentListener
{
    Scrollbar red,green,blue;
    TextField tf;
    
    public MyFrame()
    {
        super("Scroll bar demo");
        
        red=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        green=new Scrollbar(Scrollbar.HORIZONTAL,0,20,0,255);
        tf=new TextField(20);
        
        tf.setBounds(50,50,300,50);
        red.setBounds(50,150,300,30);
        blue.setBounds(50,200,300,30);
        green.setBounds(50,250,300,30);
        
        
        setLayout(null);
        add(tf);
        add(red);
        add(blue);
        add(green);
        
        red.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        tf.setBackground(new Color(red.getValue(),blue.getValue(),green.getValue())); //Here color is a class which takes values from 0 to 255 i.e 256 shades for each color
  
    }
}
public class ScrollbarDemo {

    public static void main(String[] args) {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
        // TODO code application logic here
    }
    
}