public class Main {
    public static void main(String[] args) {
        try {
            Box box = new Box();
            User user = new User(null, "User", box);
            Toy toy = new Toy(null, "User", box);
            user.start();
            toy.start();
            user.join();
            toy.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
