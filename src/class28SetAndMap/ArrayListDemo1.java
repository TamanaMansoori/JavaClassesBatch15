package class28SetAndMap;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {


        Dog d1 = new Dog("Jacky", "Persian", 15);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Jacky", "Persian", 15));
        dogs.add(new Dog("Jami", "BullDog", 15));
        dogs.add(new Dog("Jimmi", "German", 15));
        dogs.add(new Dog("Mami", "Unknown", 15));

        for(Dog d:dogs){
            System.out.println(dogs);

        }
    }
}
