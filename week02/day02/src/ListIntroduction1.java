package week02.day02.src;

import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction1 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(3 - 1));

        for (String str : names) {
            System.out.println(str);
        }

        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + 1 + ". " + names.get(i));
        }

        names.remove(1);

        Collections.reverse(names);
        System.out.println(names);

        names.clear();

        System.out.println(names);


    }
}
