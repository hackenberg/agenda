package lhackenberg.agenda;

public class Course {

    private int _id, grade;
    private String courseNr, name, semester;

    protected Course(int _id, String courseNr, String name, String semester, int grade) {
        set_id(_id);
        setCourseNr(courseNr);
        setName(name);
        setSemester(semester);
        setGrade(grade);
    }

    @Override
    public String toString() {
        return get_id() + " " + getCourseNr() + " " + getName() + " "
                + getSemester() + " " + getGrade();
    }

    protected int get_id() { return _id; }
    protected void set_id(int _id) { this._id = _id; }

    protected String getCourseNr() { return this.courseNr; }
    protected void setCourseNr(String courseNr) { this.courseNr = courseNr; }

    protected String getName() { return this.name; }
    protected void setName(String name) { this.name = name; }

    protected String getSemester() { return this.semester; }
    protected void setSemester(String semester) { this.semester = semester; }

    protected int getGrade() { return grade; }
    protected void setGrade(int grade) { this.grade = grade; }

} // of class Course
