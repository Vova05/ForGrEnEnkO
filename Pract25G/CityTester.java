package Pract25G;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Locate {
    private String name;
    private String country;

    public Locate(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}

public class CityTester {
    static Map<String, ArrayList<String>> map = new HashMap<>();

    public static void main(String[] args) {
        //создаем лист с тестовыми данными
        List<Locate> list = List.of(
                new Locate("Moscow", "Russia"),
                new Locate("Vladivostok", "Russia"),
                new Locate("Tokio", "Japan"),
                new Locate("Krakow","Poland"),
                new Locate("New York", "USA"),
                new Locate("Washington", "USA"),
                new Locate("Berlin", "German"),
                new Locate("Warsaw","Poland")
        );
        //через ассоциативный массив (ключ - знчение) смотрим к какой стране какой город относится и запоминаем
        for (Locate c : list){
            if (!map.containsKey(c.getCountry())){
                map.put(c.getCountry(), new ArrayList<>());
            }
            map.get(c.getCountry()).add(c.getName());
        }
        map.entrySet().stream().forEach(System.out::println);
    }
}

