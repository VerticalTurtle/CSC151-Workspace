/* Alex McLaurin 11-30-2024
 Write an application that displays a JFrame containing the opening sentence or two from your favorite book. Save the file as JBookQuote.java.
 Add a button to the frame in the JBookQuote program. When the user clicks the button, display the title of the book that contains the quote. Save the file as JBookQuote2.java.
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JBookQuote {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Book Quote");
        JLabel quoteFirstLine = new JLabel("\"In the beginning, the Universe was created.");
        JLabel quoteSecondLine = new JLabel("This has made a lot of people very angry and has been widely regarded as a bad move.\"");
        JButton button = new JButton("Show book title.");        
        JLabel bookTitle = new JLabel("");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setDefaultLookAndFeelDecorated(true);
        frame.setLayout(new FlowLayout());

        
        frame.add(quoteFirstLine);
        frame.add(quoteSecondLine);
        frame.add(bookTitle);
        frame.add(button);
        frame.setVisible(true);
        frame.setBounds(1000, 600, 600, 150);

        button.addActionListener(new ActionListener() {
           
        	public void actionPerformed(ActionEvent e) {
            	
                bookTitle.setText("The Hitchhikers' Guide to the Galaxy");
                		
            }
        });
        

    }
}

