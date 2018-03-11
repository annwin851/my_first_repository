import java.lang.reflect.Field;

public class ReflectionExample {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Monitor monitor = new Monitor ("Dell", "RLO340", 8593);

        Class monitorClass = monitor.getClass();

        Field nameField = monitorClass.getDeclaredField("name");
        nameField.setAccessible(true);
        System.out.println("Before = " + monitor.getName());
        nameField.set(monitor, "Mell");
        System.out.println("After = " + monitor.getName());

    }
}
