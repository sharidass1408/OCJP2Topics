--Droping index
ALTER TABLE Persons DROP INDEX PIndex;

--Droping table
Drop table persons3;

--Droping Database
Drop database W3schoolbackup;

--To delete data from the table. 
Truncate employees_norway;

show tables;

--Need to understand below statements
select * from employees_norway;

SET autocommit = 0;

ROLLBACK;