BEGIN;
    CREATE TABLE courses
        ( _id      INTEGER PRIMARY KEY AUTOINCREMENT
        , courseNr STRING NOT NULL
        , name     STRING
        , semester STRING NOT NULL
        , grade    INTEGER CHECK (1 <= grade <= 5) DEFAULT NULL
        , UNIQUE (courseNr, semester)
        )
    ;
    CREATE TABLE assignments
        ( _id       INTEGER PRIMARY KEY AUTOINCREMENT
        , course_id INTEGER NOT NULL
        , date_unix INTEGER
        , pts       INTEGER DEFAULT NULL
        , pts_max   INTEGER DEFAULT NULL
        , FOREIGN KEY (course_id) REFERENCES courses(_id)
        )
    ;
    CREATE TABLE lectures
        ( _id       INTEGER PRIMARY KEY AUTOINCREMENT
        , course_id INTEGER NOT NULL
        , date_unix INTEGER
        , FOREIGN KEY (course_id) REFERENCES courses(_id)
        )
    ;
    CREATE TABLE tests
        ( _id       INTEGER PRIMARY KEY AUTOINCREMENT
        , course_id INTEGER NOT NULL
        , date_unix INTEGER
        , pts       INTEGER DEFAULT NULL
        , pts_max   INTEGER DEFAULT NULL
        , grade     INTEGER CHECK (1 <= grade <= 5) DEFAULT NULL
        , FOREIGN KEY (course_id) REFERENCES courses(_id)
        )
    ;
END;