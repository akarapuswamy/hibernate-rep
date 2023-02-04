package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDaoImpl;
import model.Student;

/**
 * Servlet implementation class StudentUpdateController
 */
public class StudentUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		StudentDaoImpl dao = new StudentDaoImpl();
		Student student = dao.getById(id);
		request.setAttribute("student", student);
		request.getRequestDispatcher("update.jsp").forward(request, response);

			}

		protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			double fee = Double.parseDouble(request.getParameter("fee"));
			String email = request.getParameter("email");
			Student student = new Student(id, name, fee, email);
			StudentDaoImpl dao = new StudentDaoImpl();
			dao.update(student);
			request.setAttribute("msg", "updated successfully..!");
			request.getRequestDispatcher("list").forward(request, response);

			
			
			}

}
