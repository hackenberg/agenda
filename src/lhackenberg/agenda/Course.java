package lhackenberg.agenda;

import org.joda.time.DateTime;

import java.io.Serializable;
import java.sql.Connection;
import java.util.TreeSet;

public class Course implements Serializable {

    private String courseNr, name, semester;
    private TreeSet<DateTime> assignments, lectures, tests;

    protected Course(String courseNr, String name, String semester) {
        setCourseNr(courseNr);
        setName(name);
        setSemester(semester);
        assignments = new TreeSet<DateTime>();
        lectures = new TreeSet<DateTime>();
        tests = new TreeSet<DateTime>();
    }

    protected String getCourseNr() { return this.courseNr; }
    protected void setCourseNr(String courseNr) { this.courseNr = courseNr; }

    protected String getName() { return this.name; }
    protected void setName(String name) { this.name = name; }

    protected String getSemester() { return this.semester; }
    protected void setSemester(String semester) { this.semester = semester; }

    protected TreeSet<DateTime> getAssignments() { return assignments; }
    protected void setAssignments(TreeSet<DateTime> assignments) {
        this.assignments = assignments;
    }

    protected TreeSet<DateTime> getLectures() { return lectures; }
    protected void setLectures(TreeSet<DateTime> lectures) {
        this.lectures = lectures;
    }

    protected TreeSet<DateTime> getTests() { return tests; }
    protected void setTests(TreeSet<DateTime> tests) {
        this.tests = tests;
    }

} // of class Course
