package contr_emp_func.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try {
			return DriverManager.getConnection(
					"jdbc:derby:cooperalfa;create=true;upgrade=true","root","");
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
