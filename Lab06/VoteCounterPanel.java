package Lab06;

import java.awt.*; 
import java.awt.event.*; 

import javax.swing. *;

public class VoteCounterPanel extends JPanel 
{
    private int votesForJoe;
    private JButton joe;
    private JLabel labelJoe;
    private int votesForSam;
    private JButton sam;
    private JLabel labelSam;
    private JLabel votesLead;
    
    //------------------------------------------------- 
    // Constructor: Sets up the GUI.
    //------------------------------------------------- 
    public VoteCounterPanel() 
    {
        votesForJoe = 0;
        joe = new JButton("Vote for Joe");
        joe.addActionListener(new VoteButtonListener());
        labelJoe = new JLabel("Votes for Joe: " + votesForJoe);
        add(joe);
        add(labelJoe);
        
        votesForSam = 0; 
        sam = new JButton("Vote for sam");
        sam.addActionListener(new VoteButtonListener());
        labelSam = new JLabel("Vote for Sam: " + votesForSam);  
        add(sam);
        add(labelSam);
        
        votesLead = new JLabel("");
        add(votesLead);
        
        setPreferredSize (new Dimension(150, 150));
        setBackground(Color.cyan); 
    }
    
    //************************************************** 
    // Represents a listener for button push (action) events 
    //************************************************** 
    private class VoteButtonListener implements ActionListener 
    {
        //---------------------------------------------- 
        // Updates the appropriate vote counter when a 
        // button is pushed for one of the candidates. 
        //---------------------------------------------- 
        public void actionPerformed(ActionEvent event) 
        {
            if (event.getSource() == joe) {
                votesForJoe++;
                labelJoe.setText("Votes for Joe: " + votesForJoe); 
            }
            else {
                votesForSam++;
                labelSam.setText("Votes for Sam: " + votesForSam); 
            }
            if (votesForJoe == votesForSam) {
                votesLead.setText("They are tied");
            }
            else {   
               if (votesForJoe > votesForSam) {
                   votesLead.setText("Joe is winning");
               }
               else {
                   votesLead.setText("Sam is winning");
               }  
            }
        }
    }
}