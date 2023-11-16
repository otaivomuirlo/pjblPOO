import java.util.ArrayList;
import java.util.InputMismatchException;

public class Cliente extends Pessoas {
    protected ArrayList<Cliente> listaClientes = new ArrayList<>();
    

    public Cliente(String nome, String CPF, int idade) {
        super(nome, CPF, idade);
        
    }

    public void addCliente(Cliente c){
        listaClientes.add(c);
    }
    public void mostrarProdutos(Produto pr){
        pr.mostrarProdutos();
    }

    protected boolean comprar(ArrayList <Papelaria> listaEscolar,ArrayList <Papelaria> listaDesenho, ArrayList<PetShop> listaRoupinhas, ArrayList <PetShop> listaBrinquedos) {
        boolean encontrou = false;
    
        System.out.println("Informe o nome do Produto que gostaria de adicionar ao carrinho: ");
        String buscar = scanner.next();
    
        for (Papelaria produto : listaEscolar) {
            if (produto.getNome().equalsIgnoreCase(buscar)) {
                double preco;
                encontrou = true;
                System.out.println();
                System.out.println("Produto encontrado");
                System.out.println("Estoque: " + produto.getEstoque());
                System.out.println();
                System.out.println("Informe quantos itens gostaria de adicionar ao carrinho: ");
                int qtde = scanner.nextInt();
                
                if (qtde > produto.getEstoque()) {
                    System.out.println("Ação inválida. Quantidade desejada maior que o estoque disponível.");
                    break;
                } else {
                    preco = qtde * produto.getValor();
                    System.out.println("Preço total: R$" + preco);
                }
    
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
                    System.out.println("Valor de pagamento inválido. Insira um valor numérico.");
                    scanner.next(); 
                }
            }
        }
        for (Papelaria produto : listaDesenho) {
            if (produto.getNome().equalsIgnoreCase(buscar)) {
                double preco;
                encontrou = true;
                System.out.println();
                System.out.println("Produto encontrado");
                System.out.println("Estoque: " + produto.getEstoque());
                System.out.println();
                System.out.println("Informe quantos itens gostaria de adicionar ao carrinho: ");
                int qtde = scanner.nextInt();
                
                if (qtde > produto.getEstoque()) {
                    System.out.println("Ação inválida. Quantidade desejada maior que o estoque disponível.");
                    break;
                } else {
                    preco = qtde * produto.getValor();
                    System.out.println("Preço total: R$" + preco);
                }
    
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
                    System.out.println("Valor de pagamento inválido. Insira um valor numérico.");
                    scanner.next(); 
                }
            }
        }
        for (PetShop produto : listaRoupinhas) {
            if (produto.getNome().equalsIgnoreCase(buscar)) {
                double preco;
                encontrou = true;
                System.out.println();
                System.out.println("Produto encontrado");
                System.out.println("Estoque: " + produto.getEstoque());
                System.out.println();
                System.out.println("Informe quantos itens gostaria de adicionar ao carrinho: ");
                int qtde = scanner.nextInt();
                
                if (qtde > produto.getEstoque()) {
                    System.out.println("Ação inválida. Quantidade desejada maior que o estoque disponível.");
                    break;
                } else {
                    preco = qtde * produto.getValor();
                    System.out.println("Preço total: R$" + preco);
                }
    
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
                    System.out.println("Valor de pagamento inválido. Insira um valor numérico.");
                    scanner.next(); 
                }
            }
        }
        for (PetShop produto : listaBrinquedos) {
            if (produto.getNome().equalsIgnoreCase(buscar)) {
                double preco;
                encontrou = true;
                System.out.println();
                System.out.println("Produto encontrado");
                System.out.println("Estoque: " + produto.getEstoque());
                System.out.println();
                System.out.println("Informe quantos itens gostaria de adicionar ao carrinho: ");
                int qtde = scanner.nextInt();
                
                if (qtde > produto.getEstoque()) {
                    System.out.println("Ação inválida. Quantidade desejada maior que o estoque disponível.");
                    break;
                } else {
                    preco = qtde * produto.getValor();
                    System.out.println("Preço total: R$" + preco);
                }
    
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
                    System.out.println("Valor de pagamento inválido. Insira um valor numérico.");
                    scanner.next(); 
                }
            }
        }
        if(!encontrou){
            System.out.println();
            System.out.println("Produto não encontrado.");
            } 
        return encontrou;
    }
}    
