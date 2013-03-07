--Unique constraint on single coloum
CREATE TABLE PersonsWithCon_Unique
(
P_Id int ,
LastName varchar(255),
City varchar(255),
UNIQUE (P_Id)
);

--Unique constraint on multiple columns
CREATE TABLE PersonsWithCon_UniqueforMultiplecoloum
(
P_Id int,
LastName varchar(255),
City varchar(255),
CONSTRAINT uc_PersonID UNIQUE (P_Id,LastName)
);

--Altering a particular column in a table to add unique constrain
ALTER TABLE Persons
ADD UNIQUE (P_Id);

ALTER TABLE Persons
ADD CONSTRAINT uc_PersonID UNIQUE (P_Id,LastName);

--Drop a certain set of columns which are defined as unique
Alter table persons
Drop index uc_PersonID;



