import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Person baby = new Person("Mario", "Rossi");
        Person elder = new Person("Gioacchino", "Rossi", LocalDate.of(1940, 10, 10));

        System.out.println(baby.getFullName());
        System.out.println(elder.getFullName());
    }
}
