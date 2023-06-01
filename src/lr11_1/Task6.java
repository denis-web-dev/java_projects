package lr11_1;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(0, "ноль");
        hashMap.put(1, "один");
        hashMap.put(2, "два");
        hashMap.put(3, "три");
        hashMap.put(4, "четыре");
        hashMap.put(5, "пять");
        hashMap.put(6, "шесть");
        hashMap.put(7, "семь");
        hashMap.put(8, "восемь");
        hashMap.put(9, "девять");

        System.out.println("Ключ больше пяти");
        hashMap.entrySet()
                .stream()
                .filter(e -> e.getKey() > 5)
                .forEach(e -> System.out.println(e.getValue()));

        if (hashMap.containsKey(0)) {
            System.out.println("\nКлюч ноль");
            String[] values = hashMap.get(0).split(",");
            for (String value : values) {
                System.out.println(value.trim() + " ");

            }}
        int product = 1;
        for (String value : hashMap.values()) {
            if (value.length() > 5) {
                product *= hashMap.keySet()
                        .stream()
                        .filter(key -> hashMap.get(key).equals(value))
                        .findFirst()
                        .orElse(1);
            }
        }
        System.out.println("\nДлина строки больше пяти: " + product);
    }
}