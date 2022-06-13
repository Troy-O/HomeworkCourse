package Annotations_21_lesson;

import lombok.Getter;
import lombok.Setter;


import java.io.*;
import java.lang.reflect.Field;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.Objects;



public class One {
    @Annotation(name="Друга анотація")
    private String name;
    private int salary;
    private  int age;
    String file="D:\\Курси\\java homework\\HomeworkCourse\\src\\test\\java\\Annotations_21_lesson\\1.txt";
    @Annotation(name="Перша анотація")
    private String proffesional;

    public One(String name, int salary, int age, String proffesional) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.proffesional = proffesional;
    }



    public void used_reflection(One one) throws IOException {
        Class<? extends One> aClass = one.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        FileWriter fileWriter=new FileWriter(file);
        for (Field declaredField : declaredFields) {
            if (declaredField.isAnnotationPresent(Annotation.class)){
                String name = declaredField.getName();
                fileWriter.write(name);


            }


        }

        fileWriter.flush();
        fileWriter.close();
    }

 //не для дз по максимуму ,а для себе,але якщо зробив для максимуму то ок
    public void method_time(){
        LocalDate localDate =LocalDate.now();
        System.out.println("Local date"+" "+localDate);


        LocalTime localTime=LocalTime.now();
        System.out.println("Local time"+" "+localTime);


        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println("Local date time"+" "+localDateTime);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProffesional() {
        return proffesional;
    }

    public void setProffesional(String proffesional) {
        this.proffesional = proffesional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        One one = (One) o;
        return salary == one.salary && age == one.age && Objects.equals(name, one.name) && Objects.equals(proffesional, one.proffesional);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, salary, age, proffesional);
    }

    @Override
    public String toString() {
        return "One{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", proffesional='" + proffesional + '\'' +
                '}';
    }
}
