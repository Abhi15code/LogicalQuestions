package desirileze;

import java.io.Serializable;

public class User implements Serializable{
    String Username ;
	String Password;
	
	public void getmsg() {
		System.out.println("Hello "+Username);
	}

}
