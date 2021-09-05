public class Box {

    volatile boolean boxToggleSwitch;

    public boolean isBoxToggleSwitch() {
        return boxToggleSwitch;
    }

    public void openBox() {
        boxToggleSwitch = true;
        System.out.println("Открыл коробку");
    }

    public void closeBox() {
        boxToggleSwitch = false;
        System.out.println("Закрыл коробку");
    }
}
