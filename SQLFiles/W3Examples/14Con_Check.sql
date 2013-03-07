-- This is not working as expected. 

CREATE TABLE Persons1
(
P_Id int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255),
CHECK (P_Id>1)
);

select * from persons1;
drop table Persons1;

insert into `persons1` (`P_Id`, `LastName`, `FirstName`, `Address`, `City`) values(-1, 'sai', 'alsjk', 'djkas','haroi');

CREATE TABLE Persons1
(
P_Id int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255),
CONSTRAINT chk_Person CHECK (P_Id>0 AND City='Sandnes')
);


--Alter to add check 
ALTER TABLE Persons1
ADD CHECK (P_Id>0)


--Alter to add check for mulitiple coloumns
ALTER TABLE Persons1
ADD CONSTRAINT chk_Person CHECK (P_Id>0 AND City='Sandnes')

--Alter to drop check
ALTER TABLE Persons1
DROP CHECK chk_Person;