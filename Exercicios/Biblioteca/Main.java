public class Main {
    public static void main(String[] args) {
        Book medioLivro = new Book("Livro Mediano", 210, "Esse livro é bem meh");
        Book livroLegal = new Book("Livro legal", 183, "Esse é o melhor livro");
        Book LivroRuim = new Book("Livro nao muito bom", 4000, "Muito longo esse livro");

        medioLivro.setAvaliable(10);
        medioLivro.setAvaliable(6);
        medioLivro.setAvaliable(1);
        livroLegal.setAvaliable(10);
        livroLegal.setAvaliable(9);
        livroLegal.setAvaliable(9.5f);
        LivroRuim.setAvaliable(2);
        LivroRuim.setAvaliable(1);
        LivroRuim.setAvaliable(0);
        Library biblioteca = new Library();
        biblioteca.addBook(medioLivro);
        biblioteca.addBook(livroLegal);
        biblioteca.addBook(LivroRuim);
        biblioteca.listBook();
    }
}
