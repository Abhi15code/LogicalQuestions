package Exceptions;

class A{
	static{
		System.out.println("this is static block");

	}

}

public class classforname{
	public void arr(){
		int onar[] = {2,35,6,7};

		

	}
	public static void main(String args[]){
		String one = new String("Abhishek");
	String two = new String("Abhishek");
	System.out.println(one == two);
	System.out.println(one.equals(two));


	
	
		
	try{
	Class.forName("Exceptions.A");


}catch(Exception e){
		e.printStackTrace();
	
		}
		
		
	}



}