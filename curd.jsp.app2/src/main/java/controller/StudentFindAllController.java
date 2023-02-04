package controller;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDaoImpl;
import model.Student;


public class StudentFindAllController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		StudentDaoImpl dao = new StudentDaoImpl();
//		List<Student> students = dao.getAllStudent();
//		request.setAttribute("list", students);
//		request.getRequestDispatcher("sms-list.jsp").forward(request, response);
//
//	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   StudentDaoImpl d=new StudentDaoImpl();
  List<Student> x= d.getAllStudent();
  req.setAttribute("pp", x);
  req.getRequestDispatcher("sms-list.jsp").forward(req, resp);
	
	
	}
	
	


}
