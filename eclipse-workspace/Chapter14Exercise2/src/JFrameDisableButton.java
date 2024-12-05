/* Alex McLaurin 11-30-2024
 Write an application that instantiates a JFrame that contains a JButton. Disable the JButton after the user clicks it. Save the file as JFrameDisableButton.java.
 Modify the JFrameDisableButton program so that the JButton is not disabled until the user has clicked at least eight times. 
 At that point, display a JLabel that indicates “That’s enough!”. Save the file as JFrameDisableButton2.java. 
*/

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.*;

public class JFrameDisableButton {
    
	public static void main(String[] args) {

        JFrame frame = new JFrame("Disable Button");
        JLabel label = new JLabel("Click the button 8 times.");
        JButton button = new JButton("I'm the button");
       
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setLayout(new FlowLayout());
        
        frame.add(label);
        frame.add(button);                    
        frame.setVisible(true);
        frame.setBounds(1000, 600, 400, 120);
        
        
        button.addActionListener(new ActionListener() {
            int counter = 0;
            int countDown = 8;
            
            public void actionPerformed(ActionEvent e) {
                counter++;
                countDown--;
                label.setText("Click me " + countDown + " more times!");
                
                if (counter >= 8) {
                	
                    button.setEnabled(false);
                    label.setText("That's enough!");     
                }
            }
        });
    }
}
