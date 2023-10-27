import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoas{
    Scanner scanner = new Scanner(System.in);
    protected ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    
    public Funcionario(String nome, String CPF, int idade){
        super(nome, CPF, idade);
    }
    public void addFuncionario(Funcionario f){
        listaFuncionarios.add(f);
    }
    public void mostrarProdutos(Papelaria p){
        p.mostrarProdutos();
    }
    protected boolean reestocarProduto(String nome, ArrayList <Papelaria> listaPapelaria, ArrayList<Produto> lista ) {
        boolean encontrou = false;
        System.out.println("Informe o nome do Produto que quer reestocar: ");
        String buscar = scanner.next();

        for (Produto p : lista) {
            if (p.getNome().equals(buscar)) {
                encontrou = true;
                System.out.println();
                System.out.println("Produto encontrado");
                System.out.println("Estoque: " + p.getEstoque());
                System.out.println();
                System.out.println("Informe quantos itens gostaria de adicionar: ");
                int novoEstoque = scanner.nextInt();
                p.setEstoque(p.getEstoque() + novoEstoque);
                System.out.println("Novo estoque: " + p.getEstoque());
                
            }
        }
        
        if (!encontrou) {
            System.out.println();
            System.out.println("Produto nao encontrado.");
            System.out.println();
        }
        return encontrou;
    }
}    