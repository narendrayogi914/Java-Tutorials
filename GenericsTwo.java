
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericsTwo {
    public static void main(String[] args) {
        // Using ArrayList
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");

        for (String s : list) {
            System.out.println(s);
        }

        // Using HashMap
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Using HashSet
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
