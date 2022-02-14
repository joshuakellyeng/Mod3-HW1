import java.util.ArrayList;
import java.util.Collections;

public class HW2 {

    public static void main(String[] args) {
        //arrayList
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Miata");
        cars.add("AE86");
        cars.add("Mustang");
        cars.add("C8 Stingray");
        cars.add("Skyline");
        cars.add("Challenger");
        cars.add("Camaro");

        System.out.println(cars);
        // Write a Java program to copy one array list into another

        ArrayList<String> newCars = new ArrayList<>();

        newCars.addAll(cars);

        System.out.println("This is the new Cars List " + newCars);

        // Write a Java program to extract a portion of an array list
        // The subList method extracts a portion of an array List
        ArrayList<String> faveCars = new ArrayList<>(newCars.subList(0, 2));

        System.out.println("My favorite cars are these two " + faveCars);

        // Write a Java program of swap two elements in an array list

        System.out.println("This is the original list we will swap: " + cars);
        //Collections.swap allows you to pass in an index and swap the location of to index elements
        Collections.swap(cars, 0,6);
        System.out.println("List after swapping: " + cars);

        //    Write a Java program to test an array list is empty or not


        //    Write a Java program to replace the second element of an ArrayList with the specified element.



        //    Write a Java program to trim the capacity of an array list the current list size

    }
}
