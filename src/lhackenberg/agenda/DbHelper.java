package lhackenberg.agenda;

import java.sql.*;
import java.util.ArrayList;

/**
 * Singleton
 */
public class DbHelper {

    private static final String dbPath = "agenda.sqlite";
    private static final String jdbc = "jdbc:sqlite";
    private static final String dbUrl = jdbc + ":" + dbPath;
    private static final String createCourses =
            "CREATE TABLE IF NOT EXISTS courses"
                    + "( courseNr INTEGER NOT NULL"
                    + ", semester TEXT NOT NULL"
                    + ", object BLOB NOT NULL"
                    + ", PRIMARY KEY (courseNr, semester)"
                    + ");";

    private static DbHelper instance = new DbHelper();

    /**
     * Class Constructor
     */
    protected DbHelper() {
        try {
            Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(createCourses);
        } catch (SQLException e) {
            System.err.println("Error establishing Connection to Database...");
            System.exit(1);
        }
    }

    protected static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(dbUrl);
        } catch (ClassNotFoundException e) {
            System.err.println("Database driver not available...");
            System.exit(1);
        } catch (SQLException e) {
            System.err.println("Cannot connect to database...");
            System.exit(1);
        }
        return conn;
    }

    protected static DbHelper getInstance() {
        return instance;
    }

    protected ArrayList<Assignment> dumpAssignments() {
        ArrayList<Assignment> result = new ArrayList<Assignment>();
        try {
            Statement stmt = getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM assignments");
            while (res.next()) {
                result.add(new Assignment( res.getInt("_id")
                                         , res.getInt("course")
                                         , res.getInt("date_unix")
                                         , res.getInt("pts")
                                         , res.getInt("pts_max")
                                         ));
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query...");
        }
        return result;
    }

    protected String dumpCourses() {
        String result = "";
        try {
            Statement stmt = getConnection().createStatement();
            ResultSet res = stmt.executeQuery("SELECT * FROM courses");
            while (res.next()) {
                result += res.getInt("_id") + " ";
                result += res.getString("courseNr") + " ";
                result += res.getString("name") + " ";
                result += res.getString("semester") + "\n";
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query...");
        }
        return result;
    }

}
