import java.util.ArrayList;

public class Estoque {
    protected ArrayList<Produto> lista = new ArrayList<>();
    protected ArrayList<Papelaria> listaPapelaria = new ArrayList<>();
    protected ArrayList<Cliente> listaClientes = new ArrayList<>();


    public void adicionarProduto(Papelaria papel, ArrayList<Papelaria> listaPapelaria) {
        listaPapelaria.add(papel);
    }

    public void mostrarProdutos(Pessoas g, Papelaria p){
        if(g instanceof Gerente){
            p.mostrarProdutos();
        }
        else{
            System.out.println("Acesso negado");
        }
    }
}