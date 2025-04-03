package s1t4.exercici1.nivell2;

import java.util.Scanner;

public class AssertInteger {
    private static Scanner data;
    private int numberOne;
    private int numberTwo;
    private boolean equalite;

    public AssertInteger(){
        AssertInteger.data = new Scanner(System.in);
    }

    public int getNumberOne() {
        return numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }

    public boolean getEqualite() {
        return equalite;
    }

    public void setEqualite() {
        this.equalite = false;
    }

    public String equalInteger() {

        System.out.println("Indique un numero entero positivo:");
        numberOne = data.nextInt();
        System.out.println("Ahora un segundo numero:");
        numberTwo = data.nextInt();

        String message;
        if(numberOne == numberTwo) {
            equalite = true;
            message = "Los enteros son iguales.";
        } else {
            equalite = false;
            message = "Los enteros son distintos.";
        }
        System.out.println(message);
        return message;
    }
}
