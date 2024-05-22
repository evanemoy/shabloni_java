package prac5;

public class Main {
    public static void main(String[] args) {
        var s1 = Singleton_1.getInstance();
        s1.printMessage();
        var s2 = Singleton_2.getInstance();
        s2.printMessage();
        var s3 = Singleton_3.getInstance();
        s3.printMessage();
    }
}
