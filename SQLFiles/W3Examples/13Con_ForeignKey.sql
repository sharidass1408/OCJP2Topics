--The FOREIGN KEY constraint is used to prevent actions that would destroy links between tables.
--The FOREIGN KEY constraint also prevents that invalid data form being inserted into the foreign key column,
-- because it has to be one of the values contained in the table it points to.

CREATE TABLE Orders
(
O_Id int NOT NULL,
OrderNo int NOT NULL,
P_Id int,
PRIMARY KEY (O_Id),
FOREIGN KEY (P_Id) REFERENCES Persons(P_Id)
);

CREATE TABLE Orders1
(
O_Id int NOT NULL,
OrderNo int NOT NULL,
P_Id int,
PRIMARY KEY (O_Id),
CONSTRAINT fk_PerOrders FOREIGN KEY (P_Id)
REFERENCES Persons(P_Id)
);

drop table Orders1;

--ALTER TABLE Orders
--ADD FOREIGN KEY (P_Id) REFERENCES Persons(P_Id);

--Drop foreignKey
ALTER TABLE Orders1
DROP FOREIGN KEY fk_PerOrders;








