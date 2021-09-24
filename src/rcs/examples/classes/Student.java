package rcs.examples.classes;

public class Student extends Person {

    public String course;
    public int studyYear;

    public Student(String name, String surname, String phoneNumber) {
        super(name, surname, phoneNumber);
    }

    public Student(String name, String surname, String course, int studyYear) {
        super(name, surname);
        this.course = course;
        this.studyYear = studyYear;
    }

    @Override
    public void show() {
        System.out.println(String.format("Hello from %s %s. I'm studying %s in year %d", name, surname, course, studyYear));
    }
}
