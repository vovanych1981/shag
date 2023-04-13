SELECT FirstName, LastName, DateOfBirth, DateOfAdmission, DateOfDischarge
FROM Patients
WHERE YEAR(GETDATE()) - YEAR(DateOfAdmission) = 1 AND 
YEAR(GETDATE()) - YEAR(DateOfDischarge) = 1 
AND 
MONTH(DateOfAdmission) > 10
AND 
MONTH(DateOfDischarge) BETWEEN 10 AND 12