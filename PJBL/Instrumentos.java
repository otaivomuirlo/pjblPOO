public class Instrumentos extends Produto {
    protected String marca;
    protected String cor;
    
    public Instrumentos(String nome, double valor, String marca, String cor){
        super(nome, valor);
        this.marca = marca;
        this.cor = cor;

    }
}
