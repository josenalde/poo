import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {
	    private static String PGSQL_DB = "jdbc:postgresql://localhost/dbproducts"; //consider there is a dbproducts
		private static String PGSQL_USERNAME = "postgres";
		private static String PGSQL_PASSWORD = "postgresql";
		/*
		private static String PGSQL_DB = System.getenv("PGSQL_DB");
		private static String PGSQL_USERNAME = System.getenv("PGSQL_USERNAME");
		private static String PGSQL_PASSWORD = System.getenv("PGSQL_PASSWORD");
		*/
	
	public ConnectDB() {
		
	}

	public void connect_and_list() {
		try(Connection connection = DriverManager.getConnection(PGSQL_DB, PGSQL_USERNAME, PGSQL_PASSWORD);) {
			if (connection != null) {
				System.out.println("OK...connected to database...");
				//list
				Statement sqlSt = connection.createStatement();
				String query = "SELECT * from tbproducts";
				ResultSet rset = sqlSt.executeQuery(query);
				while (rset.next()) {
					System.out.println(rset.getString("name") + "," + rset.getInt("quantity") + "," + rset.getDouble("value"));
				}
				//other sql commands INSERT/ADD
				//String insertQuery = "INSERT INTO tbproducts (name,quantity,value) VALUES ('Celular samsung', 50, 1500.99)";
				//sqlSt.executeUpdate(insertQuery);
				
				//DELETE	
				//String deleteQuery = "DELETE FROM tbproducts WHERE nome LIKE 'Celular%'";
			    //sqlSt.executeUpdate(deleteQuery);
			} else 
				System.out.println("Failed to connect...");
		} catch(SQLException e) {
			e.printStackTrace();
		}	
	}	
}




