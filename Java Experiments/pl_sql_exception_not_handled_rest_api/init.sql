CREATE USER mera_username WITH PASSWORD 'mera_password';
ALTER USER mera_username WITH SUPERUSER CREATEDB;

DROP TABLE IF EXISTS Student CASCADE;
DROP TABLE IF EXISTS Department CASCADE;
DROP FUNCTION IF EXISTS get_student_details(INT);

CREATE TABLE Department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(100) NOT NULL
);

CREATE TABLE Student (
    id INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    department_id INT
);

INSERT INTO Department (department_id, department_name) VALUES 
(1, 'Computer Science'),
(2, 'Electrical Engineering');

-- Alice (101) and Bob (102) have valid departments. Charlie (103) has an orphaned/invalid department.
INSERT INTO Student (id, name, age, department_id) VALUES 
(101, 'Alice', 20, 1),
(102, 'Bob', 22, 2),
(103, 'Charlie', 21, 99);

-- PL/pgSQL Function that intentionally throws an error for missing/null departments
CREATE OR REPLACE FUNCTION public.get_student_details(p_student_id INT)
RETURNS TABLE (
    out_id INT,
    out_name VARCHAR,
    out_age INT,
    out_department_id INT,
    out_department_name VARCHAR
) AS $$
DECLARE
    v_dept_name VARCHAR;
    v_dept_id INT;
BEGIN
    -- Check department name first
    SELECT d.department_name, s.department_id 
    INTO v_dept_name, v_dept_id
    FROM Student s
    LEFT JOIN Department d ON s.department_id = d.department_id
    WHERE s.id = p_student_id;

    -- If department data is missing/null (like for ID 103), throw an explicit runtime exception
    IF v_dept_name IS NULL THEN
        RAISE EXCEPTION 'DATA_INTEGRITY_ERROR: Department reference missing or invalid for Student ID % (Department ID: %)', p_student_id, v_dept_id;
    END IF;

    -- Otherwise, return the normal student details
    RETURN QUERY
    SELECT 
        s.id,
        s.name,
        s.age,
        s.department_id,
        d.department_name  
    FROM Student s
    JOIN Department d ON s.department_id = d.department_id
    WHERE s.id = p_student_id;
END;
$$ LANGUAGE plpgsql;
