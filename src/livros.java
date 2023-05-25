public class livros extends Loja{
    private String autor;

    public livros(String nome, double preco, String codigoBarras, String autor) {
        super(nome, preco, codigoBarras);
        this.autor = autor;
    }
    public String getAutor(){
        return autor;
    }

    @Override
    public void mostrarDetalhesDoItem() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Autor: " + autor);
    }
}
