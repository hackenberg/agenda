package lhackenberg.agenda;

import java.sql.*;

/*
TODO: The course number is not sufficient as primary key.
      A course may exist for multiple semesters.
*/

public class Database {

    private static final String dbPath = "agenda.sqlite";
    private static final String jdbc = "jdbc:sqlite";
    private static final String dbUrl = jdbc + ":" + dbPath;
    private static final String createTable =
            "CREATE TABLE IF NOT EXISTS courses"
                + "( courseNr INTEGER PRIMARY KEY"
                + ", name TEXT"
                + ", semester TEXT"
                + ");";

    /**
     * Class Constructor
     */
    protected Database() {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createTable);
        } catch (SQLException e) {
            System.err.println("Error establishing Connection to Database...");
            System.err.println(e);
            System.exit(1);
        }
    }

    /**
     * Establishes a connection to the database.
     * @return Connection
     */
    private static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(dbUrl);
        } catch (ClassNotFoundException e) {
            System.err.println("Database driver not available...");
        } catch (SQLException e) {
            System.err.println("Cannot connect to database...");
        }
        return conn;
    }

    /**
     * Inserts a new Course into the database, with the provided parameters.
     * @param courseNr
     * @param name
     * @param semester
     */
    protected void insert(String courseNr, String name, String semester) {
        String insert = "INSERT INTO courses"
                + "(courseNr, name, semester)"
                + "VALUES (?, ?, ?);";
        Connection conn = getConnection();
        try {
            PreparedStatement pstmt = conn.prepareStatement(insert);
            pstmt.setString(1, courseNr);
            pstmt.setString(2, name);
            pstmt.setString(3, semester);
            pstmt.execute();
        } catch (SQLException e) {
            System.err.println("Cannot execute update...");
            System.err.println(e);
        }
    }

    /**
     * Inserts a Course object into the database.
     * @param course
     */
    protected void insert(Course course) {
        String insert = "INSERT INTO courses"
                + "(courseNr, name, semester)"
                + "VALUES (?, ?, ?);";
        Connection conn = getConnection();
        try {
            PreparedStatement pstmt = conn.prepareStatement(insert);
            pstmt.setString(1, course.getCourseNr());
            pstmt.setString(2, course.getName());
            pstmt.setString(3, course.getSemester());
            pstmt.execute();
        } catch (SQLException e) {
            System.err.println("Cannot execute update...");
            System.err.println(e);
        }
    }

    /**
     * Deletes a course from the database.
     * @param courseNr
     */
    protected void delete(String courseNr) {
        String delete = "DELETE FROM courses WHERE courses.courseNr == ?";
        try {
            PreparedStatement pstmt = getConnection().prepareStatement(delete);
            pstmt.setString(1, courseNr);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Cannot execute update...");
            System.err.println(e);
        }
    }

    /**
     * Prints all courses in the database.
     * @return String representing all courses
     */
    @Override
    public String toString() {
        String courses = "";
        Connection conn = getConnection();
        try {
            Statement stmt = conn.createStatement();
            ResultSet results = stmt.executeQuery("SELECT * FROM courses");
            while (results.next()) {
                courses += results.getString("courseNr") + " ";
                courses += results.getString("name") + " ";
                courses += results.getString("semester") + "\n";
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query...");
            System.err.println(e);
        }
        return courses;
    }

} // of class Database
