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

    @Override
    public String toString() {
        return "Device{" +
                "serialNumber=" + serialNumber +
                ", brand='" + brand + '\'' +
                ", info='" + info + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Objects.equals(serialNumber, device.serialNumber) && Objects.equals(brand, device.brand) && Objects.equals(info, device.info) && Objects.equals(price, device.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber, brand, info, price);
    }
}



















