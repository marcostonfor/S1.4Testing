package s1t4.exercici4.nivell2;

public class Car {
    private String carName;

    public Car(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String toString() {
        return "El coche se llama " + this.carName;
    }
}
