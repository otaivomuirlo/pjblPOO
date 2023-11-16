import java.util.ArrayList;

public class PetShop extends Produto{
    protected ArrayList<PetShop> listaRoupinhas = new ArrayList<>();
    protected ArrayList<PetShop> listaBrinquedos = new ArrayList<>();

    public void atualizarEstoque(int quantidadeVendida) {
        this.estoque -= quantidadeVendida;
    }
    public PetShop(String nome, int estoque, double valor) {
        super(nome, estoque, valor);
    }
    public void addProdutoRoupinhas(PetShop produto){
        listaRoupinhas.add(produto);
    }
    public void addProdutoBrinquedos(PetShop produto){
        listaBrinquedos.add(produto);
    }
    public ArrayList<PetShop> getListaRoupinhas(){
        return listaRoupinhas;
    }
    public ArrayList<PetShop> getListaBrinquedos(){
        return listaBrinquedos;
    }

    public PetShop(String nome, int estoque, double valor, int tipo, int opcao) {
        super(nome, estoque, valor);
    }
    @Override
    public void mostrarProdutos() {
        System.out.println();
        System.out.println("Pet Shop");

        System.out.println("Roupinhas: ");
        for (PetShop produto : listaRoupinhas) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor por Unidade: " + produto.getValor());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println();
        }
        System.out.println("Brinquedos: ");
        for (PetShop produto : listaBrinquedos) {
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Valor por Unidade: " + produto.getValor());
            System.out.println("Estoque: " + produto.getEstoque());
            System.out.println("================");
        }
    }
}
