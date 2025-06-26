
ALTER TABLE Employee ADD emp_skill VARCHAR2(200);

/*
UPDATE Employee SET emp_skill = 'Java Development' WHERE emp_id = 1;
UPDATE Employee SET emp_skill = 'Angular Development' WHERE emp_id = 2;
UPDATE Employee SET emp_skill = 'Data Analytics' WHERE emp_id = 3;
UPDATE Employee SET emp_skill = 'Project Management' WHERE emp_id = 4;
UPDATE Employee SET emp_skill = 'DevOps Engineering' WHERE emp_id = 5;
UPDATE Employee SET emp_skill = 'UI/UX Design' WHERE emp_id = 6;
UPDATE Employee SET emp_skill = 'Database Administration' WHERE emp_id = 7;
UPDATE Employee SET emp_skill = 'Quality Assurance' WHERE emp_id = 8;
*/

SELECT column_name, data_type, data_length, nullable 
FROM user_tab_columns 
WHERE table_name = 'EMPLOYEE' 
ORDER BY column_id;
