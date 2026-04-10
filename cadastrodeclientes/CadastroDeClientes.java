
package projeto.cadastrodeclientes;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroDeClientes {
    
        public static void executarCadastro( Scanner sc){
        
        System.out.print("Quantos clientes vao ser cadastrados? ");
        int quantCliente = sc.nextInt();
        sc.nextLine();
        
        for(int i = 0; i < quantCliente; i++){
        System.out.println("\n   --Dados do "+ (i+1)+" cliente--");
        System.out.print("\nDigite o NOME do cliente: ");
        
        String nomeCliente = sc.nextLine();
        
        System.out.print("Digite o EMAIL do cliente: ");
        String emailCliente = sc.nextLine();
        
        System.out.print("Digite o TELEFONE do cliente: ");
        String telefoneCliente = sc.nextLine();
        
        System.out.println("\n****Cadastro realizado com sucesso****");
        

        Cliente cliente01 = new Cliente(0, nomeCliente, emailCliente, telefoneCliente);

        ClienteDAO.inserir(cliente01);
      }
   }
}
