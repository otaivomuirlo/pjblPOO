
import java.util.ArrayList;

abstract class Pessoas extends Cadastro implements Acoes{
    protected ArrayList<Produto> lista = new ArrayList<>();
    protected ArrayList <Pessoas> listaPessoas;
    protected  String nome;
    protected  String CPF;
    protected  int idade;
    

    public Pessoas(String nome, String CPF, int idade){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public String getCPF() {
        return CPF;
    }
    public int getIdade() {
        return idade;
    }

}