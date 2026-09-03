package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FoodDao;
import model.OrderDao;

/**
 * Servlet implementation class OrderServe
 */
@WebServlet("/OrderServe")
public class OrderServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String fid=request.getParameter("fid");
		String uname=request.getParameter("uname");
		double qty=Double.parseDouble(request.getParameter("qty")); 
		OrderDao odao=new OrderDao();
		odao.insertData(fid, qty, uname);
		response.sendRedirect("Success.jsp");
	}

}
