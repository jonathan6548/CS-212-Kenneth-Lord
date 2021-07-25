import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Collections;
import java.util.StringTokenizer;


public class FileMenuHandler implements ActionListener {
//   JFrame jframe;
//   public static JFileChooser selected;
//   public FileMenuHandler (JFrame jf) {
//      jframe = jf;
//  }
   public void actionPerformed(ActionEvent event) {
      String menuName = event.getActionCommand();
      
     
      
      if (event.getActionCommand().equals("Open")) {
   	   JFileChooser chooser = new JFileChooser();
   	   int status;
   	   status = chooser.showOpenDialog(null);
   	   	if(status == JFileChooser.APPROVE_OPTION) {
   		   Project3.list1.clear();
   		   Project3.list2.clear();
   		   Project3.list3.clear();
   		   
   	   
   	   
   		   try {
   			File file= chooser.getSelectedFile();
   			BufferedReader br = new BufferedReader(new FileReader(file));
   			String line = br.readLine();
   			StringTokenizer token;
   			
   			while(line!=null) {
   				 token = new StringTokenizer(line);
   				while(token.hasMoreTokens()) {
   					Word word = new Word(token.nextToken());
   					Project3.list1.add(word);
   					Project3.list2.add(word);
   					
   				}
   				line = br.readLine();
   			}
   		   }catch(IOException ex) {
   			
   		   }
   	   
   		   Collections.sort(Project3.list2);
	   	   String framename = "Project 3";
	   	  
	   	   JFrame frame = new JFrame(framename);
		Container cont= frame.getContentPane();
	   	   Project3.gui.readAndDisplayWords(frame, cont, Project3.list1, Project3.list2, Project3.list3);
   	   
   	   
      }else {
    	  
      }
      }else if(event.getActionCommand().equals("Quit")) {
    	  
         // JOptionPane.showMessageDialog(null,"You clicked on Quit"); 
    	  System.exit(0);
      
    }//else if 
    
      //if
   
   
   }//actionPerformed
   
}//end class


/*try {

//TextFileInput in = new TextFileInput(selected.getSelectedFile());
File file = chooser.getSelectedFile();
BufferedReader in = new BufferedReader(new FileReader(file) );
String line = in.readLine();
StringTokenizer token;

while(line!=null) {
	 token = new StringTokenizer(line);
	while(token.hasMoreTokens()) {
		Word word = new Word(token.nextToken());
		Project3.list1.add(word);
		Project3.list2.add(word);
	}
	line = in.readLine();
}
}catch (FileNotFoundException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}//catch
catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
Collections.sort(Project3.list2);
Project3.gui = new WordGUI();
Project3.gui.createAndShowGUI("Project 3", Project3.list1, Project3.list2, Project3.list3);


*/