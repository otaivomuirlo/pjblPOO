import java.util.ArrayList;

public class Papelaria extends Produto{

    protected ArrayList<Papelaria> listaPapelaria = new ArrayList<>();
    protected ArrayList<Papelaria> listaEscolar = new ArrayList<>();
    protected ArrayList<Papelaria> listaDesenho = new ArrayList<>();


    public Papelaria(String nome, int estoque, double valor) {
        super(nome, estoque, valor);
    }
    public void addProdutoEscolar(Papelaria produto){
        listaEscolar.add(produto);
    }
    public void addProdutoDesenho(Papelaria produto){
        listaDesenho.add(produto);
    }
    public ArrayList<Papelaria> getListaEscolar(){
        return listaEscolar;
    }
    public ArrayList<Papelaria> getListaDesenho(){
        return listaDesenho;
    }
    @Override

    public void mostrarProdutos() {
        System.out.println();
        System.out.println("Papelaria");
        System.out.println();
        
        System.out.println("Escolar: ");
        for (Produto produto : listaEscolar) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor por Unidade: " + produto.getValor());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println();
        }

        System.out.println("Desenhos: ");
        for (Produto produto : listaDesenho) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor por Unidade: " + produto.getValor());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("================");
        }
    }
}
