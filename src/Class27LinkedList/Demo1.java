package Class27LinkedList;

import java.util.ArrayList;

public class Demo1 {

    public static void main(String[] args) {

        ArrayList<String> words=new ArrayList<>();
        words.add("Cat");
        words.add("Java");
        words.add("Computer");
        words.add("Lava");

        //remover all the elements from this that ends with (a)
        /*for (String s:words) {
            if(s.endsWith("a"));
            words.remove(s);
        }
        System.out.println(words);*/  //here we get error during runtime

        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("a")){
                words.remove(i);
            }
        }
        System.out.println(words);
    }
}
