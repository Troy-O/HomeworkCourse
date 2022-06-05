package Generics_18_lesson;

import java.util.*;

public class MyEntry <K,V>{
    private K key;
    private V value;
    private K tel;

    public MyEntry(K key, V value, K tel) {
        this.key = key;
        this.value = value;
        this.tel = tel;
    }

    Map<Integer, String>map=new HashMap<>();


    public void add_to_map(){

            System.out.println("Введіть номер телефона:");
            Scanner scanner = new Scanner(System.in);
            int phone = scanner.nextInt();
            System.out.println("Введіть прізвище,імя,по-батькові:");
            Scanner scanner1 = new Scanner(System.in);
            String s = scanner1.nextLine();
            map.put(phone, s);
            System.out.println(map.toString());

    }

    public  void remove_key(int number){
        map.remove(number);
        System.out.println(map.toString());
    }


    public  void remove_value(String value) {

        for (Map.Entry<Integer, String> m :map.entrySet()){
            if (m.getValue().equals(value)==true){
                int ac= m.getKey();
                map.remove(ac);
                System.out.println(map.toString());
            }

        }


    }


    public void set_keys(){
        Set<Integer> integers = map.keySet();
        System.out.println(integers);

    }

    public  void list_value(){
        Collection<String> values = map.values();
        System.out.println(values);
    }

    public void all_map(){
        System.out.println(map.toString());
        // or
        for (Map.Entry<Integer,String> mapa:map.entrySet()){
            System.out.println("Ключ:"+" "+mapa.getKey()+" "+" "+"Значення:"+" "+mapa.getValue());
        }
    }







    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public K getTel() {
        return tel;
    }

    public void setTel(K tel) {
        this.tel = tel;
    }


    @Override
    public String toString() {
        return "MyEntry{" +
                "key=" + key +
                ", value=" + value +
                ", tel=" + tel +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEntry<?, ?> myEntry = (MyEntry<?, ?>) o;
        return Objects.equals(key, myEntry.key) && Objects.equals(value, myEntry.value) && Objects.equals(tel, myEntry.tel) && Objects.equals(map, myEntry.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value, tel, map);
    }
}
