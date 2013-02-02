package lhackenberg.agenda;

public class Lecture {

    private int _id, course_id, date_unix;

    protected Lecture(int _id, int course_id, int date_unix) {
        set_id(_id);
        setCourse_id(course_id);
        setDate_unix(date_unix);
    }

    @Override
    public String toString() {
        return get_id() + " " + getCourse_id() + " " + getDate_unix();
    }

    protected int get_id() { return _id; }
    protected void set_id(int _id) { this._id = _id; }

    protected int getCourse_id() { return course_id; }
    protected void setCourse_id(int course_id) { this.course_id = course_id; }

    protected int getDate_unix() { return date_unix; }
    protected void setDate_unix(int date_unix) { this.date_unix = date_unix; }

} // of class Lecture
