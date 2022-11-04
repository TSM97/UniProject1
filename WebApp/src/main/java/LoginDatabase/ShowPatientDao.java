package LoginDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import MainPackage.Patient;

public class ShowPatientDao {


	private static final Patient Patient = null;

	public static Patient Show(String username){  
		String AMKA = null,name = null,surname = null,password = null;
		try{  

			Connection con = DatabaseConnection.getConnection();

			PreparedStatement ps=con.prepareStatement(  
					"select * from patient where username=?");  
			ps.setString(1,username);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				
				 name=rs.getString(1);
				 surname=rs.getString(2);
				 password=rs.getString(4);	
				 AMKA=rs.getString(5);
			}
			 Patient Patient=new Patient(AMKA,name,password,username,surname);
			 
			return Patient;
			}catch(Exception e){System.out.println(e);}
		return null;
		
		
} 
	
	
}
