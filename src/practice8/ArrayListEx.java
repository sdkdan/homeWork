package practice8;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Amy");
        list.add("Bob");
        list.add("Sindy");
        list.add("David");
        System.out.println(list + " size: " + list.size());
        list.add(0, "Mike");
        list.add(1, "Nick");
        list.remove(3);
        System.out.println(list + " size: " + list.size());

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(123);
        list1.add(12);
        list1.add(1214);
        list1.add(1235);
        list1.add(8);
        ListIterator<Integer> iterator = list1.listIterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i % 2 == 0) {
                iterator.remove();
            } else System.out.println(i);
        }

        int score[] = new int[9];
        byte values[] = {1,1,1,1,1,1,1,1,1,1};
    }
}
