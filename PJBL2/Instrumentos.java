public class Instrumentos extends Produto {
    protected String marca;
    protected String cor;
    
    public Instrumentos(String nome, double valor , int estoque, String marca, String cor){
        super(nome, estoque, valor, estoque, estoque);
        this.marca = marca;
        this.cor = cor;

    }
}
