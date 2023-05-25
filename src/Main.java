public class Main {
    public static void main(String[] args) {

        Loja [] loja = new Loja[5];

        loja [0] = new livros("Dom casmurro", 29.90, "1234","Paulo coelho");
        loja [1] = new Cds("Numanice", 49.90,"2134", 15);
        loja [2] = new livros("Sonhe alto ", 40.50, "8992", "Ben carson");
        loja [3] = new Dvds("Movimento Sanfoninha", 19.90, "4340", 4.0);
        loja [4] = new Cds("Biblia Sagrada", 89.90, "9898", 200);

        System.out.println(loja[3].equals(loja[4]));

        System.out.println("Itens da Loja :");
        for (Loja itens : loja) {
            itens.mostrarDetalhesDoItem();
            System.out.println();
        }

    }
}