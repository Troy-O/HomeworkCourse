package Annotations_21_lesson;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        One one=new One("Дмитро",12222,19,"безробітній");
        try {
            one.used_reflection(one);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        one.method_time();

    }




}
