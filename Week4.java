package week4;

// Download: http://www.java2s.com/Code/Jar/s/Downloadsqlitejdbc372jar.htm

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Week4 {

	public static void main(String args[]) {
		try {
//establish connection with database
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:demo.db");

			if (con != null) {
				System.out.println("Connection established");
			}
			con.close();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Some error occured");
		}
	}

	public void connectToDB() {
		try {
			// establish connection with database
			Class.forName("org.sqlite.JDBC");
			Connection con = DriverManager.getConnection("jdbc:sqlite:demo.db");
			Statement st = con.createStatement();
			// create table
			System.out.println("Create table:");
			st.executeUpdate("drop table record");
			st.executeUpdate("create table record (name text,age int)");
			// insert some records
			System.out.println("Insert some records:");
			st.executeUpdate("insert into record values('neeraj',21)");
			st.executeUpdate("insert into record values('mayank',22)");
			st.executeUpdate("insert into record values('sumit',22)");

			// reading records
			System.out.println("Reading records:");
			ResultSet rs = st.executeQuery("select * from record");
			while (rs.next()) {
				System.out.println(rs.getString("name") + " " + rs.getString("age"));
			}
			rs.close();
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}