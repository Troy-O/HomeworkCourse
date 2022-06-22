package Core_task;


import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Main {
    public static final String name1 = "D:\\Курси\\java homework\\HomeworkCourse\\src\\test\\java\\Core_task\\1.txt";

    public static void main(String[] args) throws IOException, Two {
        Device device10=new Device();
        Scanner scan = new Scanner(new File(name1));
        ArrayList<Device> list = new ArrayList<>();

        while (scan.hasNextLine()) {
            String line = scan.nextLine();

            Device device = new Device();
            Scanner lineScanner = new Scanner(line).useDelimiter(",");
            while (lineScanner.hasNext()){
                String token = lineScanner.next();
                if (device.serialNumber == null){
                    device.serialNumber = Long.parseLong(token);
                }
                else if (device.brand == null){
                    device.brand = token;
                }
                else if (device.info == null){
                    device.info = token;
                }
                else if (device.price == null){
                    device.price = Integer.parseInt(token);
                    list.add(device);
                }
            }
            lineScanner.close();
        }

        System.out.println(list);
        scan.close();

        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                device10.tostring(list);
                break;
            case 2:
                device10.serialnumber(list);
                break;
            case 3:
                device10.brand_compareto(list);
                break;
            case 4:
                device10.price_more_400(list);
                break;
            case 5:
                device10.serialnumber_com_0(list);
                break;
            case 6:
                device10.expensive_price(list);
                break;
        }
    }
}


