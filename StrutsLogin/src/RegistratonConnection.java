

import java.sql.*;  
public class RegistratonConnection {  
  
public static int save(RegistrationAction r){  
int status=0;  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/Registrations","username","pass");  
  
PreparedStatement ps=con.prepareStatement("insert into strutsuser values(?,?,?,?,?,?)");  
ps.setString(2,r.getName());  
ps.setString(1,r.getRollnumber());  
ps.setString(4,r.getEmail());  
ps.setString(5,r.getGender());  
ps.setString(3,r.getMobilenumber());  
ps.setString(6,r.getEvent());  
          
status=ps.executeUpdate();  
  
}catch(Exception e){e.printStackTrace();}  
    return status;  
}  
}  
