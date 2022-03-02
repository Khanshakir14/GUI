import java.awt.*;


/**
 *
 * @author shaha
 */
public class AWT_project_1 {

    
    public static void main(String[] args) {
        
        Frame f= new Frame("My first app");
        f.setLayout(new FlowLayout()); //A flow layout arranges components in a 
                                       //left-to-right flow, much like lines of text in a paragraph
        
        Button b= new Button("OK");
        Label l= new Label("Name ");
        TextField tf= new TextField(20); //gives the visible size of the textfield and not the size of string
        
        f.add(l);
        f.add(tf);
        f.add(b);
        
        f.setSize(300,300);
        f.setVisible(true);
    }
    
}
