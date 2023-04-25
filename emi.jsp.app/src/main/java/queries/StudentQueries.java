package queries;

public interface StudentQueries {
	static String INSERT_QUERY = "INSERT INTO STUDENT VALUES(?,?,?,?)";
	static String UPDATE_QUERY = "UPDATE  STUDENT SET NAME=?, FEE=?, EMAIL=? WHERE SID=?";
	static String DELETE_BY_ID = "DELETE FROM STUDENT WHERE SID=?";
	static String SELECT_ALL_QUERY = "SELECT * FROM STUDENT";
	static String FIND_BY_ID = "SELECT * FROM STUDENT WHERE SID=?";


}
