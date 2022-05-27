package Map_15_les;

import java.util.*;

public class ZooClub {
    Map<Person,List<Animal>>map=new LinkedHashMap();
    Person person1=new Person("Петро",33);
    Person per2=new Person("STAS",54);

    void menu() {
        Person person=new Person("Dima",23);

        while (true) {
            System.out.println("Введіть число:");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    //метод який потрібний в дз
                    add_people_to_club(person);
                    break;
                case 2:
                    add_people_to_club(person);
                    //метод який потрібний в дз
                    add_animal_to_person(person,new Animal("Dog","bobik"));
                    add_animal_to_person(person, new Animal("Cat", "murko"));
                    break;
                case 3:
                    add_people_to_club(person);
                    add_animal_to_person(person,new Animal("Dog","bobik"));
                    //метод який потрібний в дз
                    remove_animal_from_person(person,new Animal("Dog","bobik"));
                    break;
                case 4:
                    add_people_to_club(person);
                    add_people_to_club(person1);
                    add_people_to_club(per2);
                    //метод який потрібний в дз
                    remove_people(person);
                    break;
                case 5:
                    // для заповнення Map
                    ////      |
                    ///      \/
                    add_people_to_club(person);
                    add_people_to_club(person1);
                    add_people_to_club(per2);
                    ////метод який потрібний в дз
                    all_map();
                    break;
                case 6:
                    System.exit(0);
            }
        }
    }

    void add_people_to_club(Person person){
        map.put(person,new ArrayList<>());
        System.out.println(map.toString());
    }


    void add_animal_to_person(Person person, Animal animal){

        if (map.containsKey(person)){
            List<Animal> animals = map.get(person);
            animals.add(animal);
            map.put(person,animals);
            System.out.println(map.toString());

        }else {
            map.put(person, List.of(animal));

        }

    }
    void  remove_people(Person person){
        map.remove(person);
        System.out.println("Наявне з  мапи:"+" "+map.toString());
    }

//    void remove


    void all_map(){
        Set<Map.Entry<Person, List<Animal>>> entries = map.entrySet();
        for (Map.Entry<Person, List<Animal>> entry : entries) {
            System.out.println(entry);
        }
    }
    void remove_animal_from_person(Person person,Animal animal){
        List<Animal> animals = map.get(person);
        animals.remove(animal);
        map.put(person,animals);
        System.out.println(map.toString());
    }


}
