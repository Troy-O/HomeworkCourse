package IO;

import java.io.Serializable;
import java.util.Objects;

public class Salary implements Serializable {
    private int time_number;
    private String name;
    private static final long serialVersionUID = 212312312L;

    public Salary() {
    }
    public Salary(int time_number, String name) {
        this.time_number = time_number;
        this.name = name;
    }








    public int getTime_number() {
        return time_number;
    }

    public void setTime_number(int time_number) {
        this.time_number = time_number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salary salary = (Salary) o;
        return time_number == salary.time_number && Objects.equals(name, salary.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time_number, name);
    }

    @Override
    public String toString() {
        return "Salary{" +
                "time_number=" + time_number +
                ", name='" + name + '\'' +
                '}';
    }
}
