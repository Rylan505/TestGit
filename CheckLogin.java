package com.edsport.testCookie;

public class CheckLogin {

	 public static boolean login(String username, String password) {   
         if ("admin".equals(username) && "123456".equals(password)) {   
             return true;   
         } else {   
             return false;   
         }   
     }   
	
	
}
