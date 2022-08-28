package ArrayList;

import java.util.Arrays;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        Integer[] a = new Integer[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = i + 1;
        }

        Arrays.stream(a).filter((idx) -> idx % 2 == 0).forEach(System.out::println);
    }
}
