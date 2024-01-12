package JDBCfirst;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;


public class JDBCfirst {

	public static void main(String[] args) {

		try {
			Class.forName("org.postgresql.Driver");
			Connection c=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/cms","postgres","1234");
//			String query="insert into category(title,created)values('Bilgisayar','"+(new Timestamp(System.currentTimeMillis()))+"')";
			Statement st=c.createStatement();
			String query ="select * from category";
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.err.println("Kategori:" + rs.getLong("id")+","+rs.getString("title")+","+rs.getTimestamp("created"));
				
			}
			System.err.println("Sorgu :"+ query);
//			int r=st.executeQuery(query);
			
		} catch (Exception ex) {
			System.err.println(ex.getMessage()); ;
		}

	}

}
