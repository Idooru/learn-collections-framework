package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        Integer[] a = new Integer[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;

        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(a));

        for (int i = 4; i <= 10; i++) {
            b.add(i);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(b.get(i));
        }

        System.out.println();

        b.stream().filter((idx) -> idx % 2 == 0).forEach(System.out::println);
    }
}
