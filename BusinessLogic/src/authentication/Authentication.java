/***************************************************************************************************
 This package is used in user authentication.
 Format:
 ID | Password
 Copyright 2015 Razor TeamB in Ajou univ, All right reserved
 ***************************************************************************************************/

package authentication;

public class Authentication {
	private String Id = null;
	private String Password = null;
	
	public void setId(String id){
		this.Id = id;
	}//ID
	public void setPassword(String password){
		this.Password = password;
	}//Password
}
