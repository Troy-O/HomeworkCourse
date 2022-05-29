package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
    One one=new One("Дмитро",19,"Студент",9999999.0);
    One one1=new One("Павло",2300000.23);
    One one2=new One("Остав",56,10000.97);
//    one.full_information();
//    one.random_methods();

//для працювання із класом по пакету,тобто пошук класа вказуючи пакет
//        Class<?> aClass1 = Class.forName("");


        Class<? extends One> aClass = one.getClass();

        //дз
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("Назва:"+declaredMethod.getName()+"  "+"Тип:"+" "+declaredMethod.getReturnType());
        }

        //дз
        //всередину getConstructors(String.class) можна передавати тип параметрів конструктора який нам потрібний
        Constructor<?>[] constructors = aClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("Конструктор"+" "+constructor+" "+"Кількість елементів у коснтрукторі: "
            +constructor.getParameterCount());

        }
        //дз
        /// declaredFields.setAccessible не прописувався,і без нього маю доступ до казрити змінних,незнаю в чом проблема
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("Назва змінной:"+" "+declaredField.getName()+"     "+"тип:"+declaredField.getType());

        }

        //дз
        Method random_methods = aClass.getDeclaredMethod("random_methods");
        random_methods.invoke(one2);
        Method full_information = aClass.getDeclaredMethod("full_information",String.class);
        full_information.invoke(one,"Я студент");

        //дз
        Constructor<? extends One> constructor = aClass.getConstructor(String.class,Integer.class,String.class,Double.class);
        One two=constructor.newInstance("Саша",69,"Пенсіонер",4500.0);
        System.out.println(two.toString());
        Constructor<? extends One> constructor1 = aClass.getConstructor(String.class, Double.class);
        One three=constructor1.newInstance("Пенісонер",6900.0);
        System.out.println(three.toString());



    }
}
