package Threads_20;

import java.util.Scanner;

public class Two implements  Runnable{
    Thread t;
    String name;

    Two(String name_threads){
        name=name_threads;
        t=new Thread(this,name_threads);
        t.start();
    }

     void  method(){
         System.out.println("Введіть цифру:");
         Scanner scanner=new Scanner(System.in);
         int number = scanner.nextInt();
         int fib[] = new int[number];
         if(number>=0)
             fib[0] = 0;
         if(number>=1)
             fib[1] = 1;
         for(int i=2;i<number;i++)
             fib[i] = fib[i-1] + fib[i-2];
         for(int i=number-1;i>=0;i--) {
             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }

             System.out.print(fib[i] + " ");
         }
     }


    @Override
    public void run() {
       try {
           method();

       }catch (Exception e){
           System.out.println(e.getStackTrace());
           System.out.println(e.getMessage());
       }
    }
}
