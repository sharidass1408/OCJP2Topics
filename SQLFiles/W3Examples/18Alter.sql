-- To add a column named "DateOfBirth" in the "Persons" table.
ALTER TABLE Persons
ADD DateOfBirth date;

select * from Persons;

-- Alter to drop DateOfBirth column from Persons table
ALTER TABLE Persons
DROP COLUMN DateOfBirth;