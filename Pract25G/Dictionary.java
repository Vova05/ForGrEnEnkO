package Pract25G;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;


public class Dictionary {
    public static void main(String[] args) {
        Map<String, String> dictioner = Map.of(
                "Blue", "Zima",
                "Грозный", "Иван",
                "Konor", "Sara",
                "Горьков", "Иван",
                "Веселов", "Сергей",
                "Чехарин", "Игорь",
                "Хрусталев", "Радион",
                "Чертов", "Кирилл",
                "Суворов", "Дмитрий",
                "Кузневцов", "Иван"
        );

        //меняем местами ключ и значение для выборки повторяющихся элементов
        Map<String, String> remove = new HashMap<>();
        for (Map.Entry e : dictioner.entrySet()){
           remove.putIfAbsent((String)e.getValue(), (String)e.getKey());
        }

        //очищаем от савподений ради чего и переворачиваем map так как апишка отказывается иначе работать
        remove = remove.entrySet().stream().distinct().collect(Collectors.toMap(Map.Entry::getValue,Map.Entry::getKey));

        //возвращаем положение ключа и элемента обратно
        Map<String, String> result_map = new HashMap<>();
        for (Map.Entry e : remove.entrySet()){
            result_map.putIfAbsent( (String)e.getKey(),(String)e.getValue());
        }
        //выводим на экран
        System.out.println("Map:\n" + (result_map));

    }
}
