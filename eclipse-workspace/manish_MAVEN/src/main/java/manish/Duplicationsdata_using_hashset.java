package manish;

import java.util.HashSet;

public class Duplicationsdata_using_hashset {

	public static void main(String[] args) {
		
		
		String arr[]= {"pune","munbai","kolkata","banglore","pune"};
		
		HashSet <String>leg=new HashSet(); 
		boolean flag=false;
		for (String l:arr) {
		if (leg.add(l)==false) {
			System.out.println("duplicated  found "+l);
			flag=true;}	
		}
		}
		}