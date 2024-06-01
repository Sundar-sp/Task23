package task23;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySql {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "test");
		Statement statement = con.createStatement();

		statement.execute("CREATE TABLE `employee`.`empbasicdetails` (\r\n" + "  `empcode` INT NOT NULL,\r\n"
				+ "  `empname` VARCHAR(45) NULL,\r\n" + "  `empage` INT NULL,\r\n" + "  `esalary` DOUBLE NULL,\r\n"
				+ "  PRIMARY KEY (`empcode`));");

		statement.execute("INSERT INTO empbasicdetails (empcode, empname, empage, esalary)\r\n"
				+ "VALUES (101, \"Jenny\", 25, 10000);");

		statement.execute("INSERT INTO empbasicdetails (empcode, empname, empage, esalary)\r\n"
				+ "VALUES (102, \"Jacky\", 30, 20000);");

		statement.execute("INSERT INTO empbasicdetails (empcode, empname, empage, esalary)\r\n"
				+ "VALUES (103, \"Joe\", 20, 40000);");

		statement.execute("INSERT INTO empbasicdetails (empcode, empname, empage, esalary)\r\n"
				+ "VALUES (104, \"John\", 40, 80000);");

		statement.execute("INSERT INTO empbasicdetails (empcode, empname, empage, esalary)\r\n"
				+ "VALUES (105, \"Shameer\", 25, 90000);");

		ResultSet result = statement.executeQuery("SELECT * FROM empbasicdetails;");

		while (result.next()) {
			System.out.print(result.getString(1) + " ");
			System.out.print(result.getString(2) + " ");
			System.out.print(result.getString("empage") + " ");
			System.out.println(result.getString("esalary") + " ");
		}

	}

}

Output:
101 Jenny 25 10000.0 
102 Jacky 30 20000.0 
103 Joe 20 40000.0 
104 John 40 80000.0 
105 Shameer 25 90000.0 
