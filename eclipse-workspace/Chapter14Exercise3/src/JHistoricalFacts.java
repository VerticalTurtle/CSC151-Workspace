/* Alex McLaurin 11-30-2024
 Create an application with a JFrame and at least five labels that contain interesting historical facts. 
 Every time the user clicks a JButton, remove one of the labels and add a different one. Save the file as JHistoricalFacts.java 
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JHistoricalFacts {
    public static void main(String[] args) {
    	
    	//The best way I found to handle this was to make an array for the facts
        String[] facts = {
            "In Ancient Egypt, the New Year celebration was called Wepet Renpet.",
            "The Vikings loved grooming.",
            "The tiny Easter Island is home to 887 giant head statues.",
            "The first living creature in space was a dog named Laika.",
            "The Leaning Tower of Pisa never stood up straight.",
            ""
        };

        JFrame frame = new JFrame("Historical Facts");
        JLabel fact = new JLabel(facts[0]);
        JButton nextFact = new JButton("Next Fact");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setLayout(new FlowLayout());
        
        frame.add(fact);
        frame.add(nextFact);       
        frame.setVisible(true);
        frame.setBounds(1000, 600, 700, 120);

        nextFact.addActionListener(new ActionListener() {
            int factIndex = 0;

            public void actionPerformed(ActionEvent e) {
            	
                factIndex = (factIndex + 1);
                fact.setText(facts[factIndex]);
                
                //I reused this from the last assignment
                if (factIndex >= 5) {
                	
                	nextFact.setText("No more!");
                    nextFact.setEnabled(false);
                    fact.setText("That's all five of my facts!");
                    
                    
                }
            }
        });
    }
}
