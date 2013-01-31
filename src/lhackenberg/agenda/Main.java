package lhackenberg.agenda;

public class Main {

    public static void main(String[] args) {

        Database courses = new Database();

        // test case
        courses.insert("99", "testName", "testSemester");
        System.out.println(courses);
        courses.delete("99");

        // dispatch
        if (args[0].equals("add") && args.length > 3) {
            courses.insert(args[1], args[2], args[3]);

        } else if (args[0].equals("print")) {
            System.out.println(courses);

        } else {
            System.out.println("TODO: usage");
            System.exit(1);
        }

    }

}
