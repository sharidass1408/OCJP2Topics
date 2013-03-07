--Need to understand more about indexes

CREATE INDEX PIndex
ON Persons (LastName, FirstName);

ALTER TABLE Persons DROP INDEX PIndex;