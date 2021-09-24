package rcs.examples.classes;

import java.util.List;

public class Teacher extends Person {
    public List<String> subjects;
    public String degree;

    public Teacher(String name, String surname) {
        super(name, surname);
    }

    @Override
    public void show() {
        System.out.println(String.format("Hello from %s %s. I'm a teacher.", name, surname));
    }
}
