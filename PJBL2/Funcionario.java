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
    public void mostrarProdutos(Papelaria p, PetShop pShop){
        p.mostrarProdutos();
        pShop.mostrarProdutos();
    }
    protected boolean reestocarProduto(String nome, ArrayList <Papelaria> listaPapelaria, ArrayList <Papelaria> listaDesenho, ArrayList<PetShop> listaRoupinhas, ArrayList <PetShop> listaBrinquedos  ) {
        boolean encontrou = false;
        System.out.println("Informe o nome do Produto que quer reestocar: ");
        String buscar = scanner.next();

        for (Produto produto : lista) {
            if (produto.getNome().equals(buscar)) {
                encontrou = true;
                System.out.println();
                System.out.println("Produto encontrado");
                System.out.println("Estoque: " + produto.getEstoque());
                System.out.println();
                System.out.println("Informe quantos itens gostaria de adicionar: ");
                int novoEstoque = scanner.nextInt();
                produto.setEstoque(produto.getEstoque() + novoEstoque);
                System.out.println("Novo estoque: " + produto.getEstoque());
                
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