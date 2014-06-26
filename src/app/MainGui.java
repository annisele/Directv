package app;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

import app.ListPanel;
import app.DataList;

public class MainGui extends JFrame implements ActionListener{

int x = 2;
private ListPanel listPanel = new ListPanel(this);
private JPanel infoPanel; 
 
 public MainGui() {
	 int WINDOWX = 450;
     int WINDOWY = 350;
     
  
     //Create and set up the window.
     JFrame frame = new JFrame("XML generator");
    // setLayout(new BorderLayout());
     frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     //Add the ubiquitous "Hello World" label.
     JLabel label = new JLabel("Hello World");
     frame.getContentPane().add(label);
     
     Dimension infoDim = new Dimension(WINDOWX, (int) (WINDOWY * .25));
     infoPanel = new JPanel();
     infoPanel.setPreferredSize(infoDim);
     infoPanel.setMinimumSize(infoDim);
     infoPanel.setMaximumSize(infoDim);
     infoPanel.setBorder(BorderFactory.createTitledBorder("Generate yo XML"));
     frame.add(infoPanel,BorderLayout.NORTH);
     
     
     Dimension listDim = new Dimension(WINDOWX, (int) (WINDOWY * .6));
     listPanel.setPreferredSize(listDim);
     listPanel.setMinimumSize(listDim);
     listPanel.setMaximumSize(listDim);
     frame.add(listPanel, BorderLayout.CENTER);
     
     frame.pack();
     frame.setVisible(true);
 }

 public static void main(String[] args) {
    MainGui gui = new MainGui();
 }

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	
}
 
}

