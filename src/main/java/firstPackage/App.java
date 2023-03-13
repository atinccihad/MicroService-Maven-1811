package firstPackage;

import java.io.ObjectInputFilter.Config;
import java.util.ResourceBundle;

public class App {
	
	public int userLogin(String username,String password) {
		
		ResourceBundle rBundle = ResourceBundle.getBundle("config");
		
		String actualUsername = rBundle.getString("username");
		
		 String actualPassword = rBundle.getString("password");
		 
		 if(actualUsername.equals(username) && actualPassword.equals(password)) {
			 return 1;
		 }else {
			return 0;
		}
	}

}
