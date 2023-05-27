package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Empdao;
import dto.Empdto;
@WebServlet("/login")
public class Login extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		
		String email=req.getParameter("emailid");
		String pwd = req.getParameter("pwd");
		int fpwd =Integer.parseInt(pwd);
		
		Empdao d1= new Empdao();
		Empdto e1=d1.login(email);
		if(e1!=null) 
		{
			if(e1.getPwd()==fpwd)
			{
				resp.getWriter().print("<h1>Welcome to home Page</h1>");
			}else {
				resp.getWriter().print("<h1>Enter Correct Password</h1>");
			}
		}else {
			resp.getWriter().print("<h1>Account Not Found,Please SignUp</h1>");
		}
	}

}
