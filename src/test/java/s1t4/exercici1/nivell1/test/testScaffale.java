package s1t4.exercici1.nivell1.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import s1t4.exercici1.nivell1.Book;
import s1t4.exercici1.nivell1.Scaffale;

import java.util.List;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class testScaffale {
            Book book1 = null;
            Book book2 = null;
            Book book3 = null;
            Book book4 = null;
            Scaffale listBooks = null;

            @BeforeEach
            @DisplayName("Inicializar objetos y parametros iniciales")
            public void setUp() {
                listBooks = new Scaffale("Novela");
                book1 = new Book("El hereje");
                book2 = new Book("La cruz de ceniza");
                book3 = new Book("La colmena");
                book4 = new Book("Rayuela");
                listBooks.addBook(book1);
                listBooks.addBook(book2);
                listBooks.addBook(book3);
                listBooks.addBook(book4);
            }

    @Test
    @DisplayName("testea null de la lista de libros")
    public void esNull() {
                assertNotNull(listBooks.getBookshelf(), "mensaje si es null.");
    }

    @Test
    @DisplayName("testea la medida correcta de una lista")
    public void testBookshelfSize() {
                assertEquals(4, listBooks.bookShelfSize(), "Lista de tamaño incorrecto.");
    }

    @Test
    @DisplayName("testea adición de libro")
    public void testAddBook() {
        List<Book> expected =  listBooks.addBook(book1);
        List<Book> actual = listBooks.addBook(book2);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("testea listar todos los libros de la lista")
    public void testListBook() {
        List<Book> expected = listBooks.listBook();
        List<Book> actual = listBooks.listBook();

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("testea eliminar un libro")
    public void testDeleteBook() {



    }

}
