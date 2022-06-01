package Inner_class;

import java.util.Comparator;

public class Two {
    public static Comparator<One> comparator_for_name(){
        return  new Comparator<One>() {
            @Override
            public int compare(One o1, One o2) {
                return o1.name.compareTo(o2.name);
            }
        };

    }

    public static Comparator<One> comparator_for_lenght(){
        return new Comparator<One>() {
            @Override
            public int compare(One o1, One o2) {
                return o1.lenght.compareTo(o2.lenght);
            }
        };
    }

    public static Comparator<One> comparator_for_width(){
        return new Comparator<One>() {
            @Override
            public int compare(One o1, One o2) {
                return o1.width.compareTo(o2.width);
            }
        };
    }

    public static Comparator<One> comparator_for_weight(){
        return new Comparator<One>() {
            @Override
            public int compare(One o1, One o2) {
                return o1.weight.compareTo(o2.weight);
            }
        };
    }
}
