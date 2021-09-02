public class Toy extends Thread {

    Box box = Box.getInstance();

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
