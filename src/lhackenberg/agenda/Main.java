package lhackenberg.agenda;

public class Main {

    public static void main(String[] args) {

        Database courses = new Database();

        if (args[0].equals("print")) {
            System.out.println(courses);
        } else {
            System.out.println("TODO: usage");
        }

    }

}
