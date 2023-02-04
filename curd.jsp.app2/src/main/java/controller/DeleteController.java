package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDaoImpl;

/**
 * Servlet implementation class DeleteController
 */
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		StudentDaoImpl dao = new StudentDaoImpl();
		dao.delete(id);
		request.setAttribute("msg", "deleted successfully..!");
		request.getRequestDispatcher("list").forward(request, response);

			}

}
