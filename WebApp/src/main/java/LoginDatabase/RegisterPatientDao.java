package LoginDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterPatientDao {
	public static void Register(String name,String surname,String username,String pass,String AMKA){  
		boolean status=false;  
		try{  

			Connection con = DatabaseConnection.getConnection();

			PreparedStatement ps=con.prepareStatement(  
					"insert into patient values(?, ?, ?, ?, ?)");  
			ps.setString(1,name);  
			ps.setString(2,surname);  
			ps.setString(3,username);  
			ps.setString(4,pass);  
			ps.setString(5,AMKA);  

			
			int rs=ps.executeUpdate();  
			          
			}catch(Exception e){System.out.println(e);}  
return ;  
}  
}
