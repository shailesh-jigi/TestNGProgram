package basicProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Program1 {

	public static void main(String[] args) throws SQLException {
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select empno,ename from emp");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"  "+rs.getString(2));
		}
		con.close();
		

	}

}
