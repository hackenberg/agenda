BEGIN;
    CREATE TABLE IF NOT EXISTS courses
        ( courseNr STRING NOT NULL
        , name     STRING
        , semester STRING NOT NULL
        , PRIMARY KEY (courseNr, semester)
        )
    ;
END;