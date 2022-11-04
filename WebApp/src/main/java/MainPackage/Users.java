package MainPackage;

public class Users {

	public String username;
	public static String password;
	public static String name;
	public static String surname;
	public static int UsersCounter=0;
	
	public Users(String username,String password,String name,String surname) {
		
		this.username=username;
		this.password=password;
		this.name=name;
		this.surname=surname;
		UsersCounter++;
		
	}
	public Users() {}
	
    public static void login(){
		
	};
    public static void logout(){
		
	};
	
	//setters
	public void setUsername(String username) {
		this.username=username;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSurname(String surname) {
		this.surname=surname;
	}
	
	//getters
	public String getUsername(String username) {
    	return this.username;
    }
	public String getpassword(String password) {
    	return this.password;
    }
	public String getName(String name) {
    	return this.name;
    }
	public String getSurname(String surname) {
    	return this.surname;
    }

}


