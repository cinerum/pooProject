package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

import connection.ConnectionJDBC;
import entities.Aluno;

public class insert {
	public static void main(String[] args) throws Exception {

	public String cadastrarUsuario(Aluno us) {
   		try {
   			conectar();
       		String query = "INSERT INTO ALUNO (PESO, ALTURA, DATA_MATRICULA, COD_PESSOA) VALUES ('" +
       						us.getCodigo_Pessoa() + "', '" + us.getPeso() + "', '" + us.getAltura()) + "');";
   		    PreparedStatement inserir = conexao.prepareStatement(query);
   		    inserir.executeUpdate();
   		    desconectar();
   		    return ("\n Insercao realizada com sucesso!!!\n");
   		}
   		catch(Exception erro) {
   			return ("- Erro " + erro.getMessage());

    }
}
