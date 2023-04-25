package dao;

import java.lang.System.Logger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Util.ConnectionUtil;
import model.Student;
import queries.StudentQueries;

public class StudentDaoImpl implements StudentDAO {
	
	private static Connection connection = null;
	private static PreparedStatement ps = null;
	private static ResultSet rs = null;


	public void save(Student student) {
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(StudentQueries.INSERT_QUERY);
			ps.setInt(1, student.getId());
			ps.setString(2, student.getName());
			ps.setDouble(3, student.getFee());
			ps.setString(4, student.getEmail());
			int result = ps.executeUpdate();
			System.out.println("inserted " + result + " row");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	public void update(Student student) {
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(StudentQueries.UPDATE_QUERY);
			ps.setString(1, student.getName());
			ps.setDouble(2, student.getFee());
			ps.setString(3, student.getEmail());
			ps.setInt(4, student.getId());
			int result = ps.executeUpdate();
			System.out.println(" updated " + result + " row");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

		
	

	public List<Student> getAllStudent(Statement Statement) {
		List<Student> students = new ArrayList<Student>();
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(StudentQueries.SELECT_ALL_QUERY);
			rs = ps.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt(1));
				student.setName(rs.getString(2));
				student.setFee(rs.getDouble(3));
				student.setEmail(rs.getString(4));
				students.add(student);
			}
			return students;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ConnectionUtil.closeconnection(rs, Statement);
		return null;
	}

	public int delete(int id) {
		try {
			connection = ConnectionUtil.getConnection();
			ps = connection.prepareStatement(StudentQueries.DELETE_BY_ID);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return id;

	}

	public Student getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public Student getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
