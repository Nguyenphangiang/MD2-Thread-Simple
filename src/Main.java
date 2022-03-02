public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator("Generator1");
        NumberGenerator numberGenerator2 = new NumberGenerator("Generator2");
        new Thread(numberGenerator1).setPriority(Thread.MAX_PRIORITY);
        new Thread(numberGenerator2).setPriority(Thread.MIN_PRIORITY);
        numberGenerator1.start();
        numberGenerator2.start();
    }
}
