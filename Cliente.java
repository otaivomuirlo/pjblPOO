import java.util.ArrayList;

public class Cliente extends Pessoas {
    protected ArrayList<Cliente> listaClientes = new ArrayList<>();
    protected int idade;
    

    public Cliente(String nome, String CPF, int idade,ArrayList<Cliente> listaClientes ) {
        super(nome, CPF, idade);
        this.listaClientes = listaClientes;
        
    }
    public void addCliente(Cliente c){
        listaClientes.add(null);
    }
    public void mostrarProdutos(Papelaria p){
        p.mostrarProdutos();
    }
    
}
