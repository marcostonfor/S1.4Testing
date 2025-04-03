package s1t4.exercici2.nivell2;

public class References {

    private String object;
    private String otherObject;

    public void sameReference() {
        object = "";
        otherObject = object;
    }

    public void notSameReference() {
        object = new String("");
        otherObject = new String("");
    }
}
