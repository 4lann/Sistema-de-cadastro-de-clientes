
package projeto.cadastrodeclientes;

import java.util.List;
import java.util.Scanner;

public class EdicaoCliente {
    
    
      public static void editarCliente(Scanner sc){
          
        System.out.println("\n --EDITAR CLIENTES --\n");
      
        System.out.print("Digite o ID do cliente: ");
        int id = sc.nextInt();
        sc.nextLine();
                   
            System.out.print("Novo nome: ");
            String nome = sc.nextLine();   

            System.out.print("Novo email: ");
            String email = sc.nextLine();  

            System.out.print("Novo telefone: ");
            String telefone = sc.nextLine();
       
        
        Cliente cliente = new Cliente(id, nome, email, telefone);
       
        ClienteDAO.atualizar(cliente);

        System.out.println("\n****Dados atualizados no banco****\n");
    }
}
