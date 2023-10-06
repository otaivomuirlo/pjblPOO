import java.util.Scanner;

abstract class Produto{
    protected String nome;
    protected double valor;
    Scanner scanner = new Scanner(System.in);

    public Produto(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }
    public void cadastrar(int tipo, String nome, double valor){
        System.out.println("Informe o valor: ");
        valor = scanner.nextDouble();
        System.out.println("Informe o nome: ");
        nome = scanner.next();

    }

}