package Serialization;

import java.io.*;
class User implements Serializable {
	String Username ;
	String Password;
	
	public void getmsg() {
		System.out.println("Hello "+Username);
	}

}


public class serializ {
    public static void main(String[] args)throws FileNotFoundException , IOException  {
        
    
    User user = new User();
    user.Username= "abhishek";
    user.Password="Password23";
    
    user.getmsg();
    
    
    FileOutputStream fileout = new FileOutputStream("Abhishek_info.ser") ;
    ObjectOutputStream out = new ObjectOutputStream(fileout);
    
    out.writeObject(user);
    out.close();
    fileout.close();
    
}

    
}
