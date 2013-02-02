#!/bin/bash
#
#
#

sqlite3.exe agenda.sqlite < ./src/sql/drop_test.sql
sqlite3.exe agenda.sqlite < ./src/sql/create_test.sql
sqlite3.exe agenda.sqlite < ./src/sql/insert_test.sql