import java.util.Date;

public class Venda {
    int codigoVenda;
    Filial filialVenda;
    Date dataVenda;
    Produto produtoVenda;
    int qtdVenda;
    float valorVenda;

    public Venda(int codigoVenda, Filial filialVenda, Date dataVenda, Produto produtoVenda, int qtdVenda, float valorVenda) {
        this.codigoVenda = codigoVenda;
        this.filialVenda = filialVenda;
        this.dataVenda = dataVenda;
        this.produtoVenda = produtoVenda;
        this.qtdVenda = qtdVenda;
        this.valorVenda = valorVenda;
    }

}
