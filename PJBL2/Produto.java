import java.util.ArrayList;

public class Produto extends Cadastro{
    private ArrayList<Produto> lista = new ArrayList<>();
    protected String nome;
    protected double valor;
    protected int estoque;


    public Produto(String nome, int estoque, double valor) {
        this.nome = nome;
        this.estoque = estoque;
        this.valor = valor;

    }
    public void addProduto(Produto produto){
        lista.add(produto);
    }
    public void mostrarProdutos(){
        System.out.println("Departamento: ");
        for (Produto produto : lista) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor por Unidade: " + produto.getValor());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("================");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getEstoque() {
        return estoque;
    }

    
    public void setEstoque(int novoEstoque) {
        this.estoque = novoEstoque;
    }
}