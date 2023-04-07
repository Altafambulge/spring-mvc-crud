package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.empdao;
import dto.emp;
@WebServlet("/Servlet1")
public class Servlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		String s1=req.getParameter("name");
		String s2=req.getParameter("role");
		String s3=req.getParameter("email");
		String s4=req.getParameter("password");
		emp e=new emp();
		e.setName(s1);
		e.setRole(s2);
		e.setEmail(s3);
		e.setPassword(s4);
		
		empdao e1=new empdao();
		e1.insert(e);
		
	}

}
