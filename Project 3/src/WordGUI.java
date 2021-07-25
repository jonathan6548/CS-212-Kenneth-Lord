import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class WordGUI extends JFrame{
	
	
	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 10/30/20
	 * @version 1
	 * @description creates a GUI that displays the  
	 * 
	 * 
	 */
	public void createAndShowGUI(String framename,ArrayList<Word> unsorted, ArrayList<Word> sorted, ArrayList<Word> illegal) {
		
		JFrame frame = new JFrame(framename);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(100,100);
		frame.setLocation(500,500);  
		frame.setLayout(new GridLayout(1,3));
		Container cont= frame.getContentPane();
	    
	    
	    
	    JMenuItem   item;
	    JMenuBar    menuBar  = new JMenuBar();
	    JMenu menu = new JMenu("File");
	    JMenuItem open = new JMenuItem("Open");
	    JMenuItem close = new JMenuItem("Quit");
	    FileMenuHandler fmh  = new FileMenuHandler();
	    
	    open.addActionListener(fmh);
	    close.addActionListener(fmh);
	    
	    menu.add(open);
	    menu.add(close);
	    menuBar.add(menu);
	    
	    this.setJMenuBar(menuBar);
	    
	    open.addActionListener(fmh);
	    this.setVisible(true);
	   
//	    item = new JMenuItem("Open");    //Open...
//	      item.addActionListener( fmh );
//	      fileMenu.add( item );
//
//	      fileMenu.addSeparator();           //add a horizontal separator line
//	    
//	      item = new JMenuItem("Quit");       //Quit
//	      item.addActionListener( fmh );
//	      fileMenu.add( item );
//	      
//	      setJMenuBar(menuBar);
//	      menuBar.add(fileMenu);
	    
	    
	   // open.addActionListener(fmh);
	    //this.setVisible(true);
	    	
	    readAndDisplayWords(frame,cont,unsorted,sorted,illegal);
	    
	   
	    

		
	}//createAndShowGUI

	
	
	public static void readAndDisplayWords(JFrame frame,Container cont,ArrayList<Word> unsorted, ArrayList<Word> sorted, ArrayList<Word> illegal) {
		
		
		
		
		
		JTextArea allWords =new JTextArea(10,30);
		
		JTextArea sort =new JTextArea(10,30);
		
		JTextArea ill =new JTextArea(10,30);
		
		
		allWords.setText("");
		for(int i =0; i<unsorted.size();i++ ) {
			allWords.append(unsorted.get(i).s+ "\n");  
		}
		
		sort.setText("");
		for(int i =0; i<sorted.size();i++ ) {
			sort.append(sorted.get(i).s + "\n");  
		}
		
		ill.setText("");
		for(int i =0; i<illegal.size();i++ ) {
			ill.append(illegal.get(i).s+ "\n");  
		}
		
		
		cont.add(allWords);
		cont.add(sort);
		cont.add(ill);
		frame.setVisible(true);
		
		
		
		
		
	}//readand display words
}
