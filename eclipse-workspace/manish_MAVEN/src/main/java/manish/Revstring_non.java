package manish;

public class Revstring_non {

	public void  m1(String a) {
		
		for(int i=a.length()-1;i>=0;i--) {
			
			System.out.print(a.charAt(i));
		}

	}



	public static void main(String[] args) {
		
		Revstring_non obj= new Revstring_non();
		obj.m1("WELCOME IN PUNE ");
	
	

}
}