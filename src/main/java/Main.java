import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Student student = new Student("Marco", "Developpi", LocalDate.of(1994, 06, 23));
        Person[] people = {
                new Student("Marco", "Developpi", LocalDate.of(1994, 06, 23)),
                new Person("Giulio", "Qualunque", LocalDate.of(1993, 06, 23)),
                new Person("Marco", "Rossi"),
        };

        Person[] newborns = {
                new Person("Licio", "Rossi"),
                new Person("Marta", "Rossi"),
                new Person("Gesualda", "Rossi"),
        };


        printFullNames(people);
        printFullNames(newborns);
    }

    public static void printFullNames(Person[] peopleArray) {
        for(Person person : peopleArray) {
            System.out.println(person.getFullName());
        }
    }
}
