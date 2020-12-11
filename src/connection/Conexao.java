package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class Conexao {
	
public static void main(String[] args) {
		
		try {
			// MySQL
			 String url = "jdbc:mysql://localhost:3306/db_unitaulas?serverTimezone=UTC";
			
			// SqlServer
//			String url = 	"jdbc:sqlserver://localhost:1433;databaseName=pooproject";

			// Cria o objeto com a conexão com o BD
			Connection conexao = DriverManager.getConnection(url, "sa", "RPSsql12345");
			
			// Cria o objeto com a instrução SQL
 			PreparedStatement pesquisa = conexao.prepareStatement("SELECT * FROM PESSOA");

 			// Cria um objeto com o conjunto de resultados de uma tabela 
			ResultSet resultado = pesquisa.executeQuery();
			
			while (resultado.next()) {
				String nome = resultado.getString("nome");
				String email = resultado.getString("email");
				System.out.println("Nome: "+nome+" email: "+email);
			}	
			conexao.close();
		}
		catch (SQLException ex) {
			System.out.println("SQLException : " + ex.getMessage());
			System.out.println("SQLState     : " + ex.getSQLState());
			System.out.println("VendorError  : " + ex.getErrorCode());
		}
		catch(Exception erro) {
			System.out.println("Erro " + erro.getMessage());
		}

	}



}
