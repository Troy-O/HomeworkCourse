package Map_15_les;

import java.util.Objects;

public class Animal {
    String type_animal;
    String name;

    public Animal(String type_animal, String name) {
        this.type_animal = type_animal;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(type_animal, animal.type_animal) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type_animal, name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type_animal='" + type_animal + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
