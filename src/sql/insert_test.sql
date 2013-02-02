BEGIN;

    INSERT INTO courses (courseNr, name, semester)
            VALUES ("1", "course1", "semester1");
    INSERT INTO courses (courseNr, name, semester)
            VALUES ("2", "course2", "semester2");
    INSERT INTO courses (courseNr, name, semester)
            VALUES ("3", "course3", "semester3");
    INSERT INTO courses (courseNr, name, semester)
            VALUES ("4", "course4", "semester4");
    INSERT INTO courses (courseNr, name, semester)
            VALUES ("5", "course5", "semester5");

    INSERT INTO assignments (course_id, date_unix) VALUES ("1", 0);
    INSERT INTO assignments (course_id, date_unix) VALUES ("1", 0);
    INSERT INTO assignments (course_id, date_unix) VALUES ("3", 0);
    INSERT INTO assignments (course_id, date_unix) VALUES ("4", 0);
    INSERT INTO assignments (course_id, date_unix) VALUES ("5", 0);

    INSERT INTO lectures (course_id, date_unix) VALUES ("1", 0);
    INSERT INTO lectures (course_id, date_unix) VALUES ("2", 0);
    INSERT INTO lectures (course_id, date_unix) VALUES ("3", 0);
    INSERT INTO lectures (course_id, date_unix) VALUES ("4", 0);
    INSERT INTO lectures (course_id, date_unix) VALUES ("5", 0);

    INSERT INTO tests (course_id, date_unix) VALUES ("1", 0);
    INSERT INTO tests (course_id, date_unix) VALUES ("1", 0);
    INSERT INTO tests (course_id, date_unix) VALUES ("3", 0);
    INSERT INTO tests (course_id, date_unix) VALUES ("4", 0);
    INSERT INTO tests (course_id, date_unix) VALUES ("5", 0);

END;