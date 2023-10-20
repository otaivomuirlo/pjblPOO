public class Gerente extends Funcionario {
    public Gerente(String nome, int CPF, int idade){
        super(nome, CPF, idade);
    }
    void mostrarProdutos(Papelaria p){
        p.mostrarProdutos();
    }
    public void mostrarFuncionario(){
        System.out.println("Funcionario: ");
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("Valor por Unidade: " + funcionario.getCPF());
            System.out.println("Estoque: " + funcionario.getIdade());
            System.out.println("================");
        }
    }
    public void mostrarGerente(){
        System.out.println("Gerente: ");
        for (Gerente gerente : listaGerentes) {
            System.out.println("Nome: " + gerente.getNome());
            System.out.println("Valor por Unidade: " + gerente.getCPF());
            System.out.println("Estoque: " + gerente.getIdade());
            System.out.println("================");
        }
    }
    public void mostrarCliente(){
        System.out.println("Cliente: ");
        for (Cliente cliente : listaClientes) {
            System.out.println("Nome: " + cliente.getNome());
            System.out.println("Valor por Unidade: " + cliente.getCPF());
            System.out.println("Estoque: " + cliente.getIdade());
            System.out.println("================");
        }
    }
}
