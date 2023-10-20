public class Gerente extends Funcionario {
    public Gerente(String nome, int CPF, int idade){
        super(nome, CPF, idade);
    }
    void mostrarProdutos(Papelaria p){
        p.mostrarProdutos();
    }
}
