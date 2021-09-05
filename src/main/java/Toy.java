public class Toy extends Thread {

    protected Box box;

    public Toy(ThreadGroup group, String name, Box box) {
        super(group, name);
        this.box = box;
    }

    @Override
    public void run() {
        while (!isInterrupted()) {
            while (!box.isBoxToggleSwitch()) {
                if (isInterrupted()) return;
            }
            box.closeBox();
        }
    }
}
