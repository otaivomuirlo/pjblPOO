
public class Papelaria extends Produto {


    public Papelaria(String nome, int estoque, double valor, int tipo, int opcao) {
        super(nome, estoque, valor, tipo, opcao);
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
