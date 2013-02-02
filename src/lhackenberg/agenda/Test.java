package lhackenberg.agenda;

public class Test {

    private int _id, course_id, date_unix, pts, pts_max, grade;

    protected Test(int _id, int course_id, int date_unix, int pts, int pts_max, int grade) {
        set_id(_id);
        setCourse_id(course_id);
        setDate_unix(date_unix);
        setPts(pts);
        setPts_max(pts_max);
        setGrade(grade);
    }

    @Override
    public String toString() {
        return get_id() + " " + getCourse_id() + " " + getDate_unix() + " "
                + getPts() + " " + getPts_max() + " " + getGrade();
    }

    protected int get_id() { return _id; }
    protected void set_id(int _id) { this._id = _id; }

    protected int getCourse_id() { return course_id; }
    protected void setCourse_id(int course_id) { this.course_id = course_id; }

    protected int getDate_unix() { return date_unix; }
    protected void setDate_unix(int date_unix) { this.date_unix = date_unix; }

    protected int getPts() { return pts; }
    protected void setPts(int pts) { this.pts = pts; }

    protected int getPts_max() { return pts_max; }
    protected void setPts_max(int pts_max) { this.pts_max = pts_max; }

    protected int getGrade() { return grade; }
    protected void setGrade(int grade) { this.grade = grade; }

} // of class Test
