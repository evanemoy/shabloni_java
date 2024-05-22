package prac5;

public class Singleton_1 {
    private static Singleton_1 INSTANCE = new Singleton_1();
    private Singleton_1(){}
    public void printMessage(){
        System.out.println("Message from singleton 1");
    }
    public static Singleton_1 getInstance(){
        return Singleton_1.INSTANCE;
    }
}

