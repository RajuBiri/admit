import javax.swing.*;
import java.awt.*;

public class Tools{
  static JFrame newFrame(JFrame frame,int x,int y){
    frame.setTitle("Login System"); 
    frame.setSize(x,y); 
    frame.getContentPane().setBackground(new Color(64,64,64));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setResizable(false);

    return frame;
  }
  //
  //static void newLabel(JLabel label,String text,int x,int y){
  //}
}
