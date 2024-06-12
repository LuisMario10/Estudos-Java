# Biblioteca
Objetivo: Gerir livros em uma biblioteca

## Ações possiveis da Biblioteca - Libriary
[x] - Guardar Livros
[x] - Fornecer Livros
[x] - Remover Livros
[x] - Listar Livros

## Ações possiveis do Livro - Book
[x] - Mostrar Status

Classes:

-> Book
    - name
    - quantPages
    - sinopse
    - listAvaliable
    - avaliable
    + status()

-> BookCase
    - listBook<Book>
    - size

-> interface: Librarian
    + addBook()
    + getBook()
    + deleteBook()
    + searchLibrary()
    + getBestAvaliable()
    + listBooks()

