package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import dao.empdao;
import dto.emp;
@WebServlet("/p")
public class Fetchall extends GenericServlet{
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		empdao e1=new empdao();
		List<emp>l1=e1.fetchall();
		
		arg0.setAttribute("d",l1);
		RequestDispatcher r=arg0.getRequestDispatcher("a.jsp");
		r.forward(arg0, arg1);
		
	}

}
