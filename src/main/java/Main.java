public class Main {
    public static void main(String[] args) {
        try {
            User user = new User();
            Toy toy = new Toy();
            user.start();
            toy.start();
            user.join();
            toy.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
