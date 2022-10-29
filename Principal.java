import java.util.Date;

public class Principal {
  public static void main(String[] args) throws InterruptedException {
    Filial[] filialArray = new Filial[5];
    Produto[] produtoArray = new Produto[5];
    Venda[] vendaArray = new Venda[20];

    for (int i = 0; i < 5; i++) {
      filialArray[i] = new Filial(i, "Filial " + i);
    }
    for (int i = 0; i < 5; i++) {
      produtoArray[i] = new Produto(i, "Produto " + i, (20 * i) + 30, i + 1);
    }
    for (int i = 0; i < 20; i++) {
      vendaArray[i] = new Venda(i, filialArray[i % 5], new Date(), produtoArray[i % 5], i, i);
    }

    for (int i = 0; i < filialArray.length; i++) {

      Thread t = new Thread(new AtualizaProduto(filialArray[i], produtoArray, vendaArray));
      t.start();
    }

  }
}
