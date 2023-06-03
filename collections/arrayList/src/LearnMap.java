import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {

        Map<String,Integer> numbers = new HashMap<>();
        numbers.put("One",1);
        numbers.put("Two",2);
        numbers.put("Three",3); // it will overwrite
        System.out.println(numbers);
        numbers.putIfAbsent("Two",4);
        System.out.println(numbers);

        // iterate a map
        for (Map.Entry<String,Integer> e: numbers.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for (String key: numbers.keySet()){
            System.out.println(key);
        }

        for (Integer value: numbers.values()){
            System.out.println(value);
        }

        System.out.println(numbers.containsValue(3));
        System.out.println(numbers.isEmpty());

        TreeMap<String,Integer> tmap = new TreeMap<>();
        tmap.put("One",1);
        tmap.put("Two",2);
        tmap.put("Three",3);
        System.out.println(tmap);
        tmap.remove("Three");
        System.out.println(tmap);
    }
}
