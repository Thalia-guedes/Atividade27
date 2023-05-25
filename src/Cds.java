public class Cds extends Loja{
        private int numeroDeFaixas;

    public Cds(String nome, double preco, String codigoBarras, int numeroDeFaixas) {
        super(nome, preco, codigoBarras);
        this.numeroDeFaixas = numeroDeFaixas;
    }
    public int getNumeroDeFaixas(){
        return numeroDeFaixas;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Número de Faixas: " + numeroDeFaixas);
    }
}
