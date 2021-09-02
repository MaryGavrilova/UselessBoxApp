public class Box {

    volatile boolean boxToggleSwitch;

    private static Box box = null;

    private Box() {
    }

    public static Box getInstance() {
        if (box == null) box = new Box();
        return box;
    }

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
