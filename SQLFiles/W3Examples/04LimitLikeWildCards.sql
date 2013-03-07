--Limit
Select * from persons limit 2;

--Like
Select * from persons where city like 's%';

--Not Like
Select * from persons where city not like '%sa%';


--WilCard

--Replacing single charater with single wildCard

SELECT * FROM Persons WHERE FirstName LIKE '_la';

SELECT * FROM Persons WHERE FirstName LIKE 'H_rid_ss';

--Replacing a single chare
--SELECT * FROM Persons WHERE FirstName LIKE '[HK]%';

--SELECT * FROM Persons WHERE FirstName LIKE '[!HK]%';