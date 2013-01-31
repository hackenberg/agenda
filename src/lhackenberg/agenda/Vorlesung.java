package lhackenberg.agenda;

import org.joda.time.DateTime;

import java.util.TreeSet;

public class Vorlesung extends Course {

    private TreeSet<DateTime> lessons;
    private TreeSet<DateTime> tests;

    protected Vorlesung(String courseNr, String name, String semester) {
        super(courseNr, name, semester);
        lessons = new TreeSet<DateTime>();
        tests = new TreeSet<DateTime>();
    }

    protected void addLesson(DateTime dateTime) {
        lessons.add(dateTime);
    }

    protected void addTest(DateTime dateTime) {
        tests.add(dateTime);
    }

    protected void removeLesson(DateTime dateTime) {
        lessons.remove(dateTime);
    }

    protected void removeTest(DateTime dateTime) {
        tests.remove(dateTime);
    }

} // of class Vorlesung
