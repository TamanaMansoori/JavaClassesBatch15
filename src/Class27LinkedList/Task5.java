package Class27LinkedList;

import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {

        //5)Create an arrayList of even numbers from 1 to 500.
        // Remove any number that is divisible by 5 from that arrayList.

        ArrayList<Integer> numbers=new ArrayList<>();
        for (int i = 2; i <=500 ; i+=2) {//to get even numbers we use 2 and i+=2
            numbers.add(i);
        }

        numbers.removeIf(x->x%5==0);
        System.out.println(numbers);


        }


    }

