package Core_task;


import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static final String name1 = "D:\\Курси\\java homework\\HomeworkCourse\\src\\test\\java\\Core_task\\1.txt";

    public static void main(String[] args) throws IOException, Two {

        Device device = new Device();
        Device device1 = new Device();
        Device device2 = new Device();
        Device device3 = new Device();

        List<Device> list = new LinkedList<>();
        list.add(device);
        list.add(device1);
        list.add(device2);
        list.add(device3);


        FileReader reader = new FileReader(name1);
        int readers;

        while (reader.read()!=1) {
            StringBuilder serialNumber1 = new StringBuilder();

            while ((readers = reader.read()) != 44) {
                serialNumber1.append((char) readers);
            }
            StringBuilder brand1 = new StringBuilder();
            while ((readers = reader.read()) != 44) {
                brand1.append((char) readers);
            }
            StringBuilder info1 = new StringBuilder();
            while ((readers = reader.read()) != 44) {
                info1.append((char) readers);
            }
            StringBuilder pric1 = new StringBuilder();
            while ((readers = (char) (reader.read())) != 13) {
                pric1.append((char) readers);
            }

            for (Device devices : list) {
                devices.serialNumber = Long.parseLong(serialNumber1.toString());
                devices.brand = brand1.toString();
                devices.info = info1.toString();
                devices.price = Integer.parseInt(pric1.toString());
                System.out.println(devices);
            }

        }
        reader.close();
        System.out.println(list.toString());

//        Device device12 = new Device(20141, "Adidas", "Petro", 103);
//        Device device10 = new Device(32521, "puma", "Andrii", 410);
//        Device device20 = new Device(6314, "Dolly", "STAS", 100000);
//        Device device30 = new Device(12412, "balenciaga", "etro", 231);
//        list.add(device12);
//        list.add(device10);
//        list.add(device20);
//        list.add(device30);
        System.out.println("Введіть цифру:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                System.out.println(list.toString());
                break;
            case 2:
                List<Device>list1=new LinkedList<>();
                System.out.println("Введи серійний номер:");
                Scanner scanner1 = new Scanner(System.in);
                long serial_number990 = scanner1.nextLong();
                for (Device device234 : list) {
                    if (serial_number990==device234.serialNumber){
                        System.out.println(device234);
                        list1.add(device234);

                    }
                }
                if (list1.isEmpty()==true){
                    throw new Two();
                }
                break;
            case 3:
                Stream<Device> stream = list.stream();
                stream.sorted(new Comparator<Device>() {
                    @Override
                    public int compare(Device o1, Device o2) {
                        return o1.brand.compareTo(o2.brand);
                    }
                }).forEach(System.out::println);
                break;
            case 4:
                Stream<Device> stream1 = list.stream();
                stream1.filter(parametr -> {
                    if (parametr.price > 400) {
                        return true;
                    }
                    return false;
                }).forEach(System.out::println);
                break;
            case 5:
                Stream<Device> stream4 = list.stream();
                stream4.filter(parametr1 -> {
                    Pattern pattern = Pattern.compile(".0");
                    String par = String.valueOf(parametr1.serialNumber);
                    Matcher matcher = pattern.matcher(par);

                    if (matcher.find() == true && 800 > parametr1.price) {
                        return true;
                    }
                    return false;
                }).forEach(System.out::println);
                break;
            case 6:
                Stream<Device> stream3 = list.stream();
                Optional<Device> first = stream3.sorted(new Comparator<Device>() {
                    @Override
                    public int compare(Device o1, Device o2) {
                        return o2.price.compareTo(o1.price);
                    }
                }).findFirst();
                System.out.println(first);


                }
        }
    }

