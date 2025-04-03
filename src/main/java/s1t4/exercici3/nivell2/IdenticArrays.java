package s1t4.exercici3.nivell2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IdenticArrays {

    private int[] array1;
    private int[] array2;

    public IdenticArrays() {
        this.array1 = new int[]{1, 2, 3, 4, 5};
        this.array2 = new int[]{1, 2, 3, 4, 5};
    }

    public int[] getArray1() {
        return array1;
    }

    public void setArray1(int[] array1) {
        this.array1 = array1;
    }

    public int[] getArray2() {
        return array2;
    }

    public void setArray2(int[] array2) {
        this.array2 = array2;
    }

    public boolean areArraysEqual() {
        return Arrays.equals(array1, array2);
    }

    @Override
    public String toString() {
        return "IdenticArrays{" +
                "array1=" + Arrays.toString(array1) +
                ", array2=" + Arrays.toString(array2) +
                '}';
    }
}
