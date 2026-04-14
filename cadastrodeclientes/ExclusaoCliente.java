
package projeto.cadastrodeclientes;

import java.util.List;
import java.util.Scanner;

public class ExclusaoCliente {
    
    public static void excluirCliente(Scanner sc){
        
        System.out.println("\n --EXCLUIR CLIENTE --");
        System.out.print("Digite o ID do cliente: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Tem certeza que deseja excluir? (S/N): ");
        String opcao = sc.nextLine();

        if(opcao.equalsIgnoreCase("S")){
            ClienteDAO.deletar(id);
            System.out.println("\n****Excluído com sucesso****\n");
        } else {
            System.out.println("\n****Operação cancelada****\n");
        }
    }
}

