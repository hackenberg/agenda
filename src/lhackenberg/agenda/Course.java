package lhackenberg.agenda;

public class Course {

    private String courseNr;
    private String name;
    private String semester;

    public Course(String courseNr, String name, String semester) {
        setCourseNr(courseNr);
        setName(name);
        setSemester(semester);
    }

    public String getCourseNr() { return this.courseNr; }
    public void setCourseNr(String courseNr) { this.courseNr = courseNr; }

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public String getSemester() { return this.semester; }
    public void setSemester(String semester) { this.semester = semester; }

} // of class Course
