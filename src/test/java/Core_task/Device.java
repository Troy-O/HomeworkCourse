package Core_task;

import lombok.Data;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

@Data
public class Device {



    Long serialNumber;
    String brand;
    String info;
    Integer price;



//    List<Device> list=new ArrayList<>();
//    void reading() throws IOException {
//        FileReader reader = new FileReader(name1);
//        int readers ;
//        StringBuilder serialNumber1 = new StringBuilder();
//
//        while ((readers = reader.read()) != 44){
//            serialNumber1.append((char) readers);
//        }
//        StringBuilder brand1 = new StringBuilder();
//        while((readers =reader.read()) != 44){
//            brand1.append((char) readers);
//        }
//        StringBuilder info1 = new StringBuilder();
//        while ((readers =reader.read()) != 44){
//            info1.append((char) readers);
//        }
//        StringBuilder pric1= new StringBuilder();
//        while((readers =reader.read()) != 10){
//            pric1.append((char) readers);
//        }
//        Device device = new Device();
//        device.serialNumber = Long.parseLong(serialNumber1.toString());
//        device.brand = brand1.toString();
//        device.info = info1.toString();
//        device.price = Integer.parseInt(pric1.toString());
//        System.out.println(device);
//
//
//    }


//    public Device(long serialNumber, String brand, String info, int price) {
//        this.serialNumber = serialNumber;
//        this.brand = brand;
//        this.info = info;
//        this.price = price;
//    }


    void tostring(List<Device> list){
        System.out.println(list.toString());
    }

    void serialnumber(List<Device> list) throws Two {
        List<Device> list1 = new LinkedList<>();
        System.out.println("Enter serial number:");
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
    }


    void brand_compareto(List<Device> list){
        Stream<Device> stream = list.stream();
        stream.sorted(new Comparator<Device>() {
            @Override
            public int compare(Device o1, Device o2) {
                return o1.brand.compareTo(o2.brand);
            }
        }).forEach(System.out::println);
    }

    void price_more_400 (List<Device> list){
        Stream<Device> stream1 = list.stream();
        stream1.filter(parametr -> {
            if (parametr.price > 400) {
                return true;
            }
            return false;
        }).forEach(System.out::println);
    }

    void serialnumber_com_0 (List<Device> list){
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
    }

    void expensive_price (List<Device> list){
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



















