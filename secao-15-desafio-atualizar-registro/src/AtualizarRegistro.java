import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AtualizarRegistro {
    
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
            System.out.println("Código: " + pessoa.getCodigo());
            System.out.println("Nome: " + pessoa.getNome());
            
            System.out.println("Informe o novo nome:");
            scanner.nextLine();
            String novoNome = scanner.nextLine();
            
            sql = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, novoNome);
            stmt.setInt(2, codigo);
            int linhasAfetadas = stmt.executeUpdate();
            
            if (linhasAfetadas > 0) {
                System.out.println("Nome atualizado com sucesso.");
            } else {
                System.out.println("Erro ao atualizar o nome.");
            }
            
            stmt.close();
        } else {
            System.out.println("Registro não encontrado.");
        }
        
        stmt.close();
        conexao.close();
        scanner.close();
    }
}
