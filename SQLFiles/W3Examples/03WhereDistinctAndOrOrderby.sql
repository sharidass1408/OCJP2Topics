select * from Persons;

--Where
SELECT * FROM Persons WHERE City='Sandnes';

--Distinct
select distinct City from persons;

--And
select * from Persons where LastName='Sai'and city='Ypsillanti';


--Or
select * from Persons where LastName='Sai' or firstName='haridass';

--Orderby
select * from Persons order by LastName;
