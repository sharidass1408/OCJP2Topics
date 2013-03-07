-- We need to use joins when we want Different columns from different tables base on some condition 
-- and the condition would normally involve primary key of of one table. 

--Created table orders to show demo joins
CREATE TABLE Orders(
O_Id int PRIMARY KEY,
OrderNo varchar(255),
P_Id int
);

-- Inner join
SELECT P.LastName, P.FirstName, O.OrderNo
FROM Persons as P 
INNER JOIN Orders as O
ON P.P_Id=O.P_Id;

--Left join
SELECT P.LastName, P.FirstName, O.OrderNo
FROM Persons as P
LEFT JOIN Orders as O
ON P.P_Id=O.P_Id;

--Right Join
SELECT P.LastName, P.FirstName, O.OrderNo
FROM Persons as P
RIGHT JOIN Orders as O
ON P.P_Id=O.P_Id;

--Full Join sql does not support this functionality
--SELECT P.LastName, P.FirstName, O.OrderNo
--FROM Persons as P
--FULL outer JOIN Orders
--ON P.P_Id=O.P_Id;










