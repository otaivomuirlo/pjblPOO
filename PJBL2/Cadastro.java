import java.io.Serializable;
import java.util.Scanner;

public abstract class Cadastro implements Serializable {

    public Cadastro(){

    }

    
    boolean quit = false;
    Scanner scanner = new Scanner(System.in);

    
    public void cadastrarProduto(Papelaria papelaria, PetShop petShop) {   
            while(!quit){
                System.out.println();
                System.out.println("Bem vindo ao sistema de cadastro de produtos");
                System.out.println("Digite 'quit' para sair");
                System.out.println("Informe o nome do produto: ");
                String nome = scanner.next();
                if (nome.equalsIgnoreCase("quit")){
                    break;
                }
                System.out.println("Informe o valor: ");
                double valor = scanner.nextDouble();
                System.out.println("Informe a quantidade de itens que gostaria de inserir: ");
                int estoque = scanner.nextInt();

                System.out.println("Informe em qual departamento você irá adicionar o produto:");
                System.out.println("1 - Papelaria");
                System.out.println("2 - Pet Shop");
                System.out.println("3 - Instrumentos Musicais");
                System.out.println("4 - Livros");
                int tipo = scanner.nextInt();

                if (tipo == 1) {
                    System.out.println("Selecione a categoria do produto");
                    System.out.println("1 - Escolar");
                    System.out.println("2 - Desenho");
                    int opcao = scanner.nextInt();
                    if (opcao == 1) {
                        Papelaria produto = new Papelaria(nome, estoque, valor);
                        papelaria.addProdutoEscolar((Papelaria) produto);
                    } else if (opcao == 2) {
                        Papelaria produto = new Papelaria(nome, estoque, valor);
                        papelaria.addProdutoDesenho((Papelaria) produto);
                    }
                } else if (tipo == 2) {
                    System.out.println("Selecione a categoria do produto");
                    System.out.println("1 - Roupinhas");
                    System.out.println("2 - Brinquedos");
                    int opcao = scanner.nextInt();
                    if (opcao == 1) {
                        PetShop produto = new PetShop(nome, estoque, valor);
                        petShop.addProdutoRoupinhas(produto);
                    } else if (opcao == 2) {
                        PetShop produto = new PetShop(nome, estoque, valor);
                        petShop.addProdutoBrinquedos((PetShop) produto);
                    }else{
                        
                    }
                }
        
            }
        }
        
            
    
    public void cadastrarPessoa() {
       
        while (!quit) {
            System.out.println("Bem vindo ao sistema de cadastro");
            System.out.println("Digite 'quit' para sair");

            System.out.println("Nome: ");
            String nome = scanner.next();
            if (nome.equalsIgnoreCase("quit")) {
                break;
            }
            System.out.println("Informe o CPF: ");
            String cpf = scanner.next();

            System.out.println("Informe sua idade");
            int idade = scanner.nextInt();
            if (idade < 18) {
                System.out.println("Idade insuficiente para cadastro!");
                break;
            }

            System.out.println("Você gostaria de se cadastrar como: ");
            System.out.println("1 - Gerente");
            System.out.println("2 - Funcionário");
            System.out.println("3 - Cliente");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                        System.out.println("Digite a senha para cadastrar um Gerente"); // senha = 123
                        int senha = scanner.nextInt();
                        if (senha != 123) {
                            System.out.println("Senha incorreta");
                            break;
                        }

                        Gerente g = new Gerente(nome, cpf, idade);
                        g.addGerente(g);
                        System.out.println("Gerente cadastrado");
  
                    break;
                case 2:
            
                        System.out.println("Digite a senha para cadastrar um Funcionário"); // senha = 321
                        int senhaF = scanner.nextInt();
                        if (senhaF != 321) {
                            System.out.println("Senha incorreta");
                            break;
                        }
                        Funcionario f = new Funcionario(nome, cpf, idade);
                        f.addFuncionario(f);
                        System.out.println("Funcionário cadastrado");
                    break;
                case 3:
                    Cliente c = new Cliente(nome, cpf, idade);
                    c.addCliente(c);
                    System.out.println("Cliente cadastrado");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}
