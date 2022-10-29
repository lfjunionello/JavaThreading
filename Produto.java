public class Produto {
    int codigoProduto;
    String nomeProduto;
    int qtdEstoque;
    int qtdMinima;

    public Produto(int codigoProduto, String nomeProduto, int qtdEstoque, int qtdMinima) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.qtdEstoque = qtdEstoque;
        this.qtdMinima = qtdMinima;
    }
    
}
