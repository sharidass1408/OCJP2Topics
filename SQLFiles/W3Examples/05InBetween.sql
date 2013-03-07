
--IN
Select * from Persons where FirstName in ('Haridass','ola');

--Between 
--//This basically orders the table by your coloum and then does the Between operator
--//ie. the below statement is equalent to 
--Select * from Persons  WHERE LastName BETWEEN 'Hansen' AND 'Pettersen' order by Lastname;
SELECT * FROM Persons WHERE LastName BETWEEN 'Hansen' AND 'Pettersen';

Select * from Persons where LastName between  'Hansen' and 'Sai';

--Not Between

Select * from Persons where LastName not between  'Hansen' and 'Sai';
