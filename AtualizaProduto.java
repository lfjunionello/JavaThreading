public class AtualizaProduto implements Runnable {

  private Filial filial;
  private Produto produtos[];
  private Venda vendas[];

  public AtualizaProduto(Filial filial, Produto produtos[], Venda vendas[]) {
    this.filial = filial;
    this.produtos = produtos;
    this.vendas = vendas;

  }

  public void run() {
    for (int i = 0; i < vendas.length; i++) {
      if (vendas[i].filialVenda.codigoFilial == filial.codigoFilial) {
        Produto produto = vendas[i].produtoVenda;
        for (int j = 0; j < produtos.length; j++) {
          if (produtos[j].codigoProduto == produto.codigoProduto) {
            produtos[j].qtdEstoque -= vendas[i].qtdVenda;
            System.out
                .println("Produto: " + produtos[j].nomeProduto + "Quantidade restante: " + produtos[j].qtdEstoque);
          }
        }
      }
    }
  }

}
