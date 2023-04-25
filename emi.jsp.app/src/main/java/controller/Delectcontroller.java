package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDaoImpl;
import model.Student;

/**
 * Servlet implementation class Delectcontroller
 */
public class Delectcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		  StudentDaoImpl dao = new StudentDaoImpl();
		  dao.delete(id);
		  request.setAttribute("msg", "delect succesfully");
		  request.getRequestDispatcher("list").forward(request, response);
			}
}
