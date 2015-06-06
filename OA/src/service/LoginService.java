package service;

public class LoginService {
	
	public boolean checked(String username,String password) {
		if(username.equals("admin")&&password.equals("admin")) {
			return true;
		}
		return false;
	}
	
}
