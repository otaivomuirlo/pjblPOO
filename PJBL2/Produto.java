

public class Produto extends Cadastro {
    private String nome;
    private double valor;
    private int estoque;
    private int tipo; 
    private int opcao;

    public Produto(String nome, int estoque, double valor, int tipo, int opcao) {
        this.nome = nome;
        this.estoque = estoque;
        this.valor = valor;
        this.tipo = tipo;
        this.opcao = opcao;
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
}