package s1t4.exercici1.nivell1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Scaffale implements Library<Book> {


    private String literaryGenre;
    private List<Book> bookshelf;

    public Scaffale(String literaryGenre) {
        this.literaryGenre = literaryGenre;
        this.bookshelf = new ArrayList<Book>();
    }

    public String getLiteraryGenre() {
        return literaryGenre;
    }

    public void setLiteraryGenre(String literaryGenre) {
        this.literaryGenre = literaryGenre;
    }

    public List<Book> getBookshelf() {
        return bookshelf;
    }

    public void setBookshelf(List<Book> bookshelf) {
        this.bookshelf = bookshelf;
    }

    public List<Book> addBook(Book pocket) {
        this.bookshelf.add(pocket);
        return this.bookshelf;
    }

    @Override
    public String toString() {
        return "Estantería del género literario " +this.literaryGenre+ " y contiene los titulos " + this.bookshelf;
    }

    @Override
    public List<Book> listBook() {
        return bookshelf;
    }

    @Override
    public String nameByPosition() {
      //  Book bookByPosition = new Book("");
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la posición
        System.out.print("Ingrese la posición del nombre que desea obtener (0-" + (bookshelf.size() - 1) + "): ");

        try {
            int posicion = scanner.nextInt();

            // Verificar si la posición está dentro del rango válido
            if (posicion >= 0 && posicion < bookshelf.size()) {
                Book nombre = bookshelf.get(posicion);

                System.out.println("El nombre en la posición " + posicion + " es: " + nombre);
            } else {
                System.out.println("Error: La posición ingresada está fuera del rango.");
            }
        } catch (Exception e) {
            System.out.println("Error: Entrada no válida. Debe ingresar un número entero.");
        } finally {
            scanner.close(); // Cerrar el Scanner
        }

        return "";
    }

    @Override
    public void swapBooks(int index1, int index2) {
        if (index1 >= 0 && index1 < bookshelf.size() && index2 >= 0 && index2 < bookshelf.size()) {
            Book novelon = bookshelf.get(index1);
            bookshelf.set(index1, bookshelf.get(index2));
            bookshelf.set(index2, novelon);
        } else {
            System.out.println("Índices fuera de rango.");
        }
    }

    @Override
    public void deleteBook(Book pocket) {
        bookshelf.remove(pocket);
    }

    public int bookShelfSize() {
        return this.bookshelf.size();
    }
}
