

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SearchTry extends HttpServlet {
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userid = request.getParameter("userid");
        String pwd = request.getParameter("pwd");
		request.setAttribute("userid",userid);
		request.setAttribute("pwd",pwd);
		RequestDispatcher rd = request.getRequestDispatcher("start.jsp");
		if(userid.equals(pwd)){
		  pwd = null;
		  userid = null;
		}
		rd.forward(request, response);
	}

}
