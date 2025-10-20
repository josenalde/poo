import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectDB {

	private String url;
	private String user;
	private String password;
	
	public ConnectDB(String url, String user, String password) {
		super();
		this.url = url;
		this.user = user;
		this.password = password;
	}



	public void connect_and_list() {
		try(Connection connection = DriverManager.getConnection(url, user, password);) {
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



