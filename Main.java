public class Main {
    public static void main(String[] args) {
    Papelaria p = new Papelaria(null, 0, 0, 0, 0);
    Gerente g = new Gerente(null, 0, 0);
    g.cadastrarPessoa();
    p.cadastrarProduto();
    g.mostrarProdutos(p);    

    }
}
