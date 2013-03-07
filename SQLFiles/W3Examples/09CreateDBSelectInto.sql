
--To create back up for the table Persons in the same database create a table with same
--structure and then run the statement insert into. 

Create table orders_Backup(
O_Id int,
OrderNo varchar(255),
P_Id int
);

--select * from orders_backup;
Insert into orders_Backup select * from orders;

--To create back up for the table in a different data base create a different database and aslo the table 
--then run insert into statement.  

Create database w3schoolbackup;

--For creating table in different database connect to w3schoolbackup
Create table orders_Backup(
O_Id int,
OrderNo varchar(255),
P_Id int
);

--For executing below insert switch back to w3schoolexamples database
--Insert into orders_backup in w3schoolbackup.orders_backup inselect * from orders;





