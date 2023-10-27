import java.util.ArrayList;

public class Papelaria extends Produto{
    protected ArrayList<Papelaria> listaEscolar = new ArrayList<>();
    protected ArrayList<Papelaria> listaDesenho = new ArrayList<>();


    public Papelaria(String nome, int estoque, double valor, int tipo, int opcao, ArrayList<Papelaria> listaEscolar, ArrayList<Papelaria> listaDesenho) {
        super(nome, estoque, valor, tipo, opcao);
        this.listaEscolar = listaEscolar;
        this.listaDesenho = listaDesenho;
    }
    @Override
    public void mostrarProdutos() {
        System.out.println("================");
        System.out.println("Departamento Escolar: ");
        for (Papelaria produto : listaEscolar) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor por Unidade: " + produto.getValor());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println();
        }
        System.out.println("================");
        System.out.println("Departamento de Desenhos: ");
        for (Papelaria produto : listaDesenho) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor por Unidade: " + produto.getValor());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("================");
        }
    }
}
