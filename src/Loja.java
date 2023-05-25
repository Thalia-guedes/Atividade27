abstract class Loja {
  private String nome;
  private double preco;
  private String codigoBarras;
  public Loja(String nome, double preco, String codigoBarras) {
    this.nome = nome;
    this.preco = preco;
    this.codigoBarras = codigoBarras;
  }
  public String getNome() {
    return nome;
  }
  public double getPreco() {
    return preco;
  }
  public String getCodigoBarras() {
    return codigoBarras;
  }
  public abstract void mostrarDetalhesDoItem();

}
