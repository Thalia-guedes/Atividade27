public class Dvds extends Loja{
    public double duracao;

    public Dvds(String nome, double preco, String codigoBarras, double duracao) {
        super(nome, preco, codigoBarras);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome : " + getNome());
        System.out.println("Valor: " + getPreco());
        System.out.println("Duração: " + duracao + " minutos");
    }
}
