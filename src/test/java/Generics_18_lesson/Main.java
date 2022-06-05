package Generics_18_lesson;

public class Main {
    public static void main(String[] args) {
    MyEntry<Integer,String> myEntry=new MyEntry(1,"Горбайчук Марк Андрійович",+380900000);


    myEntry.add_to_map();

    myEntry.remove_key(972130354);

    myEntry.remove_value("Bekar");

    myEntry.set_keys();

    myEntry.list_value();

    myEntry.all_map();


    }
}
