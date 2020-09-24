package basicProgram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleToMysql {

	public static void main(String[] args) throws SQLException  {
		int count=0;
		Connection con1 = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","tiger");
		Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","Shailesh@7865");
		Statement st1 = con1.createStatement();
		Statement st2 = con2.createStatement();
		ResultSet rs = st1.executeQuery("select * from dept ");
			 
		while(rs.next())
		{
			count++;
			/*int empno =rs.getInt(1);
			String ename=rs.getString(2);
			String job=rs.getString(3);
			int mgr=rs.getInt(4);
			
			int sal=rs.getInt(5);
			int comm=rs.getInt(6);
			int deptno=rs.getInt(7); 
			String sqlQuery = String.format("insert into emp values(%d,'%s','%s',%d,%d,%d,%d)",empno,ename,job,mgr,sal,comm,deptno); */
			int deptno=rs.getInt(1); 
			String dname=rs.getString(2);
			String loc=rs.getString(3);
			String sqlQuery = String.format("insert into dept values(%d,'%s','%s')",deptno,dname,loc);
			st2.executeUpdate(sqlQuery);
		}
		System.out.println("Total data copy from oracle to mysql and no. of records:"+count);
		con1.close();
		con2.close(); 

	}

}
