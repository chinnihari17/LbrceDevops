package lbrce;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sinup {

   public static void main(String[] args) {
       // Create the frame
       JFrame frame = new JFrame("Signup Page");
       frame.setSize(300, 200);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(null);

       // Create and position the username label and text field
       JLabel userLabel = new JLabel("Username:");
       userLabel.setBounds(10, 10, 80, 25);
       frame.add(userLabel);

       JTextField userText = new JTextField();
       userText.setBounds(100, 10, 165, 25);
       frame.add(userText);

       // Create and position the password label and text field
       JLabel passwordLabel = new JLabel("Password:");
       passwordLabel.setBounds(10, 40, 80, 25);
       frame.add(passwordLabel);

       JPasswordField passwordText = new JPasswordField();
       passwordText.setBounds(100, 40, 165, 25);
       frame.add(passwordText);

       // Create and position the confirm password label and text field
       JLabel confirmPasswordLabel = new JLabel("Confirm Password:");
       confirmPasswordLabel.setBounds(10, 70, 150, 25);
       frame.add(confirmPasswordLabel);

       JPasswordField confirmPasswordText = new JPasswordField();
       confirmPasswordText.setBounds(160, 70, 105, 25);
       frame.add(confirmPasswordText);

       // Create and position the signup button
       JButton signupButton = new JButton("Sign Up");
       signupButton.setBounds(10, 110, 255, 25);
       frame.add(signupButton);

       // Add action listener to the button
       signupButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               String username = userText.getText();
               String password = new String(passwordText.getPassword());
               String confirmPassword = new String(confirmPasswordText.getPassword());

               // Simple validation check
               if (username.isEmpty() || password.isEmpty()) {
                   JOptionPane.showMessageDialog(frame, "Username and Password cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
               } else if (!password.equals(confirmPassword)) {
                   JOptionPane.showMessageDialog(frame, "Passwords do not match", "Error", JOptionPane.ERROR_MESSAGE);
               } else {
                   JOptionPane.showMessageDialog(frame, "Signup Successful");
               }
           }
       });

       // Make the frame visible
       frame.setVisible(true);
   }
}
