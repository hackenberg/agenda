package lhackenberg.agenda;

import java.util.TreeSet;
import org.joda.time.DateTime;

public class Uebung extends Course {

    private TreeSet<DateTime> assignments;
    private TreeSet<DateTime> lessons;
    private TreeSet<DateTime> tests;

    protected Uebung(String courseNr, String name, String semester) {
        super(courseNr, name, semester);
        assignments = new TreeSet<DateTime>();
        lessons = new TreeSet<DateTime>();
        tests = new TreeSet<DateTime>();
    }

    protected void addAssignment(DateTime dateTime) {
        assignments.add(dateTime);
    }

    protected void addLesson(DateTime dateTime) {
        lessons.add(dateTime);
    }

    protected void addTest(DateTime dateTime) {
        tests.add(dateTime);
    }

    protected void removeAssignment(DateTime dateTime) {
        assignments.remove(dateTime);
    }

    protected void removeLesson(DateTime dateTime) {
        lessons.remove(dateTime);
    }

    protected void removeTest(DateTime dateTime) {
        tests.remove(dateTime);
    }

} // of class Uebung
