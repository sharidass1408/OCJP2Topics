insert into `persons` (`P_Id`, `LastName`, `FirstName`, `Address`, `City`) values(1, 'Hansen', 'Ola', '	Timoteivn 10', 'Sandnes')
insert into `persons` (`P_Id`, `LastName`, `FirstName`, `Address`, `City`) values(2, 'Svendson', 'Tove', 'Borgvn 23', 'Sandnes')
insert into `persons` (`P_Id`, `LastName`, `FirstName`, `Address`, `City`) values(3, 'Pettersen', 'Kari', 'Storgt 20', 'Stavanger')

delete from `persons` where `P_Id`=3 and `LastName`='Pettersen' and `FirstName`='Kari' and `Address`='Storgt 20' and `City`='Stavanger'

--or 

insert into persons (P_Id, LastName, FirstName, Address, City) 
       values(3, 'Sai', 'Haridass', '220 W Michigan Ave', 'Ypsillanti');

insert into students (rollno,name,quant,verbal,total) values(2,'sowji',700,600,1300);
insert into students (rollno,name,quant,verbal,total) values(3,'veena',700,700,1400);
insert into students (rollno,name,quant,verbal,total) values(4,'puja',700,720,1420);
insert into students (rollno,name,quant,verbal,total) values(5,'ankitha',800,750,1550);
			
			
			
	
       
       
update Persons set P_Id='4' where LastName = 'Sai';

delete from persons where P_Id=3 and LastName='Pettersen' and FirstName='Kari' and Address='Storgt 20' and City='Stavanger';

select * from persons;

