package IO;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ArrayList<Employee> arrayList=new ArrayList<>();
        Employee employee=new Employee("Дмитро",249193,99999);
        Employee employee1=new Employee("Петро",568343,141223);
        Employee employee2=new Employee("Остап",281331,999919);
        Employee employee3=new Employee("Андрій",443513,123199);
        Employee employee4=new Employee("Марк",900231,9312999);

        arrayList.add(employee);
        arrayList.add(employee1);
        arrayList.add(employee2);
        arrayList.add(employee3);
        arrayList.add(employee4);
        arrayList.add(employee);

        Salary salary=new Salary(975442123,"Олег");
        Salary salary_null=new Salary();

        Methods methods=new Methods();

        //1-2 підпункт
        methods.serialize(employee);
        methods.deserialize();


        //3 підпункт
        methods.serialize(arrayList);
        methods.deserialize();


        //4 під пункт
        methods.serialize(salary);
        methods.deserialize(salary_null);




    }
}
