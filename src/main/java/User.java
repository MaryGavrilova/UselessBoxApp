public class User extends Thread {
    static final int REQUIRED_NUMBER_OF_OPENINGS = 3;
    static final int TIME_OUT = 3000;

    protected Box box;

    public User(ThreadGroup group, String name, Box box) {
        super(group, name);
        this.box = box;
    }

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
