import javax.swing.*; 
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class basicApplet4 extends Applet implements ActionListener 
{
  public void init ()
  {
    resize (500, 700);
    setBackground (new Color (69,223,237));
    JLabel skiRace = new JLabel (createImageIcon ("SkiRace.jpg")); 
    add (skiRace);
    JLabel points = new JLabel ("Enter the number of points beside each skier: ");
    points.setFont (new Font ("Arial", Font.PLAIN, 20));
    add (points); 
    JLabel player1 = new JLabel (createImageIcon ("SkiRace1.jpg")); 
    add (player1);
    JTextField one = new JTextField (3);
    add (one);
    JLabel player2 = new JLabel (createImageIcon ("SkiRace2.jpg")); 
    add (player2);
    JTextField two = new JTextField (3);
    add (two);
    JLabel player3 = new JLabel (createImageIcon ("SkiRace3.jpg"));
    add (player3); 
    JTextField three = new JTextField (3);
    add (three);
    JLabel player4 = new JLabel (createImageIcon ("SkiRace4.jpg"));
    add (player4); 
    JTextField four = new JTextField (3);
    add (four);
    JButton done  = new JButton ("Done");
    add (done);
    done.setBackground (Color.white);
    done.setForeground (Color.blue);
    
  }
  
  
  
  
  
  
  
  
     public void actionPerformed (ActionEvent e)
   {
   }
     
     protected static ImageIcon createImageIcon (String path)
  {
   java.net.URL imgURL = basicApplet4.class.getResource (path); 
   
    if (imgURL != null)
      return new ImageIcon (imgURL);
    else 
    {
      System.out.println ("Couldn't find file: " + path);
      return null; 
    }
   
}
}
