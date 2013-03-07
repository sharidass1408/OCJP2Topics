
--To create a table with a field defined as AutoIncrement
CREATE TABLE Persons4
(
P_Id int NOT NULL AUTO_INCREMENT,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255),
PRIMARY KEY (P_Id)
);

select * from Persons4;