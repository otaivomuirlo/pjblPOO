import java.util.ArrayList;

public class Produto extends Cadastro{
    protected ArrayList<Produto> lista = new ArrayList<>();
    private String nome;
    private double valor;
    private int estoque;


    public Produto(String nome, int estoque, double valor, int opcao, int tipo) {
        super(opcao, tipo);
        this.nome = nome;
        this.estoque = estoque;
        this.valor = valor;

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

    public int getTipo() {
        return tipo;
    }
    public int getOpcao(){
        return opcao;
    }
    public void setEstoque(int novoEstoque) {
        this.estoque = novoEstoque;
    }
}