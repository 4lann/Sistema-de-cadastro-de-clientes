

package projeto.cadastrodeclientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import projeto.cadastrodeclientes.Cliente;
import projeto.cadastrodeclientes.Conexao;

public class ClienteDAO {

    public static void inserir(Cliente cliente) {

        String sql = "INSERT INTO cliente (nome, email, telefone) VALUES (?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getEmail());
            stmt.setString(3, cliente.getTelefone());

            stmt.executeUpdate();

            System.out.println("Cliente salvo no banco!");

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
       
    }
    public static List<Cliente> listar() {

    List<Cliente> clientes = new ArrayList<>();
    String sql = "SELECT * FROM cliente";

    try (Connection conn = Conexao.conectar();
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(sql)) {

        while (rs.next()) {
            Cliente c = new Cliente(
                rs.getInt("id"),
                rs.getString("nome"),
                rs.getString("email"),
                rs.getString("telefone")
            );
            clientes.add(c);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return clientes;
   }
    public static void atualizar(Cliente cliente) {

    String sql = "UPDATE cliente SET nome=?, email=?, telefone=? WHERE id=?";

    try (Connection conn = Conexao.conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, cliente.getNome());
        stmt.setString(2, cliente.getEmail());
        stmt.setString(3, cliente.getTelefone());
        stmt.setInt(4, cliente.getId());

        stmt.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
    }
  }
    
    public static void deletar(int id) {

    String sql = "DELETE FROM cliente WHERE id=?";

    try (Connection conn = Conexao.conectar();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setInt(1, id);
        stmt.executeUpdate();

    } catch (Exception e) {
        e.printStackTrace();
    }
  }
}

