--To understand this concept create a new table name Product_orders with OrderID, OrderDelivered, CustomerLastName

Create table Product_orders 
(
OrderID int,
OrderDelivered boolean,
CustomerLastName varchar(255)
);
insert into persons (OrderID, OrderDelivered, CustomerLastName) 
       values (12345, false, 'Sai');

Select * from Product_orders;
--SELECT statement without aliases:
SELECT Product_Orders.OrderID, Persons.LastName, Persons.FirstName
FROM Persons,
Product_Orders
WHERE Persons.LastName='Hansen' AND Persons.FirstName='Ola'

--Rewriting the select statement: 
SELECT po.OrderID, p.LastName, p.FirstName
FROM Persons AS p,
Product_Orders AS po
WHERE p.LastName='Hansen' AND p.FirstName='Ola';


--Actuall use of the Alias 
SELECT  p.LastName, p.FirstName,po.OrderDelivered
FROM Persons AS p,
Product_Orders AS po
WHERE p.LastName=po.CustomerLastName;






