package prac5;

public class Singleton_3 {
    private Singleton_3() {
    }
    public void printMessage(){
        System.out.println("Message from singleton 3");
    }
    private static class SingletonHolder {
        public static final Singleton_3 HOLDER_INSTANCE = new Singleton_3();
    }

    public static Singleton_3 getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}
