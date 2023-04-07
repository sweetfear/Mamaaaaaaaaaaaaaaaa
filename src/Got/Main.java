package Got;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Got", "Negr", 1991);
        Book book2 = new Book("StarWars", "kazakh", 2003);
        Book book3 = new Book("Tlou", "pendos", 2010);
        Map<Book, String> map = new HashMap<>();
        map.put(book1, "1");
        map.put(book2, "3");
        System.out.println(map.get(book1));


        // addElement
        map.put(new Book("Algos", "Liskov", 1983), "5");
        //delete by author name;
        map.remove(new Book("Got", "Negr", 1991));
        //find and sout
        String find = Optional.ofNullable(map.get(new Book("AlgoФЫs", "Liskov", 1983))).orElse("Книга не найдена");
        System.out.println(find);
    }
}






