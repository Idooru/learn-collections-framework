package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();

        a.add(1);
        a.add(1); // 중복
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);

        System.out.println(a);

        HashSet<Integer> b = new HashSet<>();

        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);

//        a.addAll(b); // 합집합
//        a.retainAll(b); // 교집합
        a.removeAll(b); // 차집합

        System.out.println(a);

    }
}
