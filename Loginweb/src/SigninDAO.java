import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SigninDAO {

	@SuppressWarnings("static-access")
	public String register(PersonDTO person) throws ClassNotFoundException, SQLException{
	CommonDAO commonDAO = CommonDAO.getobject();
	Connection con = null;
	PreparedStatement psmt = null;
	con = commonDAO.getconnection();
		if(con == null){
			return "error";
		}	
	long d =  Long.parseLong(person.getDob());	
	Date date = new Date(d);
	psmt = con.prepareStatement(SqlQuery.REGISTER_SQL);
	psmt.setString(0,person.getUsername());
	psmt.setString(1,person.getEmail());
	psmt.setDate(2,date);
	psmt.setDouble(3, person.getPhn_no());
	psmt.setString(4,person.getPwd());
	int recordEffected = psmt.executeUpdate();
	if(recordEffected>0){
		psmt.close();
		con.close();
		return "sucess";
	}
	else
	{
		psmt.close();
		con.close();
		return "fail";
	}

	
  }
}
