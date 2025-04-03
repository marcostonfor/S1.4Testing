package s1t4.exercici1.nivell1;

public class UseLibrary {

    public static void main(String[] args) {
        Scaffale oneBook = new Scaffale("Novela");
        oneBook.addBook(new Book("El hereje"));
        oneBook.addBook(new Book("La cruz de ceniza"));
        oneBook.addBook(new Book("La colmena"));
        System.out.println(oneBook.listBook());

    }

}


/*
* La classe ha de permetre afegir llibres a la col·lecció.
S'ha de poder recuperar la llista completa de llibres
S'ha de poder obtenir el títol d'un llibre donada una posició.
S'ha de poder afegir un llibre en una posició específica.
S'ha de poder eliminar un llibre per títol.

* */