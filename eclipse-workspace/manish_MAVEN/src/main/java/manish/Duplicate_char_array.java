package manish;

public class Duplicate_char_array {

	  public static void main(String argu[]) {
		  
	      String str = "beautiful beach";
	      
	      char[] arr = str.toCharArray();
	      
	      System.out.println("The string is:" + str);
	      
	      System.out.print("Duplicate Characters in above string are: ");
	      
	      for (int i = 0; i < str.length(); i++) {
	    	  
	         for (int j = i + 1; j < str.length(); j++) {
	        	 
	            if (arr[i] == arr[j]) {
	            	
	               System.out.print(arr[j] + " ");
	               
	               break;
	               
	            }
	         }
	      }
	   }
}
