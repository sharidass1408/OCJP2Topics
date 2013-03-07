
CREATE TABLE PersonswithPrimaryKey
(
P_Id int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255),
PRIMARY KEY (P_Id)
);

--To allow naming of a PRIMARY KEY constraint, and for defining 
--a PRIMARY KEY constraint on multiple columns, use the following SQL syntax
--
--In the example above there is only ONE PRIMARY KEY (pk_PersonID).
--However, the value of the pk_PersonID is made up of two columns (P_Id and LastName).
CREATE TABLE PersonsWithMulitipleColumsasPrimary
(
P_Id int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255),
CONSTRAINT pk_PersonID PRIMARY KEY (P_Id,LastName)
);

--Altering table to create a make a column a Primary key
ALTER TABLE Persons
ADD PRIMARY KEY (P_Id);

--Altering couple of columns to make them Primary Key
ALTER TABLE Persons
ADD CONSTRAINT pk_PersonID PRIMARY KEY (P_Id,LastName);

--Dropping Primary key constraint
ALTER TABLE Persons
drop Primary key;
