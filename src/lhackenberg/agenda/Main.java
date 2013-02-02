package lhackenberg.agenda;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        DbHelper dbHelper = DbHelper.getInstance();
        String[] tables = { "courses", "assignments", "lectures", "tests"};

        // dispatch
        if (args.length == 0) {
            System.err.println("TODO: usage");
            System.exit(1);

        } else if (args[0].equals("print")) {
            System.out.println(dbHelper.dumpCourses());
            ArrayList<Assignment> assignments = dbHelper.dumpAssignments();
            for (Assignment assignment : assignments) {
                System.out.println(assignment);
            }
            //System.out.println(dbHelper.dump("lectures"));
            //System.out.println(dbHelper.dump("tests"));

        } else {
            System.err.println("TODO: usage");
            System.exit(1);
        }

    }

}
