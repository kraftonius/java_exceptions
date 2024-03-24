package Seminar3.Task2;

public class Main {
    public static void main(String[] args) {
        try (Counter counter = new Counter(2)) {
            counter.add();
            counter.close();
            counter.add();
            System.out.println(counter.getCount());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
