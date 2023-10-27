import java.util.ArrayList;
import java.util.Scanner;

public abstract class Cadastro {

    Estoque e = new Estoque();
    Gerente g;

    boolean quit = false;
    protected int opcao;
    protected int tipo;
    private boolean verificarCPF(String cpf, ArrayList<Gerente> listaGerentes) {
        for (Gerente g : listaGerentes) {
            if (g.getCPF().equalsIgnoreCase(cpf)) {
                return true;
            }
        }
        return false;
    }   

    public Cadastro(int opcao, int tipo){
        this.opcao = opcao;
        this.tipo = tipo;
        g = new Gerente(null, null, tipo, null, null);
    }

    Scanner scanner = new Scanner(System.in);

    


    public void cadastrarProduto() {
        System.out.println();
        System.out.println("Bem vindo ao sistema de cadastro de produtos");
        System.out.println("Informe o valor: ");
        double valor = scanner.nextDouble();
        System.out.println("Informe o nome: ");
        String nome = scanner.next();
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
            System.out.println();
            int opcao = scanner.nextInt();
            if (opcao == 1) {
                Papelaria produto = new Papelaria(nome, estoque, valor, tipo, opcao, null, null);
                e.adicionarProduto(produto, null);


            } else if (opcao == 2) {
                Papelaria produto = new Papelaria(nome, estoque, valor, tipo, opcao, null, null);
                e.adicionarProduto(produto, null);
                e.adicionarProduto(produto, null);
            }
        }
        else if (tipo == 3) {


        }
        else if (tipo == 4) {

        }
    }


    public void cadastrarPessoa(){
        while(!quit){
            System.out.println("Bem vindo ao sistema de cadastro");
            System.out.println("Digite 'quit' para sair");

            System.out.println("Nome: ");
            String nome = scanner.next();
            if (nome.equalsIgnoreCase("quit")){
                break;
            }
            System.out.println("Informe o CPF: ");
            String cpf = scanner.next();
            if (verificarCPF(cpf, null)) {
                System.out.println("CPF já cadastrado. Por favor, insira um CPF diferente.");
                continue;
            }

            System.out.println("Informe sua idade");
            int idade = scanner.nextInt();
            if (idade < 18){
                System.out.println("Idade insuficiente para cadastro!");
                break;
                
            }


            System.out.println("Você gostaria de se cadastrar como: ");
            System.out.println("1 - Gerente");
            System.out.println("2 - Funcionário");
            System.out.println("3 - Cliente");
            int opcao = scanner.nextInt();
            if(opcao == 1 ){
                System.out.println("Digite a senha para cadastrar um Gerente"); //senha = 123
                int senha = scanner.nextInt();
                if(senha != 123){
                    System.out.println("Senha incorreta");
                    break;
                }
                System.out.println("Gerente cadastrado");
                System.out.println("-----------------");
                Gerente g = new Gerente(nome, cpf, idade, null, null);
                g.addGerente(g);
                
            }
            else if (opcao == 2){
                System.out.println("Digite a senha para cadastrar um Funcionario"); //senha = 321
                int senha = scanner.nextInt();
                if(senha != 321){
                    System.out.println("Senha incorreta");
                    break;

                }
                System.out.println("Funcionario cadastrado");
                System.out.println("-----------------");
                
                

            }
            else if (opcao == 3){
                System.out.println("Cliente cadastrado");
                System.out.println("-----------------");
                
               
            }
        }
    }
}

    

