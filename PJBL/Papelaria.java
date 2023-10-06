import java.util.ArrayList;
import java.util.Scanner;

public class Papelaria extends Produto {
    private int tipo;
    Scanner scanner = new Scanner(System.in);
    protected ArrayList<Papelaria> ListaEscola = new ArrayList<Papelaria>();
    protected ArrayList<Papelaria> ListaDesenho = new ArrayList<Papelaria>();

    public Papelaria(String nome, double valor, int tipo){
        super(nome, valor);
        this.tipo = tipo;
    }
    public int getTipo(){
        return tipo;
    }
    @Override
    public void cadastrar(int tipo, String nome, double valor){
        System.out.println("Informe o valor: ");
        valor = scanner.nextDouble();
        System.out.println("Informe o nome: ");
        nome = scanner.next();
        System.out.println("Informe em qual departamento você irá adicionar o produto:");
        System.out.println("1 - Escolar");
        System.out.println("2 - Desenho");
        tipo = scanner.nextInt();
    
        if (tipo == 1){
            ListaEscola.add(new Papelaria(nome, valor, tipo));
        }
        else if (tipo == 2){
            ListaDesenho.add(new Papelaria(nome, valor, tipo));
        }
    }
    
    }

