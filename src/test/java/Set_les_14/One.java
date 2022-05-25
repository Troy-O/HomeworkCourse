package Set_les_14;

import java.util.Objects;

public class One implements  Comparable<One>{
    String name;
    Integer age;

    public One(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        One one = (One) o;
        return Objects.equals(name, one.name) && Objects.equals(age, one.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "One{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(One o) {
        int a=this.name.compareTo(o.name);
        if (a==0){
             a=this.age.compareTo(o.age);
        }
        return a;
    }
}
