package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDaoImpl;
import model.Student;

/**
 * Servlet implementation class StudentsaveController
 */
public class StudentsaveController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		double fee = Double.parseDouble(request.getParameter("fee"));
		String email = request.getParameter("email");
		Student student=new Student(id, name, fee, email);
		StudentDaoImpl dao = new StudentDaoImpl();	
		dao.save(student);
		request.getRequestDispatcher("list").forward(request, response);
	}

}
