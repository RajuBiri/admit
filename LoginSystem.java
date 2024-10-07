import java.awt.*;
import javax.swing.*;

class LoginSystem {
  private JFrame frame;
  private JPasswordField password;
  private JTextField username;
  private JButton login;

  LoginSystem(){
    //set up main Frame 
    frame = Tools.newFrame(new JFrame(),350,250);
    frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,50));

    //Add Text Labels and Fields
    JLabel userLabel = new JLabel("Username:");
    userLabel.setForeground(Color.WHITE); 
    frame.add(userLabel);
    username = new JTextField(20);
    frame.add(username); 

    JLabel passLabel = new JLabel("Password:");
    passLabel.setForeground(Color.WHITE); 
    frame.add(passLabel);
    password = new JPasswordField(20);
    frame.add(password); 

    login = new JButton("Login");
    frame.add(login); 

    addLoginListener();
    frame.setVisible(true); 
  }

  //bing the button with an event listener 
  private void addLoginListener() {
    login.addActionListener(e -> {
      //get data in readable format 
      String usr = username.getText();
      String pass = new String(password.getPassword());

      //check if valid
      if (usr.equals("admin") && pass.equals("adritogod")){ 
        JOptionPane.showMessageDialog(frame, "Login successful!");
      }
      else {
        JOptionPane.showMessageDialog(frame, "Invalid credentials", "Error", JOptionPane.ERROR_MESSAGE);
      }
    }
    );
  }
}
