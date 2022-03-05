package wayofhandlingevent;
/*Ways of Handling Event
1)Frame classas listener class (way we have used commonl)
2)Inner class 
3)Anonymous class
4)lamda Expression
*/



import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame
{
    TextField tf;            
    
    
    Button b;
    int count=0;
    
    MyFrame()
    {
        super("Event Demo");
        
        tf=new TextField("0",20);
        b=new Button("Click");
        
        setLayout(new FlowLayout());
        add(tf);
        add(b);
        
        b.addActionListener((ActionEvent ae)-> {count++;tf.setText(String.valueOf(count));});
            
            
        
        
    }
        
}

public class WayOfHandlingEvent
{
    public static void main(String[] args) 
    {
        MyFrame f=new MyFrame();
        f.setSize(500,500);
        f.setVisible(true);
    }    
}
