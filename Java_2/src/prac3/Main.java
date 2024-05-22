package prac3;

public class Main {
    public static void main(String[] args) {

        ConcurrentSet<Integer> set = new ConcurrentSet<>();
        ConcurrentMap<Integer, Integer> map = new ConcurrentMap<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.stream().forEach((s) -> System.out.print(s + " "));
        System.out.print("\nМетод isEmpty(): " + set.isEmpty() + "\n");
        System.out.print("Метод contains(3): " + set.contains(3) + "\n");
        System.out.print("Метод remove(5): " + set.remove(5) + "\n");
        System.out.print("Метод size(): " + set.size() + "\n");


        map.put(2, 2);
        map.put(3, 3);
        map.put(4, 4);
        map.put(5, 5);
        map.put(6, 6);
        map.keySet().forEach((s) -> System.out.print(s + " "));
        System.out.print("\nМетод isEmpty(): " + map.isEmpty() + "\n");
        System.out.print("Метод containsValue(2): " + map.containsValue(2) + "\n");
        System.out.print("Метод remove(3): " + map.remove(3) + "\n");
        System.out.print("Метод size(): " + map.size() + "\n");

    }
}
