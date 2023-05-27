package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Empdao;
import dto.Empdto;

@WebServlet("/signup")
public class EmpSignUp extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String email=req.getParameter("email");
		String name=req.getParameter("name");
	    String pwd=req.getParameter("pwd");
		int pwd1=Integer.parseInt(pwd);
		
		Empdto d1=new Empdto();
		d1.setEmail(email);
		d1.setName(name);
		d1.setPwd(pwd1);
		
		Empdao d2=new Empdao();
		String msg=d2.insert(d1);
		resp.getWriter().print(msg);
	}

}
