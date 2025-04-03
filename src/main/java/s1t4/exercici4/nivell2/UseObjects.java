package s1t4.exercici4.nivell2;

import java.util.ArrayList;

public class UseObjects {
   private static ArrayList<Object> list = new ArrayList<Object>();

    public static void main(String[] args) {
        Animal animal = new Animal("");
        Car car = new Car("");
        Person person = new Person("");
        objects("ford mustang", car);
        objects("marcos", person);
        objects("gato", animal);

        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void objects(String nameObject, Object tipoObjeto) {
       if (tipoObjeto instanceof Animal) {
           Animal animal = new Animal(nameObject);
           list.add(animal);
       } else if (tipoObjeto instanceof Car) {
           Car car = new Car(nameObject);
           list.add(car);
       } else if (tipoObjeto instanceof Person) {
           Person person = new Person(nameObject);
           list.add(person);
       } else {
           System.out.println("Objeto no válido.");
       }
    }
}
