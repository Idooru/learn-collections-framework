package HashMap;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<>();

        a.put("one", 1);
        a.put("two", 2);
        a.put("three", 3);
        a.put("four", 4);
        a.put("five", 5);

        System.out.println(a.get("three"));

        loop(a);
    }

    public static void loop(HashMap<String, Integer> a) {
        a.forEach((key, value) -> {
            System.out.format("key : %s value : %s\n", key, value);
        });
    }
}

