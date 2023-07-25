import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private String fullName;
    private LocalDate dateOfBirth;

    public Person(String firstName, String lastName, LocalDate dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;

        this.fullName = this.firstName + " " + this.lastName;
    }

    public Person(String firstName, String lastName) {
        this(firstName, lastName, LocalDate.now());
    }

    public String getFirstName() {
       return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }
}
