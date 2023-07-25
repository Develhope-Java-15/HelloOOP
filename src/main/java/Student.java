import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
    private List<String> courses;

    public Student(Person person) {
        this(person.getFirstName(), person.getLastName(), person.getDateOfBirth());
    }

    public Student(String firstName, String lastName, LocalDate dateOfBirth) {
        super(firstName, lastName, dateOfBirth);
        this.courses = new ArrayList<>();
    }

    public void enroll(String course) {
       this.courses.add(course);
    }

    public String getSchool() {
        return "Develhope";
    }
}
