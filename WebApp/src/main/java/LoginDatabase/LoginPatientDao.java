package LoginDatabase;

import java.sql.*;  

public class LoginPatientDao {  
	public static boolean validate(String name,String pass){  
		boolean status=false;  
		try{  

			Connection con = DatabaseConnection.getConnection();

			PreparedStatement ps=con.prepareStatement(  
					"select * from patient where username=? and password=?");  
			ps.setString(1,name);  
			ps.setString(2,pass);  
			      
			ResultSet rs=ps.executeQuery();  
			status=rs.next();  

			
			}catch(Exception e){System.out.println(e);}  
return status;  
}  
}  