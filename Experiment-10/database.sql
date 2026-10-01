CREATE DATABASE scsvmv_lab;
USE scsvmv_lab;
CREATE TABLE student (reg_no VARCHAR(10) PRIMARY KEY, name VARCHAR(40), marks INT);
INSERT INTO student VALUES ('101','Aravind',78), ('102','Divya',91);

/*
Execution:
Run this SQL script in MySQL.

Expected Result:
Database created: scsvmv_lab
Table created: student
Rows inserted:
101  Aravind  78
102  Divya    91

Verification Query:
SELECT * FROM student;

Query Output:
reg_no  name     marks
101     Aravind  78
102     Divya    91
*/