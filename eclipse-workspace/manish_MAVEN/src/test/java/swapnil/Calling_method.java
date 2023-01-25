package swapnil;




public class Calling_method {
	
	
   public void m1() {System.out.println(" non static method m1 pallavi..."); 
               
       m2();
   																	}
   
   public  void m2() { System.out.println(" non static method m2  swapnil.."); 
   Calling_method.m3();
    																}
 
   public static  void m3() { System.out.println(" non static method m3 pranali.."); 
																		
   
  
    
    System.out.println("end...");
   }

   
	public static void main(String[] args) {
		 
		Calling_method obj=new Calling_method();
		obj.m1();
		 
		   
		
	}


	

}
