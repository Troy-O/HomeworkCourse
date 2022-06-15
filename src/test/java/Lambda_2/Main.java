package Lambda_2;

public class Main {
    public static void main(String[] args) {
    One one=new One();
    one.use_lambdy(50,100,60,((a, b, c) -> {
        if (a>b && a>c){
            System.out.println("Максимальне значення"+" "+a);
            return a;
        }else if (b>a && b>c){
            System.out.println("Максимальне значення"+" "+b);
            return b;
        }else if (c>a && c>b){
            System.out.println("Максимальне значення"+" "+c);
            return c;
        }

        return 0;
    }),((a, b, c) -> {
        int suma=a+b+c;
        System.out.println("Сума всіх значень "+" "+suma);
        return suma;
    }),((a, b, c) -> {
        int central_num=(a+b+c)/3;
        System.out.println("Середнє значення через ділення "+" "+central_num);
        if (a>b && c>a || b>a && a>c){
            System.out.println("Середнє значення"+" "+a);
        } else if (b>a && c>b || a>b && b>c) {
            System.out.println("Середнє значення"+" "+b);
        } else if (c>a && b>c || a>c && c>b) {
            System.out.println("Середнє значення"+" "+c);
        }

        return 0;
    }));


    }
}
