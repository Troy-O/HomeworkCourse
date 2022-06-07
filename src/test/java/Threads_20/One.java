package Threads_20;

import java.util.Scanner;

public class One extends Thread{

    void  method(){
        System.out.println("Введіть цифру:");
        Scanner scanner=new Scanner(System.in);
         int number=scanner.nextInt();
         int n0 = 1;
         int n1 = 1;
         int n2;
        System.out.print(n0+" ");
        try {
           Thread.sleep(1000);
        }catch (Exception e){

        }
        System.out.print(n1+" ");
        try {
            Thread.sleep(1000);
        }catch (Exception e){

        }
         for(int i = 3; i <= number; i++){
             n2=n0+n1;
             try{
                Thread.sleep(1000);
             }catch (Exception e){

             }
             System.out.print(n2+" ");
             n0=n1;
             n1=n2;
         }
         System.out.println();
    }

    @Override
    public void run() {
        try {
            method();
        }catch (Exception e){
            e.getMessage();
            e.getStackTrace();

        }
    }
}
