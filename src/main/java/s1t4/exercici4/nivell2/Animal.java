package s1t4.exercici4.nivell2;

public class Animal {
    private String nameAnimal;

    public Animal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String toString() {
        return "El animal se llama " + this.nameAnimal;
    }
}
