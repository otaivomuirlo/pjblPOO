abstract class Pessoas extends Cadastro{
    protected  String nome;
    protected  int CPF;
    protected  int idade;
    

    public Pessoas(String nome, int CPF, int idade){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }
    public int getCPF() {
        return CPF;
    }
    public int getIdade() {
        return idade;
    }

}