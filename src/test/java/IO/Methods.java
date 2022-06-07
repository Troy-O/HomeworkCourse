package IO;

import java.io.*;
import java.util.ArrayList;

public class Methods {



    String name="D:\\Курси\\java homework\\HomeworkCourse\\src\\test\\java\\IO\\1.txt";
    public void serialize(Employee objects) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(name);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(objects);

        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public void serialize(ArrayList o) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(name);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(o);

        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public  void deserialize() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream=new FileInputStream(name);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

        Object employee = objectInputStream.readObject();
        System.out.println(employee);


    }


    public void serialize(Salary salary) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream(name);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(salary);

        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.flush();
        fileOutputStream.close();
    }

    public void deserialize(Salary o) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream=new FileInputStream(name);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);

        o = (Salary) objectInputStream.readObject();
        System.out.println(o);

    }
}
