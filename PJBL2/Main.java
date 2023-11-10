public class Main {
    public static void main(String[] args) {
    
    Gerente gerente = new Gerente(null, null, 0);
    Papelaria p = new Papelaria(null, 0, 0);
    PetShop pShop = new PetShop(null, 0, 0);
    Cliente c = new Cliente(null, null, 0);


    
    gerente.cadastrarPessoa();
    gerente.cadastrarProduto(p, pShop);
    c.mostrarProdutos(p, pShop);
    c.comprar(null, p.listaEscolar, p.listaDesenho, pShop.listaRoupinhas, pShop.listaBrinquedos);
    c.comprar(null, p.listaEscolar, p.listaDesenho, pShop.listaRoupinhas, pShop.listaBrinquedos);
    }
}
