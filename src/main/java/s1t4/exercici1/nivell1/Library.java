package s1t4.exercici1.nivell1;

import java.util.List;

public interface Library<Book> {

    List<Book> listBook();
    String nameByPosition();
    void swapBooks(int index1, int index2);
    void deleteBook(Book pocket);
}
