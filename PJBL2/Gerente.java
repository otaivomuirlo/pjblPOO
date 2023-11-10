import java.util.ArrayList;

public class Gerente extends Funcionario {
    protected ArrayList<Gerente> listaGerentes = new ArrayList<>();
    protected ArrayList<Cliente> listaClientes = new ArrayList<>();

    public Gerente(String nome, String CPF, int idade){
        super(nome, CPF, idade);

    }


    public void addGerente(Gerente g){
        listaGerentes.add(g);
    }



    public void mostrarFuncionario(){
        System.out.println("Funcionario: ");
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF: " + funcionario.getCPF());
            System.out.println("Idade: " + funcionario.getIdade());
            System.out.println("================");
        }
    }
    public void mostrarGerente(){
        System.out.println("Gerente: ");
        for (Gerente gerente : listaGerentes) {
            System.out.println("Nome: " + gerente.getNome());
            System.out.println("CPF: " + gerente.getCPF());
            System.out.println("Idade: " + gerente.getIdade());
            System.out.println("================");
        }
    }
    public void mostrarCliente(){
        System.out.println("Cliente: ");
        for (Cliente cliente : listaClientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCPF());
            System.out.println("Idade: " + cliente.getIdade());
            System.out.println("================");
        }
    }

    
}
