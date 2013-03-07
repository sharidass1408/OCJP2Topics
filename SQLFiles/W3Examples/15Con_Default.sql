--The default value will be added to all new records, if no other value is specified.
CREATE TABLE Persons3
(
P_Id int NOT NULL,
LastName varchar(255) NOT NULL,
FirstName varchar(255),
Address varchar(255),
City varchar(255) DEFAULT 'Sandnes'
);

insert into `persons3` (`P_Id`, `LastName`, `FirstName`, `Address`) values(1, 'sai', 'harid','Mich');

select * from persons3;

--The DEFAULT constraint can also be used to insert system values, by using functions like GETDATE():

CREATE TABLE Orders3
(
O_Id int NOT NULL,
OrderNo int NOT NULL,
P_Id int,
OrderTime date DEFAULT CURTIME()
);

--To  alter the table to make them default
ALTER TABLE Persons3
ALTER City SET DEFAULT 'SANDNES'

--Drop a default 
ALTER TABLE Persons
ALTER City DROP DEFAULT;


