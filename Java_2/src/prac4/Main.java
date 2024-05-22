package prac4;

public class Main {

    public static void main(String[] args) {
        Realization result = new Realization(5);
        result.submit(() -> {
            try {
                Thread.sleep(200L);
            } catch (InterruptedException var1) {
                var1.printStackTrace();
            }

            System.out.println("We run it");
        });
        result.submit(() -> {
            System.out.println("Start");
        });
    }
}
