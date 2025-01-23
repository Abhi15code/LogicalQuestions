package desirileze;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class Deserialize {
    public static void main(String[] args) throws IOException, FileNotFoundException,ClassNotFoundException{
		
		User user  = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\abhis\\Desktop\\Abhishek_info.ser");
		ObjectInputStream In = new ObjectInputStream(fileIn);
		user = (User) In.readObject();
		
		user.getmsg();
		fileIn.close();
			In.close();
		
		
	}
}
