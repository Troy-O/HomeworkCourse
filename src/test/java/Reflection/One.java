package Reflection;

import java.util.*;

public class One {
    private String name;
    private Integer age;
    private String about;
    private double salary;


    Map<String,Integer> map= new HashMap<>();


    public One(String name, Integer age, String about, Double salary) {
        this.name = name;
        this.age = age;
        this.about = about;
        this.salary = salary;
    }

    public One(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public One(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    private void private_methods(){
        System.out.println("Приватний метод");
    }
    void full_information(String about_you){
        System.out.println("Імя:"+name+" "+"вік:"+age+" "+"опис:"+about+" "+"зарплата:"+salary);
        System.out.println("Параметир:"+about_you);
    }
    void random_methods (){
        System.out.println("Введіть свій вік:");
        Scanner scanner=new Scanner(System.in);
        int abv=scanner.nextInt();
        if (abv>=18){
            System.out.println("Введіть своє прізвище:");
            Scanner scanner1=new Scanner(System.in);
            String name_time=scanner1.nextLine();
            map.put(name_time,abv);
            System.out.println("Mapa"+map.toString());
        }else {
            System.out.println("Ви неповнолітній!!!!");
            System.exit(0);
        }

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        One one = (One) o;
        return Objects.equals(name, one.name) && Objects.equals(age, one.age) && Objects.equals(about, one.about) && Objects.equals(salary, one.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, about, salary);
    }

    @Override
    public String toString() {
        return "One{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", about='" + about + '\'' +
                ", salary=" + salary +
                '}';
    }
}
