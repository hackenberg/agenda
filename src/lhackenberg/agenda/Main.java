package lhackenberg.agenda;

public class Main {

    public static void main(String[] args) {

        Database courses = new Database();
        addCourseToDb(new Course("1", "name1", "semester1"), courses);

        if (args[0].equals("print")) {
            System.out.println(courses);
        } else {
            System.out.println("TODO: usage");
        }

    }

    private static void addCourseToDb(Course course, Database db) {
        db.insert(course.getCourseNr(), course.getName(), course.getSemester());
    }

}
