
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Project3 {
	
	
	
	public static ArrayList<Word> list1;
	public static ArrayList<Word> list2; 
	public static ArrayList<Word> list3;
	public static WordGUI gui;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list1 = new ArrayList <Word>();
		list2 = new ArrayList <Word>(); 
		list3 = new ArrayList <Word>();
		
//		try {
//			File file= new File("Project1Input.txt");
//			BufferedReader br = new BufferedReader(new FileReader(file));
//			String line = br.readLine();
//			StringTokenizer token;
//			
//			while(line!=null) {
//				 token = new StringTokenizer(line);
//				while(token.hasMoreTokens()) {
//					Word word = new Word(token.nextToken());
//					list1.add(word);
//					list2.add(word);
//					
//				}
//				line = br.readLine();
//			}
//		}catch(IOException ex) {
//			
//			
//			
//		}
		
		
//		TextFileInput in = new TextFileInput(args[0]);
//		String line = in.readLine();
//		StringTokenizer token;
//		
//		while(line!=null) {
//			 token = new StringTokenizer(line);
//			while(token.hasMoreTokens()) {
//				Word word = new Word(token.nextToken());
//				list1.add(word);
//				list2.add(word);
//			}
//			line = in.readLine();
//		}
		
		//Collections.sort(list3);
		WordGUI gui = new WordGUI();
		gui.createAndShowGUI("Project 3", list1, list2, list3);
	}//main
	

}
