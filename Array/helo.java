class singleton{
	private singleton(){}
	static int ab = 12321;
	int a = 2341;
	static singleton s=null;
	static{
		s = new singleton();
	}
	public static singleton getsingleton(){
		return s;
	}

	public static void show(){
		System.out.println("this is show method");
		System.out.println(ab);
		// System.out.println(a);
	}
}
public class helo{
	public static void main(String args[]){
		singleton sin = singleton.getsingleton();
		sin.show();
	// System.out.println("Hello this is main method");
	String one = new String("Abhishek");
	String two = new String("Abhishek");
	System.out.println(one == two);

	String str = null;
	System.out.println(str);
	
	}

}