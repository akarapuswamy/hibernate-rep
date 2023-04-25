package Util;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class ConnectionUtil {
	static Connection con = null;
	static Properties pro = null;
	
	static {
		pro = new Properties();
		try {
			pro = new Properties();
			pro.load(ConnectionUtil.class.getClassLoader().getResourceAsStream("connectionUtil/db.properties"));
			try {
				Class.forName(pro.getProperty("driver"));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
				
		
	
	
	public static Connection getConnection() {
		try {
			con=(Connection) DriverManager.getConnection(pro.getProperty("url")
					,pro.getProperty("user")
					,pro.getProperty("password"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;	
	}
	
	public static void closeconnection( Statement statement ) {
		if(statement !=null)
			try {
				statement.close();
				closeconnection(statement);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	public static void closeconnection(ResultSet rs,Statement statement) {
		
		try {
			if(rs !=null)
				closeconnection(statement);
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
		
	public static void main(String[] args) {
		System.out.println(getConnection());
//		System.out.println(con);
	}
	}
