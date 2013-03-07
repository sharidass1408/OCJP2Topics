-- Union must be used when you would like to get the entries of a single colum from two tables for example 
-- employess of company from different branches
Create table Employees_Norway (
E_ID int,
E_Name varchar(255)
);

Create table Employees_USA (
E_ID int,
E_Name varchar(255)
);

-- produces a cartesian product
Select * from Employees_USA, Employees_Norway;

Select E_ID from Employees_USA, Employees_Norway;

SELECT E_Name FROM Employees_Norway
UNION
SELECT E_Name FROM Employees_USA;
