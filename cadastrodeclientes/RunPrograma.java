
package projeto.cadastrodeclientes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class RunPrograma {
    
    public static void main(String[] args) throws IOException {
        H2Console.iniciar();
        CriarTabela.criar();
        
        Scanner sc = new Scanner(System.in);
        
        int opcao;
        do{
            System.out.println("\n------| MENU PRINCIPAL |------");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Listar clientes");
            System.out.println("3 - Editar cliente");
            System.out.println("4 - Excluir cliente");
            System.out.println("5 - Salvar e sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            
              
            
            switch (opcao){
                case 1:
                    CadastroDeClientes.executarCadastro(sc);
                    break;      
                case 2:
                    List<Cliente> cliente = ClienteDAO.listar();
                    ListagemCliente.listar(cliente);
                    break;
                case 3:
                    EdicaoCliente.editarCliente(sc);
                    break;
                case 4:
                    ExclusaoCliente.excluirCliente(sc);
                    break;
                case 5:
                    System.out.println("Encerrando programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
            
        } while (opcao != 5);

        
    }

}
