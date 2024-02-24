package ListaUm.Livro;

public class Programa {
    public static void main(String[] args) {
        Livro book = new Livro();

        book.setNome("Star Wars");
        book.setGenero("Aventura");
        book.setPreco(34.99);

        System.out.println(book.getNome());
        System.out.println(book.getGenero());
        System.out.println("R$" + book.getPreco());
    }
}
