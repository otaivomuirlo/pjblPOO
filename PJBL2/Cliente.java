import java.util.ArrayList;
import java.util.InputMismatchException;

public class Cliente extends Pessoas {
    protected ArrayList<Cliente> listaClientes = new ArrayList<>();
    protected int idade;
    

    public Cliente(String nome, String CPF, int idade) {
        super(nome, CPF, idade);
        
    }

    public void addCliente(Cliente c){
        listaClientes.add(null);
    }
    public void mostrarProdutos(Papelaria p, PetShop pShop){
        p.mostrarProdutos();
        pShop.mostrarProdutos();
    }


    protected boolean comprar(String nome, ArrayList <Papelaria> listaEscolar,ArrayList <Papelaria> listaDesenho, ArrayList<PetShop> listaRoupinhas, ArrayList <PetShop> listaBrinquedos ) {
            
        boolean encontrou = false;
        System.out.println("Informe o nome do Produto que gostaria de adicionar ao carrinho: ");
        String buscar = scanner.next();

        for (Papelaria produto : listaEscolar) {
            if (produto.getNome().equalsIgnoreCase(buscar)) {
                encontrou = true;
                System.out.println();
                System.out.println("Produto encontrado");
                System.out.println("Estoque: " + produto.getEstoque());
                System.out.println();
                System.out.println("Informe quantos itens gostaria de adicionar: ");
                int qtde = scanner.nextInt();
                double preco = qtde * produto.getValor();
                System.out.println("Preco total: R$" + preco);
                try {
                    System.out.println("Insira o valor da compra: ");
                    double pagamento = scanner.nextDouble();

                    if (pagamento == preco) {
                        System.out.println("Pagamento efetuado");
                        produto.atualizarEstoque(qtde);

                    } else {
                        System.out.println("Pagamento inválido. O valor inserido não corresponde ao preço total.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Valor de pagamento inválido.");
                    scanner.next();
                }
                
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
