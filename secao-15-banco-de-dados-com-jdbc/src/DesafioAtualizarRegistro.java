import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarRegistro {
	
	public static void main(String[] args) throws SQLException {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o código:");
	    int codigo = scanner.nextInt();
	    
	    Connection conexao = FabricaConexao.getConexao();
	    String sql = "SELECT * FROM pessoas WHERE codigo = ?";
	    PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery();
        
        if (resultado.next()) {
        	Pessoa pessoa = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));
        	System.out.println("Código: "+ pessoa.getCodigo());
        	System.out.println("Nome: "+pessoa.getNome());
        }
		
		stmt.close();
		conexao.close();
		scanner.close();
	}
}
