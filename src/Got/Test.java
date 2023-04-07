package Got;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Test {

    public static void main(String[] args) {
        Map<String, House> gameOfThrones = new HashMap<>();
        gameOfThrones.put("Дом севера", new House("Старк", "Волк"));
        gameOfThrones.put("Дом богачей", new House("Ланнистер", "Лев"));


        //Метод для добавления в мапу
        gameOfThrones.put("Дом короля", new House("Баратеоны", "Олень"));

        //Метод для удаления дома по его названию
        gameOfThrones.remove("Дом богачей");

        //Метод для вывода информации всех домов
        System.out.println(gameOfThrones.get("Дом севера").getSigil());
       //вывода списка всех домов и их гербов
        for (Map.Entry<String,House> entry: gameOfThrones.entrySet()){
            System.out.println("Key " + entry.getKey() +" " + "Value "  + entry.getValue());
        }
    }

}
