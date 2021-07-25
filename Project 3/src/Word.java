import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class Word implements Comparable<Word>{
	
	public String s;
	
	
	/**
	 * 
	 * 
	 * @author Jonthan Mathew
	 * @since 11/18/20
	 * @version 1
	 * @description creates type word for the other classes
	 * 
	 * 
	 */
	public Word(String w) {
		s=w;
		try {
			Pattern pattern = Pattern.compile("[$&+,:;=\\\\?@#|/'<>.^*()%!-]");//checks to see if there is special elements
			
		
				if(s.matches(".*\\d.*") ||  pattern.matcher(s).find() )
					throw new IllegalWordException();
			
				
				
		}catch(IllegalWordException ill) {
			Project3.list3.add(this);
		}
		
		Project3.list1.add(this);
		Project3.list2.add(this);
		
	}


	public int compareTo(Word k) {
		// TODO Auto-generated method stub
		return s.compareTo(k.s);
	}
	
	

}
