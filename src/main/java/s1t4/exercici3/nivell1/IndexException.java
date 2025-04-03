package s1t4.exercici3.nivell1;

public class IndexException {

    public void invaliidAccess() {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]); // Error: Índice fuera de rango
    }

    public void negativeAccess() {
        int[] values = {10, 20, 30};
        System.out.println(values[-1]); // Error: Índice negativo
    }

    public void invalidIteration() {
        int[] info = {5, 10, 15};
        for (int i = 0; i <= info.length; i++) { // Error en i <= datos.length
            System.out.println(info[i]);
        }
    }

    public void throwException() {
        throw new ArrayIndexOutOfBoundsException("Índice fuera de rango!");
    }
}
