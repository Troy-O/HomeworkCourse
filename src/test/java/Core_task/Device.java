package Core_task;

import lombok.Data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
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
}



















