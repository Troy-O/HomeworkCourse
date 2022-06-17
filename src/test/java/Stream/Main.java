package Stream;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        People people=new People("Діма", 19, "Чоловік");
        People people1=new People("Петро",25,"Чоловік");
        People people2=new People("Аліна",23,"Жінка");
        People people3=new People("Настя",60,"Жінка");
        People people4=new People("Роман", 43, "Чоловік");
        List<People> list=new ArrayList<>();
        list.add(people);
        list.add(people1);
        list.add(people2);
        list.add(people3);
        list.add(people4);

        Stream<People> stream = list.stream();

        //всьо побудоване на 1 stream,тому не можна всьо запустити разом
        // ,тому по черзі треба розкоментовувати,лєнь було створювати по декілька stream і до кожного прописувати логіку


        //1
//        stream.filter((age)->{
//            if (age.getSex().equals("Чоловік")==true){
//                if (age.getAge()>=18 && age.getAge()<=27){
//                    return true;
//            }
//            }
//
//            return false;
//        }).forEach(System.out::println);
//        System.out.println(stream);



        //2
//        double asDouble = stream.filter(age -> {
//            if (age.sex.equals("Чоловік") == true) {
//                return true;
//            }
//            return false;
//        }).mapToDouble(age1 -> Double.parseDouble(String.valueOf(age1.age))).average().getAsDouble();
//        System.out.println(asDouble);


        //3 для чоловіків
//       stream.filter(age->{
//           if (age.getSex().equals("Чоловік")==true){
//                if (age.getAge()>=18 && age.getAge()<=60){
//                    return true;
//            }
//            }
//
//            return false;
//
//       }).forEach(System.out::println);




//        //3 для жінок
//       stream.filter(age_woman->{
//           if (age_woman.getSex().equals("Жінка")==true){
//               if (age_woman.getAge()>=18 && age_woman.getAge()<=55){
//                   return true;
//               }
//           }
//           return  false;
//       }).forEach(System.out::println);




        //4
//        stream.sorted(new Comparator<People>() {
//            @Override
//            public int compare(People o1, People o2) {
//                return o2.name.compareTo(o1.name);
//            }
//        }).forEach(System.out::println);



        //5 перший пункт
//       stream.sorted(new Comparator<People>() {
//           @Override
//           public int compare(People o1, People o2) {
//               return o1.age.compareTo(o2.age);
//
//           }
//       }).forEach(System.out::println);



       //5 другий пункт
//
//        stream.sorted(new Comparator<People>() {
//            @Override
//            public int compare(People o1, People o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        }).forEach(System.out::println);





        //6
//        Optional<People> first = stream.sorted(new Comparator<People>() {
//            @Override
//            public int compare(People o1, People o2) {
//                return o2.age.compareTo(o1.age);
//            }
//        }).findFirst();
//        System.out.println("Найстарша людина:"+" "+first);


        //7
//        Optional<People> first = stream.sorted(new Comparator<People>() {
//            @Override
//            public int compare(People o1, People o2) {
//                return o1.age.compareTo(o2.age);
//            }
//        }).findFirst();
//        System.out.println("Наймолодща людина:"+" "+first);




        //8
//        double number=stream.filter(sex->{
//            if (sex.sex.equals("Чоловік")==true){
//                return true;
//            }
//            return  false;
//        }).count();
//        System.out.println(number);


        //9
//        double number_2=stream.filter(sex->{
//            if (sex.sex.equals("Жінка")==true){
//                return  true;
//            }
//            return false;
//        }).count();
//        System.out.println(number_2);


        //10

//        stream.filter(name_people->{
//            Pattern pattern=Pattern.compile("^А");
//            Matcher matcher=pattern.matcher(name_people.name);
//            if (matcher.find()==true){
//                return true;
//            }
//            return false;
//        }).forEach(System.out::println);
    }
}
