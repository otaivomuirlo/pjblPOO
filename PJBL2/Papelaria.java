import java.util.ArrayList;

public class Papelaria extends Produto{

    protected ArrayList<Papelaria> listaPapelaria = new ArrayList<>();
    protected ArrayList<Papelaria> listaEscolar = new ArrayList<>();
    protected ArrayList<Papelaria> listaDesenho = new ArrayList<>();

    public void atualizarEstoque(int quantidadeVendida) {
        this.estoque -= quantidadeVendida;
    }
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
        
        System.out.println("Departamento Escolar: ");
        for (Papelaria produto : listaEscolar) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor por Unidade: " + produto.getValor());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println();
        }

        System.out.println("Departamento de Desenhos: ");
        for (Papelaria produto : listaDesenho) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor por Unidade: " + produto.getValor());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("================");
        }
    }
}
