package Inner_class;

import java.util.*;

public class One implements Comparable<One> {
        String name;
        Integer lenght;
        Integer width;
        Integer weight;

        public One(String name, int lenght, int width, int weight) {
            this.name = name;
            this.lenght = lenght;
            this.width = width;
            this.weight = weight;
        }
        //цей ліст для методів 1,2,3,8
        List<String> listlinked=new LinkedList<>();
        //цей ліст для сортування, для завдання 4,5,6,7
        List<One>  list=new ArrayList<>();





        //для перевірки справності  2 3 8 методу треба запустити 1,тому що наповнення є тільки в 1 методі
        // Якщо запустити зразу 2 3 або 8 нічого не буде бо колекція пуста
        void hometask_1() {
            boolean a=true;
//        класи комодіті для наповнення ліста для завдання 4,5,6,7
            One com5=new One("Вода",4,10,5);
            One com1=new One("Чипси",5,15,5);
            One com2=new One("Гречка",6,20,1);
            One com3=new One("Сигарети",8,5,2);
            One com4=new One("Гречка",6,8,1);
            list.add(com1);
            list.add(com2);
            list.add(com3);
            list.add(com4);
            list.add(com5);
            while (a) {

                System.out.println("Введи число:");
                Scanner scanner = new Scanner(System.in);
                int x = scanner.nextInt();
                switch (x) {
                    case 1:
                        add_item();
                        break;
                    case 2:
                        remove_item();
                        break;
                    case 3:
                        change();
                        break;
                    case 4:
                        Comparator<One> oneComparator = Two.comparator_for_name();
                        Collections.sort(list,oneComparator);
                        System.out.println(list.toString());
                        break;
                    case 5:
                        Comparator<One> oneComparator1 = Two.comparator_for_lenght();
                        Collections.sort(list,oneComparator1);
                       System.out.println(list.toString());
                        break;
                    case 6:
                        Comparator<One> oneComparator2 = Two.comparator_for_width();
                        Collections.sort(list,oneComparator2);
                       System.out.println(list.toString());
                        break;
                    case 7:
                        Comparator<One> oneComparator3 = Two.comparator_for_weight();
                        Collections.sort(list,oneComparator3);
                        System.out.println(list.toString());
                        break;
                    case 8:
                        i_element_collections();
                        break;
                    case 9:
                        System.exit(0);
                        break;

                }
            }
        }


        //додати товар
        void  add_item(){
            System.out.println("Який товар бажаєте добавити?");
            Scanner scanner=new Scanner(System.in);
            String s=scanner.nextLine();
            listlinked.add(s);

            System.out.println(listlinked.toString());

        }

        // Видалити товар
        void remove_item(){
            System.out.println("Введіть назву предмету яку хочете видалити:");
            Scanner scanner=new Scanner(System.in);
            String s=scanner.nextLine();
            System.out.println(listlinked.toString());
            for (String s1 : listlinked) {
                if (s.equalsIgnoreCase(s1)==true){
                    listlinked.remove(s1);
                }
            }
            System.out.println(listlinked.toString());
        }

        // Замінити товар
        void change(){
            //можна було і легше зробити,а саме через простий індекс,але зробив трохи тяжкішу логіку
            System.out.println("Введи товар який хочеш вставити:");
            Scanner scanner=new Scanner(System.in);
            String sa=scanner.nextLine();
            System.out.println("Введи товар який хочеш замінити:");
            Scanner scanner1=new Scanner(System.in);
            String san=scanner1.nextLine();
            for (String s : listlinked) {
                if (san.equalsIgnoreCase(s)==true){
                    int index=listlinked.indexOf(s);
                    listlinked.set(index,sa);

                }

            }
            System.out.println(listlinked.toString());
        }


        //сортування по назві,по довжині,ширині і вазі
        void sort(){
            One com5=new One("Вода",4,10,5);
            One com1=new One("Чипси",5,15,5);
            One com2=new One("Гречка",6,20,1);
            One com3=new One("Сигарети",8,5,2);
            One com4=new One("Гречка",6,8,1);
            list.add(com1);
            list.add(com2);
            list.add(com3);
            list.add(com4);
            list.add(com5);
            System.out.println(list.toString());
            Collections.sort(list);
            System.out.println(list.toString());

        }

        //Виводимо і-тий елемент колекції(який ми вводимо з консолі(використовуємо Scanner))
        void i_element_collections(){
            System.out.println("Введіть i елемент колекцій який треба вивести:");
            Scanner scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            for (String s : listlinked) {
                if (listlinked.indexOf(s)==a){
                    int ab=listlinked.indexOf(s);
                    System.out.println(listlinked.get(ab));
                }
            }
        }





        public int compareTo(One o) {
            int abc=this.name.compareTo(o.name);
            if (abc==0){
                abc=this.lenght.compareTo(o.lenght);
                if (abc==0){
                    abc=this.width.compareTo(o.width);
                    if (abc==0){
                        abc=this.weight.compareTo(o.weight);

                    }
                }
            }

            return abc;
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        One one = (One) o;
        return Objects.equals(name, one.name) && Objects.equals(lenght, one.lenght) && Objects.equals(width, one.width) && Objects.equals(weight, one.weight) && Objects.equals(listlinked, one.listlinked) && Objects.equals(list, one.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lenght, width, weight, listlinked, list);
    }

    @Override
    public String toString() {
        return "One{" +
                "name='" + name + '\'' +
                ", lenght=" + lenght +
                ", width=" + width +
                ", weight=" + weight +
                ", listlinked=" + listlinked +
                ", list=" + list +
                '}';
    }
}




