package lhackenberg.agenda;

public abstract class Course {

    private String courseNr;
    private String name;
    private String semester;

    protected Course(String courseNr, String name, String semester) {
        setCourseNr(courseNr);
        setName(name);
        setSemester(semester);
    }

    protected String getCourseNr() { return this.courseNr; }
    protected void setCourseNr(String courseNr) { this.courseNr = courseNr; }

    protected String getName() { return this.name; }
    protected void setName(String name) { this.name = name; }

    protected String getSemester() { return this.semester; }
    protected void setSemester(String semester) { this.semester = semester; }

} // of class Course
