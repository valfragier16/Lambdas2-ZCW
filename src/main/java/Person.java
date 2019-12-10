import java.time.LocalDate;
import java.util.List;

public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private LocalDate birthday;
    private Sex gender;
    private String emailAddress;

    // Nullary constructor
    public Person() {
    }

    public Person(String name, LocalDate birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    LocalDate getBirthday() {
        return birthday;
    }

    void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    Sex getGender() {
        return gender;
    }

    void setGender(Sex gender) {
        this.gender = gender;
    }

    String getEmailAddress() {
        return emailAddress;
    }

    void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void printPerson() {
        System.out.println(String.format("Name: %s\nBirthdate: %s\nSex: %s\nE-mail: %s"
                ,this.getName()
                ,this.getBirthday()
                ,this.getGender()
                ,this.getEmailAddress()));
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}
