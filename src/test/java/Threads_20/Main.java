package Threads_20;

public class Main {
    public static void main(String[] args) {
    //Thread
    One one=new One();
    one.start();






        /// Runnable
        Two two=new Two("Потік 1");
        try{
            two.t.join();
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        System.out.println("\n"+"Головний потік завершився");
    }
}
