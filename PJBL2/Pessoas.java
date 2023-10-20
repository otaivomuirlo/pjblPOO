abstract class Pessoas extends Cadastro{
    protected  String nome;
    protected  int CPF;
    protected  int idade;
    

    public Pessoas(String nome, int CPF, int idade){
        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;
    }
    public void mostrarPessoas(){
        System.out.println("Pessoas: ");
        for (Pessoas pessoas : listaPessoas) {
            System.out.println("Nome: " + pessoas.getNome());
            System.out.println("Valor por Unidade: " + pessoas.getCPF());
            System.out.println("Estoque: " + pessoas.getIdade());
            System.out.println("================");
        }
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