public class User extends Thread {
    static final int REQUIRED_NUMBER_OF_OPENINGS = 3;
    static final int TIME_OUT = 3000;

    Box box = Box.getInstance();

    @Override
    public void run() {
        try {
            int counter = 0;
            while (counter < REQUIRED_NUMBER_OF_OPENINGS) {
                box.openBox();
                counter++;
                Thread.sleep(TIME_OUT);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
