

import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Communicate extends HttpServlet {
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			PersonDTO person = new PersonDTO();
			person.setUsername(request.getParameter("user"));
			person.setDob(request.getParameter("dob"));
			person.setEmail(request.getParameter("email"));
			String str = request.getParameter("phn");
			double i = Double.parseDouble(str); 
			person.setPhn_no(i);
			person.setPwd(request.getParameter("pwd"));
			SigninDAO signin = new SigninDAO();
			String result = null;
			try {
				result = signin.register(person);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			RequestDispatcher rd = null;
			if(result.equals("sucess")){
				response.sendRedirect("sucess.jsp");
			}
			else if(result.equals("error")){
			  result = null;
			  rd = request.getRequestDispatcher("form.jsp");
				rd.forward(request, response);
			}
			else{
				rd = request.getRequestDispatcher("form.jsp");
				rd.forward(request, response);
			}
			
	}

}
