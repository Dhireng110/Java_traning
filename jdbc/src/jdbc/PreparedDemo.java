package jdbc;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedDemo {

	public static void main(String[] args) {
		String sql = "insert into product values(?,?,?)";
		Connection conn = null;
		try {
			conn = JdbcUtil.getConnection();
			//PreparedStatement stmt = conn.prepareStatement(sql);
			Statement stmt1 = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
			ResultSet rs = stmt1.executeQuery("select * from product");
			/*
			 * stmt.setInt(1, Integer.parseInt(args[0])); stmt.setString(2, args[1]);
			 * stmt.setDouble(3, Double.parseDouble(args[2])); stmt.executeUpdate();
			 * System.out.println("Record Inserted");
			 */
			//for(int i=0;i<rs.getFetchSize();i++)
			while(rs.next())
			System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
