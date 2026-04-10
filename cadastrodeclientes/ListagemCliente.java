
package projeto.cadastrodeclientes;
import java.util.List;

public class ListagemCliente {
    
    public static void listar(List<Cliente> clientes){
        
        System.out.println("\n --LISTA CADASTRADA DE CLIENTES --");
        
        if(clientes.isEmpty()){
            System.out.println("Nenhum cliente cadastrado");
        } else{
            
        for(Cliente listagem : clientes){
            System.out.println(listagem);
         }
        }    
        
    }
    
}
