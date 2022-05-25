package Set_les_14;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        One one=new One("Олег",19);
        One two=new One("Данило",33);
        One three=new One("Остап",29);
        One four=new One("Діма",20);
        One five=new One("Ростислав",57);
        One six=new One("Петро",15);
        One seven=new One("Олег",90);
        Set<One> set=new HashSet<>();
        set.add(one);
        set.add(two);
        set.add(four);
        set.add(five);
        set.add(three);
        set.add(six);
        set.add(seven);
        System.out.println(set.toString());

        Set <One> linked=new LinkedHashSet<>(set);
        System.out.println(linked.toString());

        SortedSet<One> tree=new TreeSet<>(set);
        System.out.println(tree.toString());








    }
}
